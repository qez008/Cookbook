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
    if (recipe.size != input.size) return undefined

    val setTypes = mutableMapOf<String, String>()

    try {
        if ((input.items zzip recipe) all { (a, b) -> match(a, b, setTypes, def.materials) }) {
            val itemType = if (setTypes.values.isEmpty()) "" else "${setTypes.values} "
            val itemID = def.name
            return "$itemType$itemID"
        }
    } catch (e: IllegalStateException) {
        return undefined
    }
    return undefined
}


private fun evalTable(input: TableRecipe, def: CookBook.Definition): String {

    val recipe = (def.recipe as? TableRecipe) ?: return undefined
    if (input.size != recipe.size) return undefined

    val setTypes = mutableMapOf<String, String>()

    try {
        for ((recipeRow, inputRow) in (recipe zzip input)) {
            if ((inputRow zzip recipeRow) any { (a, b) -> !match(a, b, setTypes, def.materials) }) {
                return undefined
            }
        }
    } catch (e: IllegalArgumentException) {
        return undefined
    }

    val itemType = if (setTypes.values.isEmpty()) "" else "${setTypes.values} "
    val itemID = def.name

    return "$itemType$itemID"
}

/**
 * This function mutates the [setTypes] parameter
 */
private fun match(
    actual: String,
    expected: String,
    setTypes: MutableMap<String, String>,
    materials: Materials
): Boolean =

    when (expected) {
        actual -> true
        in setTypes -> setTypes[expected] == actual
        in materials -> {
            if (materials[expected]?.contains(actual) == true) {
                setTypes[expected] = actual
                true
            } else false
        }
        else -> false
    }