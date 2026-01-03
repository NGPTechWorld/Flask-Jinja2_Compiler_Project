package ast.python_flask.simple_statement;

import java.util.List;

import ast.python_flask.StatementNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class ExpressionStatementNode extends StatementNode {

    public List<ExpressionNode> expressions;

    public ExpressionStatementNode(int line, List<ExpressionNode> expressions) {
        super("ExpressionStatement", line);
        this.expressions = expressions;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+"\n");

        for (int i = 0; i < expressions.size(); i++) {
            sb.append(expressions.get(i).toString(indent+2));
            if (i < expressions.size() - 1)
                sb.append(", ");
        }
        return sb.toString();
    }
}