package ast.python_flask.simple_statement;

import ast.python_flask.StatementNode;

public class ContinueStatementNode extends StatementNode {

    public ContinueStatementNode(int line) {
        super("ContinueStatement", line);
    }

    @Override
    public String toString() {
        return super.toString() + "continue";
    }
}
