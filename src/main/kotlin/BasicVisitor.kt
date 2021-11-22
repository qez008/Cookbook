import gen.CraftBaseVisitor
import gen.CraftParser

class BasicVisitor : CraftBaseVisitor<String>() {

    var indent = 0
    fun ind(i: Int) = "  ".repeat(i)

    override fun visitDeclarations(ctx: CraftParser.DeclarationsContext?): String {
        if (ctx == null) return ""

        var result = ""
        for (dec in ctx.declaration()) {
            result += "${visitDeclaration(dec)} \n"
        }
        return result
    }

    override fun visitDeclaration(ctx: CraftParser.DeclarationContext?): String {
        if (ctx == null) return ""

        val res = ctx.recipe()
        return when {
            res.list() != null -> "list ${ctx.ID()}:${visitList(res.list())}"
            res.block() != null -> "block ${ctx.ID()}:${visitBlock(res.block())}"
            else -> TODO()
        }
    }


    override fun visitList(ctx: CraftParser.ListContext?): String {
//            println("list")
        if (ctx == null) return ""

        indent++
        val result = visitRow(ctx.row())
        indent--
        return "\n$result\n"
    }

    override fun visitBlock(ctx: CraftParser.BlockContext?): String {
//            println("block")
        if (ctx == null) return ""

        indent++
        val result = visitRows(ctx.rows())
        indent--
        return "\n$result"
    }


    override fun visitRows(ctx: CraftParser.RowsContext?): String =
        ctx?.let { rows -> visitRow(rows.row()) + "\n" + visitRows(rows.rows()) }
            ?: ""

    override fun visitRow(ctx: CraftParser.RowContext?): String =
        ctx?.let { row -> ind(indent) + visitItem(row.item()) + visitRow(row.row()) }
            ?: ""

    override fun visitItem(ctx: CraftParser.ItemContext?): String {
        if (ctx == null) return ""
        return "${ctx.ID()}(${ctx.Amount()})"
    }

}