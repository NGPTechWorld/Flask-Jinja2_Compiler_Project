package ast.python_flask.simple_statement.assignment_stat;

import java.util.ArrayList;
import java.util.List;

import ast.python_flask.StatementNode;
import ast.python_flask.simple_statement.expression_stat.ExpressionNode;

public class AssignmentStatementNode extends StatementNode {
    public List<TargetNode> targets = new ArrayList<>();
    public AssignmentOperator operator;
    public List<ExpressionNode> values = new ArrayList<>();

    public AssignmentStatementNode(
            int line,
            List<TargetNode> targets,
            AssignmentOperator operator,
            List<ExpressionNode> values) {

        super("AssignmentStatement", line);
        this.targets = targets;
        this.operator = operator;
        this.values = values;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        for (var t : targets) {
            sb.append("\n").append(t.toString(indent + 2));
        }
        sb.append("\n").append(" ".repeat(indent + 2))
                .append("Operator: ").append(operator);
        for (var v : values) {
            sb.append("\n").append(v.toString(indent + 2));
        }
        return sb.toString();
    }
}
