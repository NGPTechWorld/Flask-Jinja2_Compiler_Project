package ast.python_flask.simple_statement.expression_stat;

public class BinaryExpressionNode extends ExpressionNode {
    public ExpressionNode left;
    public ExpressionNode right;
    public String operator;

    public BinaryExpressionNode(
            String name,
            int line,
            ExpressionNode left,
            String operator,
            ExpressionNode right) {

        super(name, line);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + operator +"\n" +left.toString(indent+2) +"\n" + right.toString(indent+2);
    }
}
