package ast.python_flask.expressions_roles;

public abstract class UnaryExpressionNode extends ExpressionNode {

    public String operator;
    public ExpressionNode expr;

    public UnaryExpressionNode(String name, int line, String operator, ExpressionNode expr) {
        super(name, line);
        this.operator = operator;
        this.expr = expr;
    }

    @Override
    public String toString(int indent) {
        return operator + " " + expr.toString(0);
    }
}