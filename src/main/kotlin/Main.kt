import gen.CraftLexer
import gen.CraftParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

// match input to lists
fun matchList(input: List<String>, env: Environment): String =
    match(input.sorted(), env.lists) ?: undefined

// match input to blocks
fun matchBlock(input: List<List<String>>, env: Environment): String =
    match(input, env.grids) ?: match(input.flatten().sorted(), env.lists) ?: undefined

fun <T> match(input: Any, entries: Map<String, T>): String? {
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

    println("ingredients:")
    for (chunk in env.ingredients.chunked(4)) {
        println(chunk.joinToString(prefix = "  - ", separator = "  - ") { it.padEnd(12) })
    }

    testMatchList(listOf("water", "bottle", "ingredient"), env)
    testMatchBlock(listOf(listOf("water", "bottle", "ingredient")), env)
    testMatchBlock(listOf(listOf("c", "b", "a")), env)
    testMatchBlock(listOf(listOf("a", "b", "c")), env)


    println(validInput(listOf("water", "bottle", "ingredient"), env))
    println(validInput(listOf("water", "bottle", "ingredien"), env))
    println("unknown ingredient(s): ${invalidIngredients(listOf("water", "bottle", "ingredien"), env)}")
}


fun testMatchList(inp: List<String>, env: Environment) {
    val x = matchList(inp, env)
    println("$inp -> $x")
}


fun testMatchBlock(inp: List<List<String>>, env: Environment) {
    val x = matchBlock(inp, env)
    println("$inp -> $x")
}


fun validInput(inp: List<String>, env: Environment): Boolean = env.ingredients.containsAll(inp)

fun invalidIngredients(inp: List<String>, env: Environment): List<String> = inp - env.ingredients

