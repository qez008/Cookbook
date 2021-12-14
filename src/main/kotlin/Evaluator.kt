import dsl.*
import dsl.Recipe.Entry
import gen.CookbookLexer
import gen.CookbookParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream


const val undefined = "undefined"
const val blank = "_"

typealias Types = MutableMap<String, String>

class Evaluator(stream: CharStream) {

    val lexer = CookbookLexer(stream)
    val tokens = CommonTokenStream(lexer)
    val parser = CookbookParser(tokens)
    val tree = parser.program()
    val cookbook = visit(tree)

    fun eval(recipe: Recipe) = eval(recipe, cookbook)
}


private fun eval(input: Recipe, cookbook: CookBook): String {

    for (def in cookbook.definitions) {
        val item = when (input) {
            is ListRecipe -> evalList(input, def)
            is TableRecipe -> evalTable(input, def)
        }
        if (item != undefined) return item
    }
    return undefined
}

private fun evalList(input: ListRecipe, def: CookBook.Definition): String {

    val recipe = (def.recipe as? ListRecipe) ?: return undefined

    val setTypes = mutableMapOf<String, String>()

    val match = (recipe zzip input) all { (expected, actual) -> match(expected, actual, setTypes, def.materials) }

    return if (match) item(def, setTypes) else undefined
}


private fun evalTable(input: TableRecipe, def: CookBook.Definition): String {

    val recipe = (def.recipe as? TableRecipe) ?: return undefined
    val setTypes = mutableMapOf<String, String>()

    val match = (recipe zzip input) all { (recipeRow, inputRow) ->
        (recipeRow zzip inputRow) all { (expected, actual) ->
            match(expected, actual, setTypes, def.materials)
        }
    }
    return if (match) item(def, setTypes) else undefined
}

fun item(def: CookBook.Definition, setTypes: Types): String {
    // item prefix ex: [Prefix] Item
    val itemType = if (setTypes.values.isEmpty()) "" else "${setTypes.values} "
    val itemID = def.name

    return "$itemType$itemID"
}


/**
 * This function mutates the [setTypes] parameter
 */
private fun match(expected: Entry, actual: Entry, setTypes: Types, materials: Materials): Boolean =

    if (expected.num > actual.num) {
        false
    } else {
        when (expected.id) {
            in setTypes -> setTypes[expected.id] == actual.id
            in materials -> {
                if (materials[expected.id]!!.contains(actual.id)) {
                    setTypes[expected.id] = actual.id
                    true
                } else false
            }
            actual.id -> true
            else -> false
        }
    }
