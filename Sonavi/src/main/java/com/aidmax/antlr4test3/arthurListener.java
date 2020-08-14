package com.aidmax.antlr4test3;
// Generated from arthur.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link arthurParser}.
 */
public interface arthurListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link arthurParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(arthurParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link arthurParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(arthurParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link arthurParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(arthurParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link arthurParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(arthurParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link arthurParser#stop}.
	 * @param ctx the parse tree
	 */
	void enterStop(arthurParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by {@link arthurParser#stop}.
	 * @param ctx the parse tree
	 */
	void exitStop(arthurParser.StopContext ctx);
	/**
	 * Enter a parse tree produced by {@link arthurParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterSetVar(arthurParser.SetVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link arthurParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitSetVar(arthurParser.SetVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code run}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 */
	void enterRun(arthurParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code run}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 */
	void exitRun(arthurParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(arthurParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(arthurParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 */
	void enterIf(arthurParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link arthurParser#func}.
	 * @param ctx the parse tree
	 */
	void exitIf(arthurParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolOp}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(arthurParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolOp}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(arthurParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(arthurParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(arthurParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(arthurParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(arthurParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getVar}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGetVar(arthurParser.GetVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getVar}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGetVar(arthurParser.GetVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock(arthurParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock(arthurParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicNum}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBasicNum(arthurParser.BasicNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicNum}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBasicNum(arthurParser.BasicNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compOp}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(arthurParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compOp}
	 * labeled alternative in {@link arthurParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(arthurParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link arthurParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(arthurParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link arthurParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(arthurParser.PrintContext ctx);
}