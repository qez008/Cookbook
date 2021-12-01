package dsl

/*
 a row of items
 */
data class Row(val items: List<String>) : Iterable<String> {
    val size = items.size

    override fun iterator(): Iterator<String> = items.iterator()
}

/*
 a table of items
 */
data class Table(val rows: List<Row>) : Iterable<Row> {
    override fun iterator(): Iterator<Row> = rows.iterator()
}

/*
 creates a list (row) of items
 */
fun list(vararg items: String): Row = Row(items.toList())

/*
 creates a table and applies a block to the input list
 */
fun table(block: MutableList<Row>.() -> Unit): Table = Table(mutableListOf<Row>().apply(block))

/*
 creates and adds a row of items
 */
fun MutableList<Row>.row(vararg items: String) {
    add(list(*items))
}

// simple main function for sanity testing
fun main() {
    val t = table {
        row("wood", "_", "wood")
        row("wood", "_", "wood")
        row("_", "wood", "_")
    }
    for (row in t) {
        println(row.toList())
    }

    println(list("a", "b", "c").items)
}