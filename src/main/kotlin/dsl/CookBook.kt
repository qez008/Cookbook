package dsl

import blank
import gen.CookbookParser
import org.antlr.v4.runtime.tree.TerminalNode


typealias Recipe = Either<Row, Table>
typealias ListRecipe = Either.Left<Row, Table>
typealias TableRecipe = Either.Right<Row, Table>
typealias Materials = Map<String, List<String>>

// helper class
sealed class Either<out L, out R> {
    data class Left<L, R>(val value: L) : Either<L, R>()
    data class Right<L, R>(val value: R) : Either<L, R>()
}


data class CookBook(val definitions: List<Definition>) {
    data class Definition(val name: String, val materials: Materials, val recipe: Recipe)
}


// ----------------- DSL functions -----------------

fun cookbook(block: MutableList<CookBook.Definition>.() -> Unit): CookBook {
    val entries = mutableListOf<CookBook.Definition>()
    entries.apply(block)
    return CookBook(entries)
}


fun MutableList<CookBook.Definition>.entry(def: CookbookParser.DefinitionContext) {
    val name = def.ID().text
    val mats = visit(def.materials())
    val rec = visit(def.recipe())
    this.add(CookBook.Definition(name, mats, rec))
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

fun tidyRecipe(table: CookbookParser.TableContext): List<List<String>> =
    table.row().map { row -> row.entry().map(::tidy) }

fun tidyRecipe(list: CookbookParser.ListContext): List<String> =
    list.row().entry().map(::tidy).sorted()

fun tidy(entry: CookbookParser.EntryContext): String =
    when (entry.text) {
        blank -> blank
        else -> {
            val id = entry.ID()
            val maybeInt: Int? = entry.Num()?.text?.toIntOrNull()
            val amount = if (maybeInt != null && maybeInt > 1) ":$maybeInt" else ""
            "$id$amount"
        }
    }
