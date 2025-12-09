package ast.python_flask;

import antlr.python_flask.generated.PythonParser;
import antlr.python_flask.generated.PythonParserBaseVisitor;
import ast.BaseNode;
import ast.python_flask.literals.*;


public class ASTBuilder extends PythonParserBaseVisitor<BaseNode>{
    // INT literal
    @Override
    public BaseNode visitIntLiteral(PythonParser.IntLiteralContext ctx) {
        String text = ctx.INT().getText();
        int line = ctx.getStart().getLine();
        return new IntLiteralNode(Integer.parseInt(text), line);
    }

    // DOUBLE literal
    @Override
    public BaseNode visitDoubleLiteral(PythonParser.DoubleLiteralContext ctx) {
        String text = ctx.DOUBLE().getText();
        int line = ctx.getStart().getLine();
        return new DoubleLiteralNode(Double.parseDouble(text), line);
    }

    // STRING literal
    @Override
    public BaseNode visitStringLiteral(PythonParser.StringLiteralContext ctx) {
        String text = ctx.STRING().getText();
        int line = ctx.getStart().getLine();
        return new StringLiteralNode(text, line);
    }

    // FSTRING literal
    @Override
    public BaseNode visitFStringLiteral(PythonParser.FStringLiteralContext ctx) {
        String text = ctx.FSTRING().getText();
        int line = ctx.getStart().getLine();
        return new FStringLiteralNode(text, line);
    }

    // TRUE / FALSE literal
    @Override
    public BaseNode visitBooleanLiteral(PythonParser.BooleanLiteralContext ctx) {
        boolean value = ctx.TRUE() != null;
        int line = ctx.getStart().getLine();
        return new BooleanLiteralNode(value, line);
    }

    // NULL literal
    @Override
    public BaseNode visitNullLiteral(PythonParser.NullLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        return new NullLiteralNode(line);
    }

    // IDENTIFIER literal
    @Override
    public BaseNode visitIdentifierLiteral(PythonParser.IdentifierLiteralContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new IdentifierLiteralNode(name, line);
    }
}
