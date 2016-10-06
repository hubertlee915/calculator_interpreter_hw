// Generated from /Users/Hubert/Development/IdeaProj/calculator_interpreter_hw/calculator.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(calculatorParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(calculatorParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(calculatorParser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#write_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_statements(calculatorParser.Write_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(calculatorParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(calculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#write_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_statement(calculatorParser.Write_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(calculatorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#expr_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_rest(calculatorParser.Expr_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(calculatorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#term_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_rest(calculatorParser.Term_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(calculatorParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(calculatorParser.FactorContext ctx);
}