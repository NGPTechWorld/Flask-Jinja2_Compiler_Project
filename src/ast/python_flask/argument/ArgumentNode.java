package ast.python_flask.argument;

import ast.python_flask.literal.IdentifierExpression;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class ArgumentNode extends ExpressionNode {

    public IdentifierExpression name; // optional
    public ExpressionNode value;
    public boolean isPower;

    public ArgumentNode(int line, IdentifierExpression name, ExpressionNode value) {
        super("Argument", line);
        this.name = name;
        this.value = value;
        this.isPower = false;
    }

    public ArgumentNode(int line, ExpressionNode value) {
        super("Argument", line);
        this.value = value;
        this.isPower = true;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        if (name != null)
            sb.append("\n").append(name.toString(indent+2)).append(" =");
        if (isPower)
            sb.append("**");
        sb.append("\n").append(value.toString(indent + 2));
        return sb.toString();
    }
}