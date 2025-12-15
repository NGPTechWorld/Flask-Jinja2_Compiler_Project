package ast.python_flask.simple_statement;

import ast.python_flask.StatementNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class ReturnStatementNode extends StatementNode {

    public ExpressionNode value;

    public ReturnStatementNode(int line, ExpressionNode value) {
        super("ReternStatement", line);
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "return "+value;
    }
}
