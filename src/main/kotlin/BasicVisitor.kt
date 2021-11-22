import gen.CraftBaseVisitor
import gen.CraftParser

class BasicVisitor : CraftBaseVisitor<String>() {

    var indent = 0
    fun ind(i: Int) = "  ".repeat(i)

    override fun visitDefs(ctx: CraftParser.DefsContext?): String {
        if (ctx == null) return ""

        var result = ""
        for (def in ctx.def()) {
            result += "${visitDef(def)} \n"
        }
        return result
    }

    override fun visitDef(ctx: CraftParser.DefContext?): String {
        if (ctx == null) return ""

        val res = ctx.recipe()
        fun showID(dec: CraftParser.DefContext) = dec.ID().toString().uppercase()
        return when {
            res.list() != null -> "list ${showID(ctx)}:${visitList(res.list())}"
            res.block() != null -> "block ${showID(ctx)}:${visitBlock(res.block())}"
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
        ctx?.let { it.item().joinToString(prefix = ind(indent), separator = "  ") { item -> visitItem(item) } }
            ?: ""

    override fun visitItem(ctx: CraftParser.ItemContext?): String {
        if (ctx == null) return ""
        return ctx.ID().text
//        return "${ctx.ID()}(${ctx.Amount()})"
    }

}