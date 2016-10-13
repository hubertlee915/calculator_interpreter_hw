package edu.self;

import edu.self.antlr.gen.CalculatorBaseVisitor;
import edu.self.antlr.gen.CalculatorLexer;
import edu.self.antlr.gen.CalculatorParser;
import edu.self.symtable.IdToken;
import edu.self.symtable.SymTable;

import java.util.List;

/**
 * Created by Hubert on 2016/10/8.
 */
public class CalculatorVisitor extends CalculatorBaseVisitor<Double> {

    @Override
    public Double visitMulDiv(CalculatorParser.MulDivContext ctx) {
        if (ctx.op.getType() == CalculatorLexer.MUL) {
            return visit(ctx.expression(0)) *visit(ctx.expression(1));
        } else if (ctx.op.getType() == CalculatorLexer.DIV) {
            return  visit(ctx.expression(0)) / visit(ctx.expression(1));
        } else {
            return null;
        }
    }

    @Override
    public Double visitAddSub(CalculatorParser.AddSubContext ctx) {
        if (ctx.op.getType() == CalculatorLexer.ADD) {
            return visit(ctx.expression(0)) + visit(ctx.expression(1));
        } else if (ctx.op.getType() == CalculatorLexer.SUB) {
            return visit(ctx.expression(0)) - visit(ctx.expression(1));
        } else {
            return null;
        }
    }

    @Override
    public Double visitAssignment(CalculatorParser.AssignmentContext ctx) {

        String tokenName = ctx.IDENTIFIER().getText();
        IdToken idToken = new IdToken(tokenName);

        if (SymTable.getInstance().get(idToken) != null) {
            //token在符号表中存在，说明之前声明过
            Double value = visit(ctx.expression());
            SymTable.getInstance().put(idToken, value);
        } else {
            //token不在符号表中，说明之前未声明
            System.out.printf("identifier %s is not declared before\n", tokenName);
        }
        return null;
    }

    @Override
    public Double visitAssignments(CalculatorParser.AssignmentsContext ctx) {
        List<CalculatorParser.AssignmentContext> assignList = ctx.assignment();
        for (CalculatorParser.AssignmentContext assignCtx : assignList) {
            visit(assignCtx);
        }
        return null;
    }

    @Override
    public Double visitDeclaration(CalculatorParser.DeclarationContext ctx) {

        String name = ctx.IDENTIFIER().getText();

        String typeText = ctx.TYPE().getText();
        IdToken.Type type;
        if (typeText.equals("int")) {
            type = IdToken.Type.INT;
        } else {
            type = IdToken.Type.FLOAT;
        }

        SymTable.getInstance().put(new IdToken(type, name), 0.0);

        return null;
    }

    @Override
    public Double visitWrite_statement(CalculatorParser.Write_statementContext ctx) {

        String id = ctx.IDENTIFIER().getText();
        Double value = SymTable.getInstance().get(new IdToken(id));
        if (value != null) {
            //is integer value
            IdToken t = SymTable.getInstance().getToken(new IdToken(id));
            if (t.getType() == IdToken.Type.INT) {
                System.out.println(value.intValue());
            } else {
                System.out.println(value.doubleValue());
            }
        } else {
            //符号表中不存在该id
            System.out.printf("no identifier like %s has been declared\n", id);
        }

        return null;
    }

    @Override
    public Double visitDeclarations(CalculatorParser.DeclarationsContext ctx) {
        List<CalculatorParser.DeclarationContext> declarationContexts = ctx.declaration();
        for (CalculatorParser.DeclarationContext context : declarationContexts) {
            visit(context);
        }
        return null;
    }

    @Override
    public Double visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitNum(CalculatorParser.NumContext ctx) {
        return Double.valueOf(ctx.NUM().getText());
    }

    @Override
    public Double visitReal(CalculatorParser.RealContext ctx) {
        return Double.valueOf(ctx.REAL().getText());
    }

    @Override
    public Double visitWrite_statements(CalculatorParser.Write_statementsContext ctx) {
        List<CalculatorParser.Write_statementContext> list = ctx.write_statement();
        for (CalculatorParser.Write_statementContext context : list) {
            visit(context);
        }
        return null;
    }

    @Override
    public Double visitId(CalculatorParser.IdContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Double value = SymTable.getInstance().get(new IdToken(name));
        if (value == null) {
            System.out.println("undeclared identifier: " + name);
            return null;
        }

        return value;
    }
}
