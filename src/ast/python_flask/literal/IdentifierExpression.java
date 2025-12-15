package ast.python_flask.literal;

import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class IdentifierExpression extends ExpressionNode {

    public String name;

    public IdentifierExpression(int line, String name) {
        super("Identifier", line);
        this.name = name;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent)+ name;
    }
}
