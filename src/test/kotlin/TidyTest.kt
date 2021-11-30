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

        assertEquals(expected, tidyTable(input))
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

        assertEquals(expected, tidyTable(input))
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

        assertEquals(expected, tidyTable(input))
    }
}
