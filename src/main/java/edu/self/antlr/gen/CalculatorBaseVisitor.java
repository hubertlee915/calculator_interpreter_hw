//// Generated from /Users/Hubert/Development/IdeaProj/calculator_interpreter_hw/Calculator.g4 by ANTLR 4.5.3
//package edu.self.antlr.gen;
//import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
//
///**
// * This class provides an empty implementation of {@link CalculatorVisitor},
// * which can be extended to create a visitor which only needs to handle a subset
// * of the available methods.
// *
// * @param <T> The return type of the visit operation. Use {@link Void} for
// * operations with no return type.
// */
//public class CalculatorBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CalculatorVisitor<T> {
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitInit(CalculatorParser.InitContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitDeclarations(CalculatorParser.DeclarationsContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitAssignments(CalculatorParser.AssignmentsContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitWrite_statements(CalculatorParser.Write_statementsContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitDeclaration(CalculatorParser.DeclarationContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitAssignment(CalculatorParser.AssignmentContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitWrite_statement(CalculatorParser.Write_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitExpression(CalculatorParser.ExpressionContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitExpr_rest(CalculatorParser.Expr_restContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitTerm(CalculatorParser.TermContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitTerm_rest(CalculatorParser.Term_restContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitUnary(CalculatorParser.UnaryContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitFactor(CalculatorParser.FactorContext ctx) { return visitChildren(ctx); }
//}