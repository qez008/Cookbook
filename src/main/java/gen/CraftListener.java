// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Craft.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CraftParser}.
 */
public interface CraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CraftParser#materials}.
	 * @param ctx the parse tree
	 */
	void enterMaterials(CraftParser.MaterialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#materials}.
	 * @param ctx the parse tree
	 */
	void exitMaterials(CraftParser.MaterialsContext ctx);
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
	 * Enter a parse tree produced by {@link CraftParser#materialTypes}.
	 * @param ctx the parse tree
	 */
	void enterMaterialTypes(CraftParser.MaterialTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#materialTypes}.
	 * @param ctx the parse tree
	 */
	void exitMaterialTypes(CraftParser.MaterialTypesContext ctx);
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
	 * Enter a parse tree produced by {@link CraftParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(CraftParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(CraftParser.TableContext ctx);
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
	 * Enter a parse tree produced by {@link CraftParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(CraftParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(CraftParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CraftParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CraftParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(CraftParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(CraftParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CraftParser.ProgramContext ctx);
}