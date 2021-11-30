import gen.CookbookBaseVisitor
import gen.CookbookParser

class BasicVisitor : CookbookBaseVisitor<String>() {

    override fun visitProgram(prog: CookbookParser.ProgramContext?): String =
        prog?.let {
            var result = ""

            for (def in prog.definition()) {
                result += visitDefinition(def)
            }
            result
        }
            ?: ""

    override fun visitMaterials(mats: CookbookParser.MaterialsContext?): String =
        mats?.let {
            var result = "materials:\n"
            val separator = "  - "
            for (ids in mats.ID().chunked(3)) {
                result += ids.joinToString(separator, separator, "\n") { "$it".padEnd(12) }
            }
            "$result\n"
        }
            ?: ""

    override fun visitDefinition(ctx: CookbookParser.DefinitionContext?): String =
        ctx?.let { def -> "recipe [${def.ID()}]:\n${visitRecipe(def.recipe())}\n" } ?: ""

    override fun visitRecipe(ctx: CookbookParser.RecipeContext?): String =
        ctx?.let { res -> visitList(res.list()) + visitTable(res.table()) } ?: ""

    override fun visitTable(ctx: CookbookParser.TableContext?): String =
        ctx?.let { table ->
            var result = "  table:\n"
            for (row in table.row()) {
                result += "    ${visitRow(row)}\n"
            }
            result
        }
            ?: ""

    override fun visitList(ctx: CookbookParser.ListContext?): String =
        ctx?.let { list ->
            "  list [ ${visitRow(list.row())} ]\n"
        }
            ?: ""

    override fun visitRow(ctx: CookbookParser.RowContext?): String =
        ctx?.let { row ->
            row.entry().joinToString(" ") { visitEntry(it) }
        }
            ?: ""

    override fun visitEntry(ctx: CookbookParser.EntryContext?): String =
        ctx?.text ?: ""

    override fun visitTypes(ctx: CookbookParser.TypesContext?): String =
        ctx?.let { types ->
            types.ID().joinToString("/", "(", ")") { it.text }
        }
            ?: ""
}