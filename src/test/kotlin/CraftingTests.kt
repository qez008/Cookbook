import dsl.list
import dsl.row
import dsl.table
import org.antlr.v4.runtime.CharStreams
import org.junit.Assert.assertEquals
import org.junit.Test

class CraftingTests {

    private val evaluator = Evaluator(CharStreams.fromFileName("example.cb"))

    @Test
    fun `crafting buckets`() {

        val woodenBucket = table {
            row("_", "_", "_", "_", "_")
            row("_", "wood", "_", "wood", "_")
            row("_", "wood", "_", "wood", "_")
            row("_", "_", "wood:2", "_", "_")
            row("_", "_", "_", "_", "_")
        }
        val ironBucket = table {
            row("iron:1", "_", "iron")
            row("iron", "_", "iron:1")
            row("_", "iron:3", "_")
        }
        val woodenIronBucket = table {
            row("iron", "_", "iron")
            row("iron", "_", "iron")
            row("_", "wood:1", "_")
        }
        val goldenBucket = table {
            row("gold", "_", "gold")
            row("gold", "_", "gold")
            row("_", "gold:2", "_")
        }
        val halfABucket = table {
            row("wood", "_")
            row("wood", "_")
            row("_", "wood:2")
        }

        val buckets = listOf(woodenBucket, ironBucket, woodenIronBucket, goldenBucket, halfABucket)
        val expected = listOf("[wood] Bucket", "[iron] Bucket", undefined, undefined, undefined)

        for ((b, e) in (buckets zzip expected) ?: zzipError()) {
            val item = evaluator.eval(b)
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
            row("blade")
            row("blade")
            row("hilt")
        }

        val swords = listOf(swordA, swordB, swordC, swordD)
        val expected = listOf("[wood] Sword", undefined, undefined, undefined)

        for ((s, e) in (swords zzip expected) ?: zzipError()) {
            val item = evaluator.eval(s)
            println(item)
            assertEquals(e, item)
        }
    }


    @Test
    fun `crafting axes`() {
        val axeA = table {
            row("dull", "_")
            row("stone", "stone")
            row("handle", "stone")
            row("handle", "_")
        }
        val axeB = table {
            row("sharp", "_")
            row("iron", "iron")
            row("handle", "iron")
            row("handle", "_")
        }

        val axes = listOf(axeA, axeB)
        val expectedAxes = listOf("[dull, stone] Axe", "[sharp, iron] Axe")

        for ((axe, expected) in (axes zzip expectedAxes) ?: zzipError()) {
            val item = evaluator.eval(axe)
            println(item)
            val msg = "\ninput: ${axe.rows.map { it.items }}"
            assertEquals(msg, expected, item)
        }
    }

    @Test
    fun `crafting stairs`() {
        val stairA = table {
            row("wood", "_", "_")
            row("wood", "wood", "_")
            row("wood", "wood", "wood")
        }
        val stairB = table {
            row("stone", "_", "_")
            row("stone", "stone", "_")
            row("stone", "stone", "stone")
        }

        val stairC = table {
            row("silk", "_", "_")
            row("silk", "silk", "_")
            row("silk", "silk", "silk")
        }

        val stairD = table {
            row("wood")
            row("wood")
            row("wood")
        }

        val expected = listOf("[wood] Stairs", "[stone] Stairs", undefined, undefined)
        val stairs = listOf(stairA, stairB, stairC, stairD)

        for ((e, s) in (expected zzip stairs) ?: zzipError()) {
            val result = evaluator.eval(s)
            println(result)
            assertEquals(e, result)
        }
    }


    @Test
    fun `crafting books`() {
        val bookA = list("paper", "paper", "paper", "leather")
        val bookB = list("leather", "paper", "paper", "paper")
        val bookC = list("paper", "leather", "paper", "paper")
        val bookD = list("paper", "paper", "leather", "paper")

        val bookE = list("paper:3", "leather")
        val bookF = list("leather", "paper:3")

        val books = listOf(bookA, bookB, bookC, bookD, bookE, bookF)
        val expected = listOf("Book", "Book", "Book", "Book", "BookAlt", "BookAlt")

        for ((b, e) in (books zzip expected) ?: zzipError()) {
            val result = evaluator.eval(b)
            println(result)
            assertEquals(e, result)
        }
    }

    @Test
    fun `crafting sandwiches`() {
        val sandwichA = list("bread", "bread", "pepperoni", "salad")
        val sandwichB = list("bread", "bread", "ham", "salad")
        val sandwichC = list("bread", "bread", "chicken", "salad")
        val sandwichD = list("bread", "bread", "wood", "salad")

        val expected = listOf("[pepperoni] Sandwich", "[ham] Sandwich", "[chicken] Sandwich", undefined)
        val sandwiches = listOf(sandwichA, sandwichB, sandwichC, sandwichD)

        for ((s, e) in sandwiches zzip expected ?: zzipError()) {
            val result = evaluator.eval(s)
            println(result)
            assertEquals(e, result)
        }
    }

    @Test
    fun `crafting slabs`() {

        val slabA = table { row("stone", "stone", "stone") }

        val result = evaluator.eval(slabA)
        println(result)
        assertEquals("Slab", result)
    }
}
