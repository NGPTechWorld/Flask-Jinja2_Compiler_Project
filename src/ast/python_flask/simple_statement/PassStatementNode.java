package ast.python_flask.simple_statement;

import ast.python_flask.StatementNode;

public class PassStatementNode extends StatementNode {

    public PassStatementNode(int line) {
        super("PassStatement", line);
    }

    @Override
    public String toString() {
        return super.toString() + "pass";
    }
}
