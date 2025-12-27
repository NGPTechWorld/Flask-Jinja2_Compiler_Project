package ast.python_flask.simple_statement;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.StatementNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class ReturnStatementNode extends StatementNode {

    public List<ExpressionNode> expressions = new ArrayList<>();

    public ReturnStatementNode(int line, List<ExpressionNode> expressions) {
        super("ReternStatement", line);
        this.expressions = expressions;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent)+"return ");
        if (expressions != null) {
            for (var e : expressions)
                sb.append("\n").append(e.toString(indent + 2));
        }
        return sb.toString();
    }
}
