package ast.python_flask.simple_statement;

import ast.python_flask.StatementNode;

public class ContinueStatementNode extends StatementNode {

    public ContinueStatementNode(int line) {
        super("ContinueStatement", line);
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "continue";
    }

}
