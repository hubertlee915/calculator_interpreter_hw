// Generated from /Users/Hubert/Development/IdeaProj/calculator_interpreter_hw/Calculator.g4 by ANTLR 4.5.3
package edu.self.antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(CalculatorParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(CalculatorParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(CalculatorParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(CalculatorParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(CalculatorParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(CalculatorParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#write_statements}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statements(CalculatorParser.Write_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#write_statements}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statements(CalculatorParser.Write_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CalculatorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CalculatorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(CalculatorParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(CalculatorParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalculatorParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CalculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CalculatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(CalculatorParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(CalculatorParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReal(CalculatorParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReal(CalculatorParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(CalculatorParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(CalculatorParser.IdContext ctx);
}