import dsl.*
import gen.CookbookLexer
import gen.CookbookParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream


const val undefined = "undefined"
const val blank = "_"

class Evaluator(stream: CharStream) {

    val lexer = CookbookLexer(stream)
    val tokens = CommonTokenStream(lexer)
    val parser = CookbookParser(tokens)
    val tree = parser.program()
    val cookbook = visit(tree)

    fun eval(row: Row) = craft(row, cookbook)
    fun eval(table: Table) = craft(table, cookbook)
}


fun tidyInput(table: Table): Table {
    fun transform(str: String): String {
        if (':' !in str) return str
        val (id, num) = str.split(":")
        return if (num.toInt() > 1) "$id:$num" else id
    }
    return table {
        for (row in table) {
            row(*row.map(::transform).toTypedArray())
        }
    }
}


fun craft(input: Row, cookbook: CookBook): String {
    for (entry in cookbook.definitions) {
        val item = craft(input, entry)
        if (item != undefined) return item
    }
    return undefined
}

fun craft(input: Row, def: CookBook.Definition): String {

    val recipe = (def.recipe as? ListRecipe)?.value ?: return undefined

    val typeOptions = def.materials
    val setTypes = mutableMapOf<String, String>()

    fun match(actual: String, expected: String): Boolean =
        when (expected) {
            actual -> true
            in setTypes -> setTypes[expected] == actual
            in typeOptions -> {
                if (typeOptions[expected]?.contains(actual) == true) {
                    setTypes[expected] = actual
                    true
                } else false
            }
            else -> false
        }

    val sortedInput = input.items.sorted()

    if ((sortedInput zip recipe).all { (actual, expected) -> match(actual, expected) }) {
        val itemType = if (setTypes.values.isEmpty()) "" else "${setTypes.values} "
        val itemID = def.name
        return "$itemType$itemID"
    }
    return undefined
}

fun craft(input: Table, cookbook: CookBook): String {
    val tidyInput = tidyInput(input)

    for (def in cookbook.definitions) {
        val item = craft(tidyInput, def)
        if (item != undefined) return item
    }
    return undefined
}

fun craft(input: Table, entry: CookBook.Definition): String {

    val recipe = (entry.recipe as? TableRecipe)?.value ?: return undefined

    val typeOptions = entry.materials
    val setTypes = mutableMapOf<String, String>()


    for ((expectedRow, actualRow) in recipe zip input) {
        val diff = (expectedRow.size - actualRow.items.size).coerceAtLeast(0)
        val padding = List(diff) { "_" }
        for ((expected, actual) in expectedRow zip (actualRow) + padding) {
            when (expected) {
                // if the recipe has a blank so should the input
                "_" -> {
                    if (actual != "_") return undefined
                }
                // if the type has already been set for expected the actual should match
                in setTypes -> {
                    if (setTypes[expected] != actual) return undefined
                }
                // if the type has not been set yet, set it to the first
                // occurrence if the first occurrence is an option
                in typeOptions -> {
                    if (typeOptions[expected]?.contains(actual) == true) {
                        setTypes[expected] = actual
                    } else {
                        return undefined
                    }
                }
                else -> {
                    if (expected != actual) return undefined
                }
            }
        }
    }
    val itemType = if (setTypes.values.isEmpty()) "" else "${setTypes.values} "
    val itemID = entry.name
    return "$itemType$itemID"
}
