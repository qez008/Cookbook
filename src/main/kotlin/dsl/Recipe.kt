package dsl

import blank

sealed class Recipe

/*
 a list of items (not to be confused with kotlin List
 */
data class ListRecipe(val items: List<String>) : Recipe(), Collection<String>, Iterable<String> {
    override val size = items.size

    override fun iterator(): Iterator<String> = items.iterator()

    override fun contains(element: String) = items.contains(element)

    override fun containsAll(elements: Collection<String>) = items.containsAll(elements)

    override fun isEmpty() = items.isEmpty()
}

/*
 a table of rows
 */
data class TableRecipe(val rows: List<Row>) : Recipe(), Collection<TableRecipe.Row>, Iterable<TableRecipe.Row> {

    /*
     a row of items
     */
    data class Row(val items: List<String>) : Collection<String>, Iterable<String> {
        override val size = items.size

        override fun iterator(): Iterator<String> = items.iterator()

        override fun contains(element: String) = items.contains(element)

        override fun containsAll(elements: Collection<String>) = items.containsAll(elements)

        override fun isEmpty() = items.isEmpty()
    }

    override fun iterator(): Iterator<Row> = rows.iterator()

    override val size = rows.size

    override fun contains(element: Row) = rows.contains(element)

    override fun containsAll(elements: Collection<Row>) = rows.containsAll(elements)

    override fun isEmpty() = rows.isEmpty()
}

private fun tidyTransform(str: String): String {
    if (':' !in str) return str
    val (id, num) = str.split(":")
    return if (num.toInt() > 1) "$id:$num" else id
}


/*
 creates a list (row) of items
 */
fun list(vararg items: String) = ListRecipe(items.filter { it != blank }.map(::tidyTransform).sorted())


/*
 creates a table and applies a block to the input list
 */
fun table(block: MutableList<TableRecipe.Row>.() -> Unit): TableRecipe {
    val rows = mutableListOf<TableRecipe.Row>().apply(block)
    val longestRow = rows.maxOf { it.size }
    val paddedRows = rows.map { row ->
        val diff = longestRow - row.size
        val newRow = (row + List(diff) { "_" })
        TableRecipe.Row(newRow)
    }
    val mutableRows = TableRecipe(paddedRows)
        .dropWhile { r -> r.all { item -> item == blank } }     // remove leading blank rows
        .dropLastWhile { r -> r.all { item -> item == blank } } // remove trailing blank rows
        .map { it.toMutableList() }                             // convert rows to mutableRows

    // remove leading blank columns
    while (mutableRows.map { it.first() }.all { it == blank }) {
        for (row in mutableRows) {
            row.removeAt(0)
        }
    }
    // remove trailing blank columns
    while (mutableRows.map { it.last() }.all { it == blank }) {
        for (row in mutableRows) {
            row.removeLast()
        }
    }
    return TableRecipe(mutableRows.map(TableRecipe::Row))
}

/*
 creates and adds a row of items
 */
fun MutableList<TableRecipe.Row>.row(vararg items: String) {
    add(TableRecipe.Row(items.map(::tidyTransform)))
}

infix fun String.amount(num: Int) =
    if (this == blank) error("$blank can not have an amount!")
    else if (num < 1) error("only positive amounts are supported. num:$num")
    else if (num == 1) this // ignore the amount as 1 is the default
    else "$this:$num"


// simple main function for sanity testing
fun main() {
    val t = table {
        row("wood" amount 10, "_", "wood")
        row("wood" amount 1, "_", "wood:1")
        row("_", "wood", "_")
    }
    for (row in t) {
        println(row.toList())
    }

    val l = list("a", "b", "c").items
    println(l)
}
