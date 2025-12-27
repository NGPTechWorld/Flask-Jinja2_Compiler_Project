package visitor.python_flask;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

import antlr.python_flask.generated.*;
import antlr.python_flask.generated.PythonParser.*;
import ast.BaseNode;
import ast.python_flask.*;
import ast.python_flask.argument.ArgumentNode;
import ast.python_flask.compound_statement.BodyNode;
import ast.python_flask.compound_statement.ClassDefintionNode;
import ast.python_flask.compound_statement.ForStatementNode;
import ast.python_flask.compound_statement.IfStatementNode;
import ast.python_flask.compound_statement.WhileStatementNode;
import ast.python_flask.compound_statement.function_defintion.DecoratorNode;
import ast.python_flask.compound_statement.function_defintion.FunctionDefNode;
import ast.python_flask.compound_statement.function_defintion.param.KwVarArgParamNode;
import ast.python_flask.compound_statement.function_defintion.param.NormalParamNode;
import ast.python_flask.compound_statement.function_defintion.param.ParamNode;
import ast.python_flask.compound_statement.function_defintion.param.VarArgParamNode;
import ast.python_flask.literal.*;
import ast.python_flask.simple_statement.*;
import ast.python_flask.simple_statement.assignment_stat.AssignmentOperator;
import ast.python_flask.simple_statement.assignment_stat.AssignmentStatementNode;
import ast.python_flask.simple_statement.assignment_stat.TargetNode;
import ast.python_flask.simple_statement.assignment_stat.target.AttributeTargetNode;
import ast.python_flask.simple_statement.assignment_stat.target.SubscriptTargetNode;
import ast.python_flask.simple_statement.assignment_stat.target.VarTargetNode;
import ast.python_flask.simple_statement.expression_stat.*;
import ast.python_flask.simple_statement.expression_stat.atom.*;
import ast.python_flask.simple_statement.expression_stat.expressions.*;
import ast.python_flask.simple_statement.expression_stat.trailer.AttributeTrailerNode;
import ast.python_flask.simple_statement.expression_stat.trailer.CallTrailerNode;
import ast.python_flask.simple_statement.expression_stat.trailer.SubscriptTrailerNode;
import ast.python_flask.simple_statement.expression_stat.trailer.TrailerNode;
import ast.python_flask.simple_statement.import_stat.*;

public class ASTBuilderVisitor extends PythonParserBaseVisitor<BaseNode> {

    // ============================================================
    // Program
    // ============================================================
    @Override
    public BaseNode visitProgram(PythonParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode(1);

        for (var stmt : ctx.statement()) {
            BaseNode node = visit(stmt);
            if (node != null) {
                program.addStatement((StatementNode) node);
            }
        }
        return program;
    }

    // ============================================================
    // Compound Statement
    // ============================================================
    @Override
    public BaseNode visitCompoundStatement(CompoundStatementContext ctx) {
        return visitChildren(ctx);
    }

    // ============================================================
    // Class Defintion
    // ============================================================
    @Override
    public BaseNode visitClassDef(ClassDefContext ctx) {
        int line = ctx.getStart().getLine();
        IdentifierExpression nameClass = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(),
                ctx.IDENTIFIER().getText());
        List<ExpressionNode> arguments = new ArrayList<>();
        if (ctx.arglist() != null) {
            for (var argCtx : ctx.arglist().argument()) {
                arguments.add((ArgumentNode) visit(argCtx));
            }
        }
        BodyNode bodyNode = (BodyNode) visit(ctx.body());
        return new ClassDefintionNode(line, nameClass, arguments, bodyNode);
    }

    @Override
    public BaseNode visitBody(BodyContext ctx) {
        int line = ctx.getStart().getLine();
        List<StatementNode> statements = new ArrayList<>();
        for (var stmt : ctx.statement()) {
            BaseNode node = visit(stmt);
            if (node != null) {
                statements.add((StatementNode) node);
            }
        }
        return new BodyNode(line, statements);
    }

    // ============================================================
    // If Statement
    // ============================================================
    @Override
    public BaseNode visitIfStatement(IfStatementContext ctx) {
        int line = ctx.getStart().getLine();

        ExpressionNode ifCondition = (ExpressionNode) visit(ctx.expression(0));
        BodyNode bodyIf = (BodyNode) visit(ctx.body(0));

        List<Pair<ExpressionNode, BodyNode>> elseIfStat = new ArrayList<>();

        int elifCount = ctx.ELIF().size();
        for (int i = 0; i < elifCount; i++) {
            ExpressionNode cond = (ExpressionNode) visit(ctx.expression(i + 1));
            BodyNode body = (BodyNode) visit(ctx.body(i + 1));
            elseIfStat.add(new Pair<>(cond, body));
        }

        BodyNode bodyElse = null;
        if (ctx.ELSE() != null) {
            bodyElse = (BodyNode) visit(ctx.body(ctx.body().size() - 1));
        }

        return new IfStatementNode(line, ifCondition, bodyIf, elseIfStat, bodyElse);
    }

    // ============================================================
    // For loob Statement
    // ============================================================
    @Override
    public BaseNode visitForStatement(PythonParser.ForStatementContext ctx) {
        int line = ctx.getStart().getLine();
        List<TargetNode> targets = new ArrayList<>();
        for (var t : ctx.targetList().target()) {
            targets.add((TargetNode) visit(t));
        }
        List<ExpressionNode> iterables = new ArrayList<>();
        for (var e : ctx.expressionList().expression()) {
            iterables.add((ExpressionNode) visit(e));
        }
        BodyNode body = (BodyNode) visit(ctx.body());

        return new ForStatementNode(line, targets, iterables, body);
    }

    // ============================================================
    // While loob Statement
    // ============================================================
    @Override
    public BaseNode visitWhileStatement(WhileStatementContext ctx) {
        int line = ctx.getStart().getLine();

        ExpressionNode iterable = (ExpressionNode) visit(ctx.expression());
        BodyNode body = (BodyNode) visit(ctx.body());

        return new WhileStatementNode(line, iterable, body);
    }

    // ============================================================
    // Function Defintion
    // ============================================================
    @Override
    public BaseNode visitFuncdef(FuncdefContext ctx) {
        FunctionDefNode node = new FunctionDefNode(ctx.getStart().getLine());
        if (ctx.decorators() != null) {
            for (var dec : ctx.decorators().decorator()) {
                node.decorators.add((DecoratorNode) visit(dec));
            }
        }
        node.name = new IdentifierExpression(
                ctx.IDENTIFIER().getSymbol().getLine(),
                ctx.IDENTIFIER().getText());
        if (ctx.parameters() != null) {
            for (var p : ctx.parameters().param()) {
                node.parameters.add((ParamNode) visit(p));
            }
        }
        if (ctx.expression() != null) {
            node.returnType = (ExpressionNode) visit(ctx.expression());
        }
        node.body = (BodyNode) visit(ctx.body());
        return node;
    }

    @Override
    public BaseNode visitDecorator(DecoratorContext ctx) {
        DecoratorNode node = new DecoratorNode(ctx.getStart().getLine());
        for (var id : ctx.dottedName().IDENTIFIER()) {
            node.path.add(new IdentifierExpression(id.getSymbol().getLine(),
                    id.getText()));
        }
        if (ctx.arglist() != null) {
            node.arguments = new ArrayList<>();
            for (var a : ctx.arglist().argument()) {
                node.arguments.add((ArgumentNode) visit(a));
            }
        }
        return node;
    }

    // Params
    @Override
    public BaseNode visitNormalParam(PythonParser.NormalParamContext ctx) {
        IdentifierExpression id = new IdentifierExpression(ctx.start.getLine(), ctx.IDENTIFIER().getText());
        ExpressionNode defaultValue = null;
        if (ctx.expression() != null) {
            defaultValue = (ExpressionNode) visit(ctx.expression());
        }
        return new NormalParamNode(
                ctx.start.getLine(),
                id,
                defaultValue);
    }

    @Override
    public BaseNode visitVarArgParam(PythonParser.VarArgParamContext ctx) {
        return new VarArgParamNode(
                ctx.start.getLine(),
                new IdentifierExpression(ctx.start.getLine(), ctx.IDENTIFIER().getText()));
    }

    @Override
    public BaseNode visitKwVarArgParam(PythonParser.KwVarArgParamContext ctx) {
        return new KwVarArgParamNode(
                ctx.start.getLine(),
                new IdentifierExpression(ctx.start.getLine(), ctx.IDENTIFIER().getText()));
    }

    // ============================================================
    // Simple Statement
    // ============================================================
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

    // ============================================================
    // Pass Statement
    // ============================================================
    @Override
    public BaseNode visitPassStatement(PythonParser.PassStatementContext ctx) {
        return new PassStatementNode(ctx.PASS().getSymbol().getLine());
    }

    // ============================================================
    // Continue Statement
    // ============================================================
    @Override
    public BaseNode visitContinueStatement(PythonParser.ContinueStatementContext ctx) {
        return new ContinueStatementNode(ctx.CONTINUE().getSymbol().getLine());
    }

    // ============================================================
    // Break Statement
    // ============================================================
    @Override
    public BaseNode visitBreakStatement(PythonParser.BreakStatementContext ctx) {
        return new BreakStatementNode(ctx.BREAK().getSymbol().getLine());
    }

    // ============================================================
    // Global Statement
    // ============================================================
    @Override
    public BaseNode visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        int line = ctx.GLOBAL().getSymbol().getLine();
        var names = ctx.IDENTIFIER()
                .stream()
                .map(t -> t.getText())
                .toList();

        return new GlobalStatementNode(line, names);
    }

    // ============================================================
    // Return Statement
    // ============================================================
    @Override
    public BaseNode visitReturnStatement(ReturnStatementContext ctx) {
        int line = ctx.getStart().getLine();
        List<ExpressionNode> values = new ArrayList<>();
        if (ctx.expressionList() != null)
            for (var e : ctx.expressionList().expression()) {
                values.add((ExpressionNode) visit(e));
            }
        return new ReturnStatementNode(line, values);
    }

    // ============================================================
    // Import Statement
    // ============================================================
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

    // ============================================================
    // Assignment Statement
    // ============================================================
    @Override
    public BaseNode visitAssignmentStatement(PythonParser.AssignmentStatementContext ctx) {
        int line = ctx.getStart().getLine();
        List<TargetNode> targets = new ArrayList<>();
        for (var t : ctx.targetList().target()) {
            targets.add((TargetNode) visit(t));
        }
        AssignmentOperator operator;
        if (ctx.augmentedAssignment() != null) {
            operator = switch (ctx.augmentedAssignment().getText()) {
                case "+=" -> AssignmentOperator.ADD_ASSIGN;
                case "-=" -> AssignmentOperator.SUB_ASSIGN;
                case "*=" -> AssignmentOperator.MUL_ASSIGN;
                case "/=" -> AssignmentOperator.DIV_ASSIGN;
                case "%=" -> AssignmentOperator.MOD_ASSIGN;
                default -> throw new RuntimeException("Unknown augmented assignment");
            };
        } else {
            operator = AssignmentOperator.ASSIGN;
        }
        List<ExpressionNode> values = new ArrayList<>();
        for (var e : ctx.expressionList().expression()) {
            values.add((ExpressionNode) visit(e));
        }
        return new AssignmentStatementNode(line, targets, operator, values);
    }

    // Target
    @Override
    public BaseNode visitSubscriptTarget(PythonParser.SubscriptTargetContext ctx) {
        int line = ctx.getStart().getLine();
        TargetNode base = (TargetNode) visit(ctx.target());
        ExpressionNode index = (ExpressionNode) visit(ctx.expression());
        return new SubscriptTargetNode(line, index, base);
    }

    @Override
    public BaseNode visitAttributeTarget(PythonParser.AttributeTargetContext ctx) {
        int line = ctx.getStart().getLine();
        TargetNode base = (TargetNode) visit(ctx.target());
        IdentifierExpression attr = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(),
                ctx.IDENTIFIER().getText());
        return new AttributeTargetNode(line, attr, base);
    }

    @Override
    public BaseNode visitVarTarget(PythonParser.VarTargetContext ctx) {
        int line = ctx.getStart().getLine();
        return new VarTargetNode(
                line,
                new IdentifierExpression(line, ctx.IDENTIFIER().getText()));
    }

    // ============================================================
    // Atom Expression
    // ============================================================
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

    @Override
    public BaseNode visitLiteralAtom(LiteralAtomContext ctx) {
         int line = ctx.getStart().getLine();
         LiteralNode literal = (LiteralNode) visit(ctx.literal());
        return new LiteralAtomNode(line, literal);
    }
    // Trailer
    @Override
    public BaseNode visitAttributeTrailer(AttributeTrailerContext ctx) {
        int line = ctx.getStart().getLine();
        IdentifierExpression identifierExpression = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(),
                ctx.IDENTIFIER().getText());
        return new AttributeTrailerNode(line, identifierExpression);
    }

    @Override
    public BaseNode visitSubscriptTrailer(SubscriptTrailerContext ctx) {
        int line = ctx.getStart().getLine();
        return new SubscriptTrailerNode(line, (ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public BaseNode visitCallTrailer(CallTrailerContext ctx) {
        int line = ctx.getStart().getLine();
        List<ExpressionNode> arguments = new ArrayList<>();
        if (ctx.arglist() != null) {
            for (var argCtx : ctx.arglist().argument()) {
                arguments.add((ArgumentNode) visit(argCtx));
            }
        }
        return new CallTrailerNode(line, arguments);
    }

    @Override
    public BaseNode visitArgument(PythonParser.ArgumentContext ctx) {
        int line = ctx.getStart().getLine();
        // **kwargs
        if (ctx.POWER() != null) {
            return new ArgumentNode(
                    line,
                    (ExpressionNode) visit(ctx.expression()));
        }
        // positional or keyword
        IdentifierExpression identifierExpression = null;
        if (ctx.IDENTIFIER() != null) {
            identifierExpression = new IdentifierExpression(ctx.IDENTIFIER().getSymbol().getLine(),
                    ctx.IDENTIFIER().getText());
        }
        return new ArgumentNode(
                line,
                identifierExpression,
                (ExpressionNode) visit(ctx.expression()));
    }

    // ============================================================
    // Expressions
    // ============================================================
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

    // ============================================================
    // Literal
    // ============================================================
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
