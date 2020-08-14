// Generated from arthur.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link arthurParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface arthurVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link arthurParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(arthurParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link arthurParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(arthurParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link arthurParser#stop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(arthurParser.StopContext ctx);
	/**
	 * Visit a parse tree produced by {@link arthurParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVar(arthurParser.SetVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code run}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun(arthurParser.RunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(arthurParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(arthurParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolOp}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(arthurParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(arthurParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(arthurParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getVar}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetVar(arthurParser.GetVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(arthurParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicNum}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicNum(arthurParser.BasicNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compOp}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(arthurParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link arthurParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(arthurParser.PrintContext ctx);
}