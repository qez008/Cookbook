import dsl.list
import dsl.row
import dsl.table
import org.junit.Assert.assertEquals
import org.junit.Test

class RecipeTest {

    @Test
    fun `table test`() {
        val tableA = table {
            row("_", "_", "_")
            row("a", "b", "c")
            row("_", "_", "_")
        }
        val tableB = table {
            row("_", "_", "_")
            row("_", "a", "_")
            row("_", "_", "_")
        }

        val expectedTables = listOf(
            table { row("a", "b", "c") },
            table { row("a") },
        )
        val tables = listOf(tableA, tableB)

        for ((expected, table) in expectedTables zip tables) {
            assertEquals(expected, table)
        }
    }

    @Test
    fun `list test`() {
        val l = list("_", "a:1", "_", "b:2", "_")
        assertEquals(list("a", "b:2"), l)
    }
}