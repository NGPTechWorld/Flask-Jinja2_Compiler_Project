package ast.html_css_jinja2.jinjaBlock.jinjaStatement;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.helper_abstract.JinjaStatementNode;

public class JinjaForNode extends JinjaStatementNode {
    public List<String> variables = new ArrayList<>();

    public JinjaExpression iterable;

    public JinjaExpression ifCondition; // nullable

    public List<BaseNode> body = new ArrayList<>();

    public List<BaseNode> elseBody = new ArrayList<>();

    public JinjaForNode(int line) {
        super("JinjaFor", line);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(" ".repeat(indent));
        sb.append("(line ").append(line).append(") JinjaFor ");

        // print variables
        sb.append(String.join(", ", variables));
        sb.append(" in ").append(iterable);

        if (ifCondition != null) {
            sb.append(" if ").append(ifCondition);
        }

        sb.append("\n").append(" ".repeat(indent + 2)).append("Body:");
        for (BaseNode n : body) {
            sb.append("\n").append(n.toString(indent + 4));
        }

        if (!elseBody.isEmpty()) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Else:");
            for (BaseNode n : elseBody) {
                sb.append("\n").append(n.toString(indent + 4));
            }
        }

        return sb.toString();
    }
}