// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Cookbook.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CookbookParser}.
 */
public interface CookbookListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CookbookParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CookbookParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CookbookParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(CookbookParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(CookbookParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#materials}.
	 * @param ctx the parse tree
	 */
	void enterMaterials(CookbookParser.MaterialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#materials}.
	 * @param ctx the parse tree
	 */
	void exitMaterials(CookbookParser.MaterialsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#recipe}.
	 * @param ctx the parse tree
	 */
	void enterRecipe(CookbookParser.RecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#recipe}.
	 * @param ctx the parse tree
	 */
	void exitRecipe(CookbookParser.RecipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CookbookParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CookbookParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(CookbookParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(CookbookParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CookbookParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CookbookParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(CookbookParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(CookbookParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(CookbookParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(CookbookParser.TypesContext ctx);
}