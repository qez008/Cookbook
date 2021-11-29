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

fun main() {

    val input = CharStreams.fromFileName("example.cb")
    val program = program(input)
}

