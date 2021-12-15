package dsl

import blank
import gen.CookbookParser
import org.antlr.v4.runtime.tree.TerminalNode


typealias Materials = Map<String, List<String>>


data class Cookbook(val definitions: List<Definition>) {

    data class Definition(val name: String, val materials: Materials, val recipe: Recipe)

}


fun cookbook(block: MutableList<Cookbook.Definition>.() -> Unit): Cookbook {
    val entries = mutableListOf<Cookbook.Definition>()
    entries.apply(block)
    return Cookbook(entries)
}


fun MutableList<Cookbook.Definition>.addDefinition(def: CookbookParser.DefinitionContext) {
    val name = def.ID().text
    val mats = convert(def.materials())
    val rec = convert(def.recipe())
    this.add(Cookbook.Definition(name, mats, rec))
}

// converts parse tree to Cookbook
fun convert(program: CookbookParser.ProgramContext): Cookbook {
    return cookbook {
        for (def in program.definition()) {
            addDefinition(def)
        }
    }
}

fun convert(materials: CookbookParser.MaterialsContext?): Map<String, List<String>> {

    materials ?: return emptyMap()

    val ids = materials.ID().map(TerminalNode::getText)
    val types = materials.types().map { it.ID().map(TerminalNode::getText) }

    return (ids zip types).toMap()
}

fun convert(recipe: CookbookParser.RecipeContext): Recipe =
    when (recipe) {
        is CookbookParser.ListContext -> {
            list(*convert(recipe.row()).toTypedArray())
        }
        is CookbookParser.TableContext -> {
            table {
                for (row in convert(recipe)) {
                    row(*row.toTypedArray())
                }
            }
        }

        else -> error("Either list or table should not be null!")
    }


fun convert(table: CookbookParser.TableContext): List<List<String>> =
    table.row().map(::convert)


fun convert(row: CookbookParser.RowContext): List<String> =
    row.entry().map(::convert)


fun convert(entry: CookbookParser.EntryContext): String =
    when (entry) {
        is CookbookParser.BlankContext -> blank
        is CookbookParser.IdContext -> entry.text
        is CookbookParser.IdAndNumContext -> "${entry.ID()}:${entry.Num()}"

        else -> error("unknown entry context")
    }

