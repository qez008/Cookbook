// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Craft.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CraftParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(CraftParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CraftParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRows(CraftParser.RowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#newrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewrow(CraftParser.NewrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CraftParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipe(CraftParser.RecipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CraftParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(CraftParser.DeclarationsContext ctx);
}