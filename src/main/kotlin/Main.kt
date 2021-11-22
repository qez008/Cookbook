import gen.CraftLexer
import gen.CraftParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {

    val input = CharStreams.fromFileName("example")

    val lexer = CraftLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = CraftParser(tokens)
    val tree = parser.declarations()

    prettyPrint(tree)
}

fun prettyPrint(tree: CraftParser.DeclarationsContext) {
    val visitor = BasicVisitor()
    val out = visitor.visit(tree)
    println(tree.text + "\n––—\n" + out)
}
