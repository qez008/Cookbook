import dsl.row
import dsl.table

import org.antlr.v4.runtime.CharStreams
import org.junit.Assert.assertEquals
import org.junit.Test

class CraftingTests {

    private val input = CharStreams.fromFileName("example")
    private val program = program(input)

    @Test
    fun `crafting buckets`() {

        val bucketA = table {
            row("wood", "_", "wood")
            row("wood", "_", "wood")
            row("_", "wood", "_")
        }
        val bucketB = table {
            row("iron", "_", "iron")
            row("iron", "_", "iron")
            row("_", "iron", "_")
        }
        val bucketC = table {
            row("iron", "_", "iron")
            row("iron", "_", "iron")
            row("_", "wood", "_")
        }

        val bucketD = table {
            row("gold", "_", "iron")
            row("iron", "_", "iron")
            row("_", "wood", "_")
        }

        val buckets = listOf(bucketA, bucketB, bucketC, bucketD)
        val expected = listOf("[wood] Bucket", "[iron] Bucket", "undefined", "undefined")

        for ((b, e) in buckets zip expected) {
            val item = craft(b, program)
            println(item)
            assertEquals(e, item)
        }
    }

    @Test
    fun `crafting swords`() {
        val swordA = table {
            row("wood")
            row("wood")
            row("hilt")
        }
        val swordB = table {
            row("stone")
            row("stone")
            row("wood")
        }
        val swordC = table {
            row("stone")
            row("wood")
            row("hilt")
        }
        val swordD = table {
            row("stone")
            row("stone")
            row("hilt")
        }

        val swords = listOf(swordA, swordB, swordC, swordD)
        val expected = listOf("[wood] Sword", "undefined", "undefined", "[stone] Sword")

        for ((s, e) in swords zip expected) {
            val item = craft(s, program)
            println(item)
            assertEquals(e, item)
        }
    }


    @Test
    fun `crafting axes`() {
        val axeA = table {
            row("dull")
            row("stone")
            row("handle")
            row("handle")
        }
        val axeB = table {
            row("sharp")
            row("iron")
            row("handle")
            row("handle")
        }

        val axes = listOf(axeA, axeB)
        val expected = listOf("[dull, stone] Axe", "[sharp, iron] Axe")

        for ((a, e) in axes zip expected) {
            val item = craft(a, program)
            println(item)
            assertEquals(e, item)
        }
    }
}
