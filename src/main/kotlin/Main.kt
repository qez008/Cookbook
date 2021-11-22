import gen.CraftLexer
import gen.CraftParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun match(input: List<String>, env: Environment): String =
    match(input.sorted(), env.lists)
        ?: match(input, env.blocks)
        ?: undefined

fun <T> match(input: T, entries: Map<String, T>): String? {
    for ((id, res) in entries) {
        if (input == res) {
            return id
        }
    }
    return null
}


fun ptree(stream: CharStream): CraftParser.DefsContext {

    val lexer = CraftLexer(stream)
    val tokens = CommonTokenStream(lexer)
    val parser = CraftParser(tokens)

    return parser.defs()
}

fun prettyPrint(tree: CraftParser.DefsContext) {
    val visitor = BasicVisitor()
    val out = visitor.visit(tree)
    println(out)
}


fun main() {

    val input = CharStreams.fromFileName("example")
    val tree = ptree(input)

    prettyPrint(tree)

    val env = Environment(tree)

    val inp = listOf("water", "bottle", "ingredient")
    val x = match(inp, env)
    println("$inp -> $x")
}
