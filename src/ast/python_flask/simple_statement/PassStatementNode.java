package ast.python_flask.simple_statement;

import ast.python_flask.StatementNode;

public class PassStatementNode extends StatementNode {

    public PassStatementNode(int line) {
        super("PassStatement", line);
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "pass";
    }

}
