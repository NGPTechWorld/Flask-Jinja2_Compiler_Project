package ast.python_flask.simple_statement.expression_stat.expressions;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;
import ast.python_flask.simple_statement.expression_stat.UnaryExpressionNode;

public class NotExpressionNode extends UnaryExpressionNode {
    public NotExpressionNode(int line, ExpressionNode exp) {
        super("NotExpression", line,  "not",exp);
    }
}