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
	 * Visit a parse tree produced by {@link CookbookParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CookbookParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(CookbookParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#materials}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterials(CookbookParser.MaterialsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link CookbookParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CookbookParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link CookbookParser#recipe}.
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
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CookbookParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(CookbookParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CookbookParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CookbookParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAndNum}
	 * labeled alternative in {@link CookbookParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAndNum(CookbookParser.IdAndNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookbookParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(CookbookParser.TypesContext ctx);
}