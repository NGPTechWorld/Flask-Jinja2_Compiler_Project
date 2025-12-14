package ast.python_flask.simple_statement;

import ast.python_flask.StatementNode;

public class BreakStatementNode extends StatementNode {

    public BreakStatementNode(int line) {
        super("BreakStatement", line);
    }

    @Override
    public String toString() {
        return super.toString() + "break";
    }
}
