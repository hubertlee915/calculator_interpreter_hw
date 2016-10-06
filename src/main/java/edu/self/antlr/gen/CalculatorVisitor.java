// Generated from /Users/Hubert/Development/IdeaProj/calculator_interpreter_hw/Calculator.g4 by ANTLR 4.5.3
package edu.self.antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(CalculatorParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(CalculatorParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(CalculatorParser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#write_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_statements(CalculatorParser.Write_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CalculatorParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#write_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_statement(CalculatorParser.Write_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#expr_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_rest(CalculatorParser.Expr_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CalculatorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#term_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_rest(CalculatorParser.Term_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(CalculatorParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CalculatorParser.FactorContext ctx);
}