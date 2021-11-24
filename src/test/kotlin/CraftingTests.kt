import org.antlr.v4.runtime.CharStreams
import org.junit.Assert.assertEquals
import org.junit.Test

class CraftingTests {

    private val input = CharStreams.fromFileName("example")
    private val program = program(input)

    @Test
    fun `crafting buckets`() {

        val bucketA = listOf(
            listOf("wood", "_", "wood"),
            listOf("wood", "_", "wood"),
            listOf("_", "wood", "_")
        )
        val bucketB = listOf(
            listOf("iron", "_", "iron"),
            listOf("iron", "_", "iron"),
            listOf("_", "iron", "_")
        )
        val bucketC = listOf(
            listOf("iron", "_", "iron"),
            listOf("iron", "_", "iron"),
            listOf("_", "wood", "_")
        )

        val bucketD = listOf(
            listOf("gold", "_", "iron"),
            listOf("iron", "_", "iron"),
            listOf("_", "wood", "_")
        )

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
        val swordA = listOf(
            listOf("wood"),
            listOf("wood"),
            listOf("hilt")
        )
        val swordB = listOf(
            listOf("stone"),
            listOf("stone"),
            listOf("wood")
        )
        val swordC = listOf(
            listOf("stone"),
            listOf("wood"),
            listOf("hilt")
        )
        val swordD = listOf(
            listOf("stone"),
            listOf("stone"),
            listOf("hilt")
        )

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
        val axeA = listOf(
            listOf("dull"),
            listOf("stone"),
            listOf("handle"),
            listOf("handle"),
        )
        val axeB = listOf(
            listOf("sharp"),
            listOf("iron"),
            listOf("handle"),
            listOf("handle"),
        )

        val axes = listOf(axeA, axeB)
        val expected = listOf("[dull, stone] Axe", "[sharp, iron] Axe")

        for ((a, e) in axes zip expected) {
            val item = craft(a, program)
            println(item)
            assertEquals(e, item)
        }
    }
}