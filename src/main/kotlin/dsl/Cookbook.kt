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
    val mats = visit(def.materials())
    val rec = visit(def.recipe())
    this.add(Cookbook.Definition(name, mats, rec))
}


fun visit(program: CookbookParser.ProgramContext): Cookbook {
    return cookbook {
        for (def in program.definition()) {
            addDefinition(def)
        }
    }
}

fun visit(materials: CookbookParser.MaterialsContext?): Map<String, List<String>> {

    materials ?: return emptyMap()

    val ids = materials.ID().map(TerminalNode::getText)
    val types = materials.types().map { it.ID().map(TerminalNode::getText) }

    return (ids zip types).toMap()
}

fun visit(recipe: CookbookParser.RecipeContext): Recipe =
    when (recipe) {
        is CookbookParser.ListContext -> visit(recipe)
        is CookbookParser.TableContext -> visit(recipe)
        else -> error("Either list or table should not be null!")
    }

fun visit(table: CookbookParser.TableContext): Recipe =
    table {
        for (row in tableContextToList(table)) {
            row(*row.toTypedArray())
        }
    }

fun visit(list: CookbookParser.ListContext): Recipe =
    list(*listContextToList(list).toTypedArray())


fun tableContextToList(table: CookbookParser.TableContext): List<List<String>> =
    table.row().map { row -> row.entry().map(::entryToString) }


fun listContextToList(list: CookbookParser.ListContext): List<String> =
    list.row().entry().map(::entryToString).sorted()


fun entryToString(entry: CookbookParser.EntryContext): String =
    when (entry) {
        is CookbookParser.BlankContext -> blank
        is CookbookParser.IdContext -> entry.text
        is CookbookParser.IdAndNumContext -> "${entry.ID()}:${entry.Num()}"
        else -> error("unknown entry context")
    }

