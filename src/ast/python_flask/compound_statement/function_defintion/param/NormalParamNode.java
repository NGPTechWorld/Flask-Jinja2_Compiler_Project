package ast.python_flask.compound_statement.function_defintion.param;

import ast.python_flask.literal.IdentifierExpression;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class NormalParamNode extends ParamNode {
    public IdentifierExpression name;
    public ExpressionNode defaultValue; // nullable

    public NormalParamNode(
            int line,
            IdentifierExpression name,
            ExpressionNode defaultValue
    ) {
        super("NormalParam", line);
        this.name = name;
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent) + "");
        sb.append("\n").append(name.toString(indent + 2));
        if(defaultValue != null)
        sb.append("\n").append(defaultValue.toString(indent + 2));
        return sb.toString();
    }
}

