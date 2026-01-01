package ast.html_css_jinja2.jinjaBlock.jinjaStatement;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.helper_abstract.JinjaStatementNode;

public class JinjaIfNode extends JinjaStatementNode {
    JinjaExpression ifCondition;
    JinjaBodyNode bodyIf;
    List<Pair<JinjaExpression, JinjaBodyNode>> elseIfStat = new ArrayList<>();
    JinjaBodyNode bodyElse;

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
        StringBuilder sb = new StringBuilder(super.toString(indent) + "if ");
        sb.append("\n").append(ifCondition.toString(indent + 2));
        sb.append("\n").append(bodyIf.toString(indent + 2));

        if (elseIfStat.size() != 0) {
            for (var stst : elseIfStat) {
                sb.append("\n").append(" ".repeat(indent + 2)).append("else if");
                sb.append("\n").append(stst.a.toString(indent + 4));
                sb.append("\n").append(stst.b.toString(indent + 4));
            }
        }
        if (bodyElse != null) {
            sb.append("\n").append(" ".repeat(indent + 2)).append("else ");
            sb.append("\n").append(bodyElse.toString(indent + 2));
        }

        return sb.toString();
    }

}
