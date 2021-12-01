package dsl

import gen.CookbookParser
import org.antlr.v4.runtime.tree.TerminalNode
import tidyRecipe


typealias Recipe = Either<Row, Table>
typealias Materials = Map<String, List<String>>

// helper class
sealed class Either<out L, out R> {
    data class Left<L, R>(val left: L) : Either<L, R>()
    data class Right<L, R>(val right: R) : Either<L, R>()
}


data class CookBook(val entries: List<Entry>) {
    data class Entry(val name: String, val mats: Materials, val rec: Recipe)
}


// ----------------- DSL functions -----------------

fun cookbook(block: MutableList<CookBook.Entry>.() -> Unit): CookBook {
    val entries = mutableListOf<CookBook.Entry>()
    entries.apply(block)
    return CookBook(entries)
}


fun MutableList<CookBook.Entry>.entry(def: CookbookParser.DefinitionContext) {
    val name = def.ID().text
    val mats = visit(def.materials())
    val rec = visit(def.recipe())
    this.add(CookBook.Entry(name, mats, rec))
}


// ----------------- Tree exploration -----------------

fun visit(program: CookbookParser.ProgramContext?): CookBook {
    program!!
    return cookbook {
        for (def in program.definition()) {
            entry(def)
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

fun visit(table: CookbookParser.TableContext): Recipe {
    val value = table {
        for (row in tidyRecipe(table)) {
            row(*row.toTypedArray())
        }
    }
    return Either.Right(value)
}

fun visit(list: CookbookParser.ListContext): Recipe {
    val value = list(*tidyRecipe(list).toTypedArray())
    return Either.Left(value)
}
