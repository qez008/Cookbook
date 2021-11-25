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

    // keeps track of entries with type options
    val typeOptions = mutableMapOf<String, Set<String>>()
    // keeps track of set types
    val lookupType = mutableMapOf<String, String>()

    def.materialTypes()?.let {
        val ids = it.ID()
        val matTypes = it.types()
        // fill type options
        for ((id, types) in ids zip matTypes) {
            typeOptions[id.text] = types.type().map { t -> t.ID().text }.toSet()
        }
    }


    val res = def.recipe().table().row()
        .map { r -> r.entry().map { e -> e.text } }

    for ((expectedRow, actualRow) in res zip input) {
        for ((expected, actual) in expectedRow zip actualRow) {

            when (expected) {
                in lookupType -> {
                    if (lookupType[expected] != actual) return undefined
                }
                in typeOptions -> {
                    if (typeOptions[expected]?.contains(actual) == true) {
                        lookupType[expected] = actual
                    } else {
//                        println("actual: $actual")
//                        println("options: ${typeOptions[expected]}")
                        return undefined
                    }
                }
                else -> {
                    if (expected != actual) return undefined
                }
            }
        }
    }
    val itemType = lookupType.values
    val itemID = def.ID()
    return "$itemType $itemID"
}

fun main() {

    val input = CharStreams.fromFileName("example")
    val progam = program(input)
}
