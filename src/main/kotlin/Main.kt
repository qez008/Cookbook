import dsl.*
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
    for (entry in cookbook.entries) {
        println(entry.mats)
        when (val recipe = entry.rec) {
            is Either.Left -> println(recipe.left)
            is Either.Right -> println(recipe.right)
        }
        println("---")
    }
}
