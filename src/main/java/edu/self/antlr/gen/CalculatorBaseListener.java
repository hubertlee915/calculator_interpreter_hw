//// Generated from /Users/Hubert/Development/IdeaProj/calculator_interpreter_hw/Calculator.g4 by ANTLR 4.5.3
//package edu.self.antlr.gen;
//
//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.ErrorNode;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
///**
// * This class provides an empty implementation of {@link CalculatorListener},
// * which can be extended to create a listener which only needs to handle a subset
// * of the available methods.
// */
//public class CalculatorBaseListener implements CalculatorListener {
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterInit(CalculatorParser.InitContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitInit(CalculatorParser.InitContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterDeclarations(CalculatorParser.DeclarationsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitDeclarations(CalculatorParser.DeclarationsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterAssignments(CalculatorParser.AssignmentsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitAssignments(CalculatorParser.AssignmentsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterWrite_statements(CalculatorParser.Write_statementsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitWrite_statements(CalculatorParser.Write_statementsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterDeclaration(CalculatorParser.DeclarationContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitDeclaration(CalculatorParser.DeclarationContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterAssignment(CalculatorParser.AssignmentContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitAssignment(CalculatorParser.AssignmentContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterWrite_statement(CalculatorParser.Write_statementContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitWrite_statement(CalculatorParser.Write_statementContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterExpression(CalculatorParser.ExpressionContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitExpression(CalculatorParser.ExpressionContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterExpr_rest(CalculatorParser.Expr_restContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitExpr_rest(CalculatorParser.Expr_restContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterTerm(CalculatorParser.TermContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitTerm(CalculatorParser.TermContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterTerm_rest(CalculatorParser.Term_restContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitTerm_rest(CalculatorParser.Term_restContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterUnary(CalculatorParser.UnaryContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitUnary(CalculatorParser.UnaryContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterFactor(CalculatorParser.FactorContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitFactor(CalculatorParser.FactorContext ctx) { }
//
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterEveryRule(ParserRuleContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitEveryRule(ParserRuleContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void visitTerminal(TerminalNode node) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void visitErrorNode(ErrorNode node) { }
//}