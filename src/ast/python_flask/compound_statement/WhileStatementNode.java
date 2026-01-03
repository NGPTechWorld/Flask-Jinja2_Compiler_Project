package ast.python_flask.compound_statement;

import ast.python_flask.BodyNode;
import ast.python_flask.StatementNode;
import ast.python_flask.expressions_roles.ExpressionNode;

public class WhileStatementNode extends StatementNode{
    public ExpressionNode iterable;
    public BodyNode body;
    public WhileStatementNode(int line, ExpressionNode iterable ,BodyNode body) {
        super("WhileStatement", line);
        this.iterable =iterable;
        this.body=body;
    }
    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent) + "while");
        sb.append("\n").append(iterable.toString(indent + 2));
        sb.append("\n").append(body.toString(indent + 2));
        return sb.toString();
    }
}
