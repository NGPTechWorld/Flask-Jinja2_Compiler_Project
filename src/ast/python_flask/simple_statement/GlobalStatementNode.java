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
    public String toString() {
        return super.toString() + "global " + String.join(", ", names);
    }

}
