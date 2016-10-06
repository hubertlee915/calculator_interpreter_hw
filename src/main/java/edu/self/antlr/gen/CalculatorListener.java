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
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr_rest}.
	 * @param ctx the parse tree
	 */
	void enterExpr_rest(CalculatorParser.Expr_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr_rest}.
	 * @param ctx the parse tree
	 */
	void exitExpr_rest(CalculatorParser.Expr_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CalculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CalculatorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#term_rest}.
	 * @param ctx the parse tree
	 */
	void enterTerm_rest(CalculatorParser.Term_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#term_rest}.
	 * @param ctx the parse tree
	 */
	void exitTerm_rest(CalculatorParser.Term_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(CalculatorParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(CalculatorParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CalculatorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CalculatorParser.FactorContext ctx);
}