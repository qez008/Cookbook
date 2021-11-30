import dsl.Row
import dsl.Table
import dsl.row
import dsl.table
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

    fun eval(row: Row) = craft(row, tree)
    fun eval(table: Table) = craft(table, tree)
}

fun craft(input: Row, program: CookbookParser.ProgramContext): String {
    for (def in program.definition()) {
        val item = craft(input, def)
        if (item != undefined) return item
    }
    return undefined
}

fun craft(input: Row, def: CookbookParser.DefinitionContext): String {
    val listRecipe = def.recipe().list() ?: return undefined

    val typeOptions = mutableMapOf<String, Set<String>>()
    val setTypes = mutableMapOf<String, String>()

    fillTypeOptions(def.materials(), typeOptions)

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

    val expectedItems = listRecipe.row().entry().map { it.text }.sorted()
    val sortedInput = input.items.sorted()

    if ((sortedInput zip expectedItems).all { (actual, expected) -> match(actual, expected) }) {
        val itemType = if (setTypes.values.isEmpty()) "" else "${setTypes.values} "
        val itemID = def.ID()
        return "$itemType$itemID"
    }
    return undefined
}

fun craft(input: Table, program: CookbookParser.ProgramContext): String {
    val tidyInput = tidyTable(input)

    for (def in program.definition()) {
        val item = craft(tidyInput, def)
        if (item != undefined) return item
    }
    return undefined
}

fun craft(input: Table, def: CookbookParser.DefinitionContext): String {

    // return if the definition is a list (and not a table)
    def.recipe().table() ?: return undefined

    val typeOptions = mutableMapOf<String, Set<String>>()
    val setTypes = mutableMapOf<String, String>()

    fillTypeOptions(def.materials(), typeOptions)

    val recipe = def.recipe().table().row()
        .map { row ->
            row.entry().map { e ->
                when (e.text) {
                    blank -> blank
                    else -> {
                        // remove unnecessary amounts. default to x:1
                        val num: Int? = e.Num()?.text?.toInt()
                        e.ID().text + if (num != null && num > 1) ":$num" else ""
                    }
                }
            }
        }

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
    val itemID = def.ID()
    return "$itemType$itemID"
}

fun fillTypeOptions(
    maybeMaterials: CookbookParser.MaterialsContext?,
    typeOptions: MutableMap<String, Set<String>>
) {
    maybeMaterials?.let { materials ->
        val ids = materials.ID()
        val matTypes = materials.types()
        // fill type options
        for ((id, types) in ids zip matTypes) {
            typeOptions[id.text] = types.ID().map { it.text }.toSet()
        }
    }
}

fun tidyTable(table: Table): Table {
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