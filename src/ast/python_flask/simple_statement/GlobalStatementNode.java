package ast.python_flask.simple_statement;

import java.util.List;

import ast.python_flask.StatementNode;

public class GlobalStatementNode extends StatementNode {
    public List<String> names;

    public GlobalStatementNode(int line, List<String> names) {
        super("GlobalStatement", line);
        this.names = names;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "global " + String.join(", ", names);
    }
}
