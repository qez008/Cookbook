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
	 * Visit a parse tree produced by {@link CraftParser#materials}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterials(CraftParser.MaterialsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(CraftParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#materialTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialTypes(CraftParser.MaterialTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipe(CraftParser.RecipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#grid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrid(CraftParser.GridContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CraftParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(CraftParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CraftParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(CraftParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CraftParser.ProgramContext ctx);
}