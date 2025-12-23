package ast.python_flask.literal;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public abstract class LiteralNode extends ExpressionNode {

    public LiteralNode(String name, int line) {
        super(name, line);
    }
}
