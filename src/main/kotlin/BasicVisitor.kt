import gen.CraftBaseVisitor
import gen.CraftParser

class BasicVisitor : CraftBaseVisitor<String>() {

    override fun visitProgram(prog: CraftParser.ProgramContext?): String =
        prog?.let {
            var result = ""
            for (mats in prog.materials()) {
                result += visitMaterials(mats)
            }

            for (def in prog.def()) {
                result += visitDef(def)
            }
            result
        }
            ?: ""

    override fun visitMaterials(mats: CraftParser.MaterialsContext?): String =
        mats?.let {
            var result = "materials:\n"
            val separator = "  - "
            for (ids in mats.ID().chunked(3)) {
                result += ids.joinToString(separator, separator, "\n") { "$it".padEnd(12) }
            }
            "$result\n"
        }
            ?: ""

    override fun visitDef(ctx: CraftParser.DefContext?): String =
        ctx?.let { def -> "recipe [${def.ID()}]:\n${visitRecipe(def.recipe())}\n" } ?: ""

    override fun visitRecipe(ctx: CraftParser.RecipeContext?): String =
        ctx?.let { res -> visitList(res.list()) + visitGrid(res.grid()) } ?: ""

    override fun visitGrid(ctx: CraftParser.GridContext?): String =
        ctx?.let { grid ->
            var result = "  grid:\n"
            for (row in grid.row()) {
                result += "    ${visitRow(row)}\n"
            }
            result
        }
            ?: ""

    override fun visitList(ctx: CraftParser.ListContext?): String =
        ctx?.let { list ->
            "  list [ ${visitRow(list.row())} ]\n"
        }
            ?: ""

    override fun visitRow(ctx: CraftParser.RowContext?): String =
        ctx?.let { row ->
            row.entry().joinToString(" ") { visitEntry(it) }
        }
            ?: ""

    override fun visitEntry(ctx: CraftParser.EntryContext?): String =
        ctx?.text ?: ""

    override fun visitTypes(ctx: CraftParser.TypesContext?): String =
        ctx?.let { types ->
            types.type().joinToString("/", "(", ")") { it.text }
        }
            ?: ""
}