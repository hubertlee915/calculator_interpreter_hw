// Generated from /Users/Hubert/Development/IdeaProj/calculator_interpreter_hw/calculator.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(calculatorParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(calculatorParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(calculatorParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(calculatorParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(calculatorParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(calculatorParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#write_statements}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statements(calculatorParser.Write_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#write_statements}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statements(calculatorParser.Write_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(calculatorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(calculatorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(calculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(calculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(calculatorParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(calculatorParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(calculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(calculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#expr_rest}.
	 * @param ctx the parse tree
	 */
	void enterExpr_rest(calculatorParser.Expr_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#expr_rest}.
	 * @param ctx the parse tree
	 */
	void exitExpr_rest(calculatorParser.Expr_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(calculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(calculatorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#term_rest}.
	 * @param ctx the parse tree
	 */
	void enterTerm_rest(calculatorParser.Term_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#term_rest}.
	 * @param ctx the parse tree
	 */
	void exitTerm_rest(calculatorParser.Term_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(calculatorParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(calculatorParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(calculatorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(calculatorParser.FactorContext ctx);
}