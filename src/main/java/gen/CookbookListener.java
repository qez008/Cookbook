// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Cookbook.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CookbookParser}.
 */
public interface CookbookListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link CookbookParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(CookbookParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(CookbookParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookbookParser#materialTypes}.
	 * @param ctx the parse tree
	 */
	void enterMaterialTypes(CookbookParser.MaterialTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#materialTypes}.
	 * @param ctx the parse tree
	 */
	void exitMaterialTypes(CookbookParser.MaterialTypesContext ctx);
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
	 * Enter a parse tree produced by {@link CookbookParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CookbookParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookbookParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CookbookParser.TypeContext ctx);
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
}