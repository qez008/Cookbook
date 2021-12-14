package dsl

import blank
import dsl.Recipe.Entry
import dsl.TableRecipe.Row


sealed class Recipe {

    open class Entry(val id: String, val num: Int = 1) : Comparable<Entry> {

        init {
            assert(num >= 1)
        }

        override fun compareTo(other: Entry) = this.id.compareTo(other.id)

        override fun toString() = if (num == 1) id else "$id:$num"

        override fun equals(other: Any?) = other is Entry && this.id == other.id && this.num == other.num

        override fun hashCode() = 31 * id.hashCode() + num

    }

    object Blank : Entry(blank)

}


data class ListRecipe(val items: List<Entry>) : Recipe(), Collection<Entry>, Iterable<Entry> {

    override val size = items.size

    override fun iterator() = items.iterator()

    override fun contains(element: Entry) = items.contains(element)

    override fun containsAll(elements: Collection<Entry>) = items.containsAll(elements)

    override fun isEmpty() = items.isEmpty()
}


data class TableRecipe(val rows: List<Row>) : Recipe(), Collection<Row>, Iterable<Row> {

    data class Row(val items: List<Entry>) : Collection<Entry>, Iterable<Entry> {

        override val size = items.size

        override fun iterator(): Iterator<Entry> = items.iterator()

        override fun contains(element: Entry) = items.contains(element)

        override fun containsAll(elements: Collection<Entry>) = items.containsAll(elements)

        override fun isEmpty() = items.isEmpty()
    }

    override fun iterator(): Iterator<Row> = rows.iterator()

    override val size = rows.size

    override fun contains(element: Row) = rows.contains(element)

    override fun containsAll(elements: Collection<Row>) = rows.containsAll(elements)

    override fun isEmpty() = rows.isEmpty()
}

fun entry(str: String): Entry =
    if (':' in str) {
        val (id, num) = str.split(":")
        Entry(id, num.toInt())
    } else {
        Entry(str)
    }


/*
 creates a list (row) of items
 */
fun list(vararg items: String) = ListRecipe(items.filter { it != blank }.map(::entry).sorted())


/*
 creates a table and applies a block to the input list
 */
fun table(block: MutableList<Row>.() -> Unit): TableRecipe {

    val rows = mutableListOf<Row>().apply(block)
    val tidyRows = tidyTable(rows)

    return TableRecipe(tidyRows)
}


fun tidyTable(rows: List<Row>): List<Row> {

    // pad to the longest length row
    val longestRow = rows.maxOf { it.size }
    val paddedRows = rows.map { row ->
        val diff = longestRow - row.size
        val newRow = (row + List(diff) { Recipe.Blank })
        newRow
    }

    val mutableRows = paddedRows
        .dropWhile { r -> r.all { item -> item == Recipe.Blank } }     // remove leading blank rows
        .dropLastWhile { r -> r.all { item -> item == Recipe.Blank } } // remove trailing blank rows
        .map { it.toMutableList() }                             // convert rows to mutableRows

    // remove leading blank columns
    while (mutableRows.map { it.first() }.all { it == Recipe.Blank }) {
        for (row in mutableRows) {
            row.removeAt(0)
        }
    }
    // remove trailing blank columns
    while (mutableRows.map { it.last() }.all { it == Recipe.Blank }) {
        for (row in mutableRows) {
            row.removeLast()
        }
    }

    return mutableRows.map(TableRecipe::Row)
}


/*
 creates and adds a row of items
 */
fun MutableList<Row>.row(vararg items: String) {
    add(Row(items.map(::entry)))
}

infix fun String.amount(num: Int): String =
    when {
        this == blank -> error("$blank can not have an amount!")
        num < 1 -> error("only positive amounts are supported. $this:$num")
        num == 1 -> this // ignore the amount as 1 is the default
        else -> "$this:$num"
    }


// simple main function for example
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
