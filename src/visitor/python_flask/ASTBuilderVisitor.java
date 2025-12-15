package visitor.python_flask;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

import antlr.python_flask.generated.*;
import antlr.python_flask.generated.PythonParser.AtomExpressionContext;
import antlr.python_flask.generated.PythonParser.BooleanLiteralContext;
import antlr.python_flask.generated.PythonParser.DictAtomContext;
import antlr.python_flask.generated.PythonParser.DoubleLiteralContext;
import antlr.python_flask.generated.PythonParser.FStringLiteralContext;
import antlr.python_flask.generated.PythonParser.IdentifierLiteralContext;
import antlr.python_flask.generated.PythonParser.IntLiteralContext;
import antlr.python_flask.generated.PythonParser.ListAtomContext;
import antlr.python_flask.generated.PythonParser.LiteralAtomContext;
import antlr.python_flask.generated.PythonParser.NullLiteralContext;
import antlr.python_flask.generated.PythonParser.ParenAtomContext;
import antlr.python_flask.generated.PythonParser.StringLiteralContext;
import ast.BaseNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.StatementNode;
import ast.python_flask.literal.BooleanLiteralExpression;
import ast.python_flask.literal.DoubleLiteralExpression;
import ast.python_flask.literal.FStringLiteralExpression;
import ast.python_flask.literal.IdentifierExpression;
import ast.python_flask.literal.IntLiteralExpression;
import ast.python_flask.literal.NullLiteralExpression;
import ast.python_flask.literal.StringLiteralExpression;
import ast.python_flask.simple_statement.BreakStatementNode;
import ast.python_flask.simple_statement.ContinueStatementNode;
import ast.python_flask.simple_statement.GlobalStatementNode;
import ast.python_flask.simple_statement.PassStatementNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionStatementNode;
import ast.python_flask.simple_statement.expression_stat.atom.DictAtomNode;
import ast.python_flask.simple_statement.expression_stat.atom.ListAtomNode;
import ast.python_flask.simple_statement.expression_stat.atom.ParenAtomNode;
import ast.python_flask.simple_statement.expression_stat.expressions.AddSubExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.AndExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.AtomExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.ComparisonExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.IsExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.IsNotExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.MulDivModExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.NotExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.OrExpressionNode;
import ast.python_flask.simple_statement.expression_stat.expressions.PowerExpressionNode;
import ast.python_flask.simple_statement.expression_stat.trailer.TrailerNode;
import ast.python_flask.simple_statement.import_stat.ImportItem;
import ast.python_flask.simple_statement.import_stat.ImportModule;
import ast.python_flask.simple_statement.import_stat.ImportStatementNode;

public class ASTBuilderVisitor extends PythonParserBaseVisitor<BaseNode> {

//============================================================
//  Program
//============================================================
    @Override
    public BaseNode visitProgram(PythonParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode(1);

        for (var stmt : ctx.statement()) {
            program.addStatement((StatementNode) visit(stmt));
        }
        return program;
    }
//============================================================
//  Simple Statement
//============================================================
    @Override
    public BaseNode visitSimpleStatement(PythonParser.SimpleStatementContext ctx) {
        if (ctx.expressionList() != null) {
            List<ExpressionNode> expressions = new ArrayList<>();
            for (var e : ctx.expressionList().expression()) {
                expressions.add((ExpressionNode) visit(e));
            }
            return new ExpressionStatementNode(
                    ctx.getStart().getLine(),
                    expressions);
        }
        return super.visitSimpleStatement(ctx);
    }
//============================================================
//  Pass Statement
//============================================================
    @Override
    public BaseNode visitPassStatement(PythonParser.PassStatementContext ctx) {
        return new PassStatementNode(ctx.PASS().getSymbol().getLine());
    }
//============================================================
//  Continue Statement
//============================================================
    @Override
    public BaseNode visitContinueStatement(PythonParser.ContinueStatementContext ctx) {
        return new ContinueStatementNode(ctx.CONTINUE().getSymbol().getLine());
    }
//============================================================
//  Break Statement
//============================================================
    @Override
    public BaseNode visitBreakStatement(PythonParser.BreakStatementContext ctx) {
        return new BreakStatementNode(ctx.BREAK().getSymbol().getLine());
    }
//============================================================
//  Global Statement
//============================================================
    @Override
    public BaseNode visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        int line = ctx.GLOBAL().getSymbol().getLine();
        var names = ctx.IDENTIFIER()
                .stream()
                .map(t -> t.getText())
                .toList();

        return new GlobalStatementNode(line, names);
    }
//============================================================
//  Import Statement
//============================================================
    @Override
    public BaseNode visitImportStatement(PythonParser.ImportStatementContext ctx) {
        ImportStatementNode node = new ImportStatementNode(ctx.getStart().getLine());
        // from module
        if (ctx.importModule() != null) {
            List<String> parts = ctx.importModule()
                    .IDENTIFIER()
                    .stream()
                    .map(t -> t.getText())
                    .toList();

            node.fromModule = new ImportModule(
                    ctx.importModule().getStart().getLine(),
                    parts);
        }
        // import items
        for (var i : ctx.importItem()) {
            node.addImportItem(
                    new ImportItem(
                            i.getStart().getLine(),
                            i.IDENTIFIER(0).getText(),
                            i.IDENTIFIER().size() > 1
                                    ? i.IDENTIFIER(1).getText()
                                    : null));
        }

        return node;
    }
//============================================================
//  Atom Expression
//============================================================
    @Override
    public BaseNode visitAtomExpressionAt(PythonParser.AtomExpressionAtContext ctx) {
        return visit(ctx.atomExpression());
    }

    @Override
    public BaseNode visitAtomExpression(AtomExpressionContext ctx) {
        ExpressionNode atomExpressionNode;
        int line = ctx.getStart().getLine();
        if (ctx.atom() != null) {
            atomExpressionNode = (ExpressionNode) visit(ctx.atom());
        } else {
            List<TrailerNode> trailerNodes = new ArrayList<>();
            for (var i : ctx.trailer()) {
                trailerNodes.add((TrailerNode) visit(i));
            }
            IdentifierExpression identifierExpression = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(),
                    ctx.IDENTIFIER().getText());
            atomExpressionNode = new AtomExpressionNode(line, identifierExpression, trailerNodes);
        }
        return atomExpressionNode;
    }

    @Override
    public BaseNode visitParenAtom(ParenAtomContext ctx) {
        int line = ctx.getStart().getLine();
        ParenAtomNode node = new ParenAtomNode(line, new ArrayList<>());
        if (ctx.expressionList() != null) {
            for (var exp : ctx.expressionList().expression()) {
                node.expressions.add((ExpressionNode) visit(exp));
            }
        }
        return node;
    }

    @Override
    public BaseNode visitListAtom(ListAtomContext ctx) {
        int line = ctx.getStart().getLine();
        ListAtomNode node = new ListAtomNode(line, new ArrayList<>());
        if (ctx.expressionList() != null) {
            for (var exp : ctx.expressionList().expression()) {
                node.elements.add((ExpressionNode) visit(exp));
            }
        }
        return node;
    }

    @Override
    public BaseNode visitDictAtom(DictAtomContext ctx) {
        int line = ctx.getStart().getLine();
        DictAtomNode node = new DictAtomNode(line);

        if (ctx.keyValueList() != null) {
            for (var kv : ctx.keyValueList().keyValue()) {
                ExpressionNode key = (ExpressionNode) visit(kv.expression(0));
                ExpressionNode value = (ExpressionNode) visit(kv.expression(1));
                node.entries.add(new Pair<>(key, value));
            }
        }
        return node;
    }
//============================================================
//  Expressions
//============================================================
    @Override
    public BaseNode visitPowerExpression(PythonParser.PowerExpressionContext ctx) {
        return new PowerExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitMulDivModExpression(PythonParser.MulDivModExpressionContext ctx) {
        return new MulDivModExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression(0)),
                ctx.getChild(1).getText(),
                (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitAddSubExpression(PythonParser.AddSubExpressionContext ctx) {
        return new AddSubExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression(0)),
                ctx.getChild(1).getText(),
                (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitComparisonExpression(PythonParser.ComparisonExpressionContext ctx) {
        return new ComparisonExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression(0)),
                ctx.getChild(1).getText(),
                (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitIsExpression(PythonParser.IsExpressionContext ctx) {
        return new IsExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitIsNotExpression(PythonParser.IsNotExpressionContext ctx) {
        return new IsNotExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitNotExpression(PythonParser.NotExpressionContext ctx) {
        return new NotExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public BaseNode visitAndExpression(PythonParser.AndExpressionContext ctx) {
        return new AndExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1)));
    }

    @Override
    public BaseNode visitOrExpression(PythonParser.OrExpressionContext ctx) {
        return new OrExpressionNode(
                ctx.getStart().getLine(),
                (ExpressionNode) visit(ctx.expression(0)),
                (ExpressionNode) visit(ctx.expression(1)));
    }
//============================================================
//  Literal
//============================================================
    @Override
    public BaseNode visitIntLiteral(IntLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        String num = ctx.INT().getText();
        return new IntLiteralExpression(line, Integer.parseInt(num));
    }

    @Override
    public BaseNode visitDoubleLiteral(DoubleLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        String num = ctx.DOUBLE().getText();
        return new DoubleLiteralExpression(line, Double.parseDouble(num));
    }

    @Override
    public BaseNode visitStringLiteral(StringLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        String raw = ctx.STRING().getText();
        String value = raw.substring(1, raw.length() - 1);
        return new StringLiteralExpression(line, value);
    }

    @Override
    public BaseNode visitFStringLiteral(FStringLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        String raw = ctx.FSTRING().getText();
        String value = raw.substring(1, raw.length() - 1);
        return new FStringLiteralExpression(line, value);
    }

    @Override
    public BaseNode visitBooleanLiteral(BooleanLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        Boolean value = ctx.TRUE() != null;
        return new BooleanLiteralExpression(line, value);
    }

    @Override
    public BaseNode visitIdentifierLiteral(IdentifierLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        String value = ctx.IDENTIFIER().getText();
        return new IdentifierExpression(line, value);
    }

    @Override
    public BaseNode visitNullLiteral(NullLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        return new NullLiteralExpression(line);
    }
}
