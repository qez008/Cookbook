package dsl

import blank
import gen.CookbookParser
import org.antlr.v4.runtime.tree.TerminalNode


typealias Materials = Map<String, List<String>>


data class CookBook(val definitions: List<Definition>) {
    data class Definition(val name: String, val materials: Materials, val recipe: Recipe)

}


// ----------------- DSL functions -----------------

fun cookbook(block: MutableList<CookBook.Definition>.() -> Unit): CookBook {
    val entries = mutableListOf<CookBook.Definition>()
    entries.apply(block)
    return CookBook(entries)
}


fun MutableList<CookBook.Definition>.addDefinition(def: CookbookParser.DefinitionContext) {
    val name = def.ID().text
    val mats = visit(def.materials())
    val rec = visit(def.recipe())
    this.add(CookBook.Definition(name, mats, rec))
}


// ----------------- Tree exploration -----------------

fun visit(program: CookbookParser.ProgramContext): CookBook {
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
    when {
        recipe.list() != null -> visit(recipe.list())
        recipe.table() != null -> visit(recipe.table())
        else -> error("Either list or table should not be null!")
    }

fun visit(table: CookbookParser.TableContext): Recipe =
    table {
        for (row in visitTable(table)) {
            row(*row.toTypedArray())
        }
    }

fun visit(list: CookbookParser.ListContext): Recipe =
    list(*visitList(list).toTypedArray())


fun visitTable(table: CookbookParser.TableContext): List<List<String>> =
    table.row().map { row -> row.entry().map(::entryToString) }


fun visitList(list: CookbookParser.ListContext): List<String> =
    list.row().entry().map(::entryToString).sorted()


fun entryToString(entry: CookbookParser.EntryContext): String =
    when (entry.text) {
        blank -> blank
        else -> {
            val id = entry.ID()
            when (val num = entry.Num()) {
                null -> "$id"
                else -> "$id" amount (num.text.toIntOrNull()
                    ?: error("num is not an int in ${entry.text}"))
            }
        }
    }
