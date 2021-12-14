import dsl.visit
import gen.CookbookLexer
import gen.CookbookParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

// JSON recipe generator: https://crafting.thedestruc7i0n.ca/

fun program(stream: CharStream): CookbookParser.ProgramContext {

    val lexer = CookbookLexer(stream)
    val tokens = CommonTokenStream(lexer)
    val parser = CookbookParser(tokens)

    return parser.program()
}

fun main() {

    val input = CharStreams.fromFileName("example.cb")
    val program = program(input)
    val cookbook = visit(program)

    for (entry in cookbook.definitions) {
        println(entry.name)
        println(entry.materials)
        println(entry.recipe)
        println("---")
    }
}
