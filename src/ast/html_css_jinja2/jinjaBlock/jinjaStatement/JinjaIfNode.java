package ast.html_css_jinja2.jinjaBlock.jinjaStatement;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

import ast.BaseNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.helper_abstract.JinjaStatementNode;

public class JinjaIfNode extends JinjaStatementNode {
    public JinjaExpression ifCondition;
    public JinjaBodyNode bodyIf;
    public List<Pair<JinjaExpression, JinjaBodyNode>> elseIfStat = new ArrayList<>();
    public JinjaBodyNode bodyElse;

    public JinjaIfNode(int line, JinjaExpression ifCondition, JinjaBodyNode bodyIf,
            List<Pair<JinjaExpression, JinjaBodyNode>> elseIfStat, JinjaBodyNode bodyElse) {

        super("JinjaIf", line);
        this.ifCondition = ifCondition;
        this.bodyIf = bodyIf;
        this.elseIfStat = elseIfStat;
        this.bodyElse = bodyElse;

    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(" ".repeat(indent));
        sb.append("(line ").append(line).append(") JinjaIf if ").append(ifCondition);

        sb.append("\n").append(" ".repeat(indent + 2)).append("Body:");
        for (BaseNode child : bodyIf.children) {
            sb.append("\n").append(child.toString(indent + 4));
        }

        for (Pair<JinjaExpression, JinjaBodyNode> elif : elseIfStat) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Elif ").append(elif.a);
            for (BaseNode child : elif.b.children) {
                sb.append("\n").append(child.toString(indent + 4));
            }
        }

        if (bodyElse != null) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("Else:");
            for (BaseNode child : bodyElse.children) {
                sb.append("\n").append(child.toString(indent + 4));
            }
        }

        return sb.toString();
    }

}
