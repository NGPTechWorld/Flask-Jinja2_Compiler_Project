package visitor.python_flask;

import java.util.List;

import antlr.python_flask.generated.*;
import ast.BaseNode;
import ast.python_flask.ProgramNode;
import ast.python_flask.StatementNode;
import ast.python_flask.simple_statement.BreakStatementNode;
import ast.python_flask.simple_statement.ContinueStatementNode;
import ast.python_flask.simple_statement.GlobalStatementNode;
import ast.python_flask.simple_statement.PassStatementNode;
import ast.python_flask.simple_statement.import_stat.ImportItem;
import ast.python_flask.simple_statement.import_stat.ImportModule;
import ast.python_flask.simple_statement.import_stat.ImportStatementNode;

public class ASTBuilderVisitor extends PythonParserBaseVisitor<BaseNode> {
    @Override
    public BaseNode visitProgram(PythonParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode(1);

        for (var stmt : ctx.statement()) {
            program.addStatement((StatementNode) visit(stmt));
        }
        return program;
    }

    @Override
    public BaseNode visitPassStatement(PythonParser.PassStatementContext ctx) {
        return new PassStatementNode(ctx.PASS().getSymbol().getLine());
    }

    @Override
    public BaseNode visitContinueStatement(PythonParser.ContinueStatementContext ctx) {
        return new ContinueStatementNode(ctx.CONTINUE().getSymbol().getLine());
    }

    @Override
    public BaseNode visitBreakStatement(PythonParser.BreakStatementContext ctx) {
        return new BreakStatementNode(ctx.BREAK().getSymbol().getLine());
    }

    @Override
    public BaseNode visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        int line = ctx.GLOBAL().getSymbol().getLine();
        var names = ctx.IDENTIFIER()
                .stream()
                .map(t -> t.getText())
                .toList();

        return new GlobalStatementNode(line, names);
    }

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

}
