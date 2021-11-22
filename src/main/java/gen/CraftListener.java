// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Craft.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CraftParser}.
 */
public interface CraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CraftParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(CraftParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(CraftParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CraftParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CraftParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#rows}.
	 * @param ctx the parse tree
	 */
	void enterRows(CraftParser.RowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#rows}.
	 * @param ctx the parse tree
	 */
	void exitRows(CraftParser.RowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CraftParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CraftParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CraftParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#recipe}.
	 * @param ctx the parse tree
	 */
	void enterRecipe(CraftParser.RecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#recipe}.
	 * @param ctx the parse tree
	 */
	void exitRecipe(CraftParser.RecipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(CraftParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(CraftParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#defs}.
	 * @param ctx the parse tree
	 */
	void enterDefs(CraftParser.DefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#defs}.
	 * @param ctx the parse tree
	 */
	void exitDefs(CraftParser.DefsContext ctx);
}