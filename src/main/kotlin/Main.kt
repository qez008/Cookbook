import dsl.Row
import dsl.Table
import gen.CraftLexer
import gen.CraftParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


fun program(stream: CharStream): CraftParser.ProgramContext {

    val lexer = CraftLexer(stream)
    val tokens = CommonTokenStream(lexer)
    val parser = CraftParser(tokens)

    return parser.program()
}

fun craft(input: Row, program: CraftParser.ProgramContext): String {
    for (def in program.def()) {
        val item = craft(input, def)
        if (item != undefined) return item
    }
    return undefined
}

fun craft(input: Row, def: CraftParser.DefContext): String {
    val listRecipe = def.recipe().list() ?: return undefined

    val typeOptions = mutableMapOf<String, Set<String>>()
    val setTypes = mutableMapOf<String, String>()

    fillTypeOptions(def.materialTypes(), typeOptions)

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

fun craft(input: Table, program: CraftParser.ProgramContext): String {
    for (def in program.def()) {
        val item = craft(input, def)
        if (item != undefined) return item
    }
    return undefined
}

fun craft(input: Table, def: CraftParser.DefContext): String {

    // return if the definition is a list (and not a table)
    if (def.recipe().table() == null) return undefined

    val typeOptions = mutableMapOf<String, Set<String>>()
    val setTypes = mutableMapOf<String, String>()

    fillTypeOptions(def.materialTypes(), typeOptions)

    val recipe = def.recipe().table().row()
        .map { r -> r.entry().map { e -> e.text } }

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
    materialTypes: CraftParser.MaterialTypesContext?,
    typeOptions: MutableMap<String, Set<String>>
) {
    materialTypes?.let {
        val ids = it.ID()
        val matTypes = it.types()
        // fill type options
        for ((id, types) in ids zip matTypes) {
            typeOptions[id.text] = types.type().map { t -> t.ID().text }.toSet()
        }
    }
}

fun main() {

    val input = CharStreams.fromFileName("example.cb")
    val program = program(input)
}

