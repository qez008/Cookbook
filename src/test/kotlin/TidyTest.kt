import dsl.Recipe
import dsl.TableRecipe
import dsl.TableRecipe.Row
import dsl.row
import dsl.table
import org.junit.Assert.assertEquals
import org.junit.Test

class TidyTest {

    @Test
    fun `tidy test 1`() {
        val input = table {
            row("iron:1", "_", "iron")
            row("iron", "_", "iron")
            row("_", "iron", "_")
        }

        val expected = table {
            row("iron", "_", "iron")
            row("iron", "_", "iron")
            row("_", "iron", "_")
        }

        val mutableRows = input
            .dropWhile { r -> r.maybeAll { item -> item == Recipe.Blank } }     // remove leading blank rows
            .dropLastWhile { r -> r.maybeAll { item -> item == Recipe.Blank } } // remove trailing blank rows
            .map { it.toMutableList() }                                         // convert rows to mutableRows
        // remove leading blank columns
        while (mutableRows.map { it.first() }.maybeAll { it == Recipe.Blank }) {
            for (row in mutableRows) {
                row.removeAt(0)
            }
        }
        // remove trailing blank columns
        while (mutableRows.map { it.last() }.maybeAll { it == Recipe.Blank }) {
            for (row in mutableRows) {
                row.removeLast()
            }
        }
        assertEquals(expected, TableRecipe(mutableRows.map(::Row)))
    }

    @Test
    fun `tidy test 2`() {
        val input = table {
            row("iron:2", "_", "iron")
            row("iron:1", "_", "iron:3")
            row("_", "iron", "_")
        }

        val expected = table {
            row("iron:2", "_", "iron")
            row("iron", "_", "iron:3")
            row("_", "iron", "_")
        }

        val mutableRows = input
            .dropWhile { r -> r.maybeAll { item -> item == Recipe.Blank } }     // remove leading blank rows
            .dropLastWhile { r -> r.maybeAll { item -> item == Recipe.Blank } } // remove trailing blank rows
            .map { it.toMutableList() }                                         // convert rows to mutableRows

        // remove leading blank columns
        while (mutableRows.map { it.first() }.maybeAll { it == Recipe.Blank }) {
            for (row in mutableRows) {
                row.removeAt(0)
            }
        }
        // remove trailing blank columns
        while (mutableRows.map { it.last() }.maybeAll { it == Recipe.Blank }) {
            for (row in mutableRows) {
                row.removeLast()
            }
        }
        assertEquals(expected, TableRecipe(mutableRows.map(::Row)))
    }

    @Test
    fun `tidy test 3`() {
        val input = table {
            row("iron", "_", "iron")
            row("iron", "_", "iron")
            row("_", "iron", "_")
        }

        val expected = table {
            row("iron", "_", "iron")
            row("iron", "_", "iron")
            row("_", "iron", "_")
        }

        val mutableRows = input
            .dropWhile { r -> r.maybeAll { item -> item == Recipe.Blank } }     // remove leading blank rows
            .dropLastWhile { r -> r.maybeAll { item -> item == Recipe.Blank } } // remove trailing blank rows
            .map { it.toMutableList() }                                         // convert rows to mutableRows

        // remove leading blank columns
        while (mutableRows.map { it.first() }.maybeAll { it == Recipe.Blank }) {
            for (row in mutableRows) {
                row.removeAt(0)
            }
        }
        // remove trailing blank columns
        while (mutableRows.map { it.last() }.maybeAll { it == Recipe.Blank }) {
            for (row in mutableRows) {
                row.removeLast()
            }
        }
        assertEquals(expected, TableRecipe(mutableRows.map(::Row)))
    }
}
