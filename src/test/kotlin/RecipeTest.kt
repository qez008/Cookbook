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
        val tableC = table {
            row("_", "a", "_")
            row("_", "b", "_")
            row("_", "c", "_")
        }

        val tables = listOf(tableA, tableB, tableC)

        val expectedTables = listOf(
            table {
                row("a", "b", "c")
            },
            table {
                row("a")
            },
            table {
                row("a")
                row("b")
                row("c")
            }
        )

        for ((expected, table) in (expectedTables zipOrNull tables) ?: zipError()) {
            assertEquals(expected, table)
        }
    }

    @Test
    fun `list test`() {
        val l = list("_", "a:1", "_", "b:2", "_")
        assertEquals(list("a", "b:2"), l)
    }
}