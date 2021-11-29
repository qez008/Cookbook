// Generated from /Users/morten/Documents/uib/M-inf225/term-project/Cookbook.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CookbookParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CookbookVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CookbookParser#materials}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterials(CookbookParser.MaterialsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(CookbookParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#materialTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialTypes(CookbookParser.MaterialTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipe(CookbookParser.RecipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CookbookParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(CookbookParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CookbookParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(CookbookParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CookbookParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(CookbookParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CookbookParser.ProgramContext ctx);
}