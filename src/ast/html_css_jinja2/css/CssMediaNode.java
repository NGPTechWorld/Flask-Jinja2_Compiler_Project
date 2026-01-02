package ast.html_css_jinja2.css;

import java.util.ArrayList;
import java.util.List;


public class CssMediaNode extends CssRuleNode {

    public String query;
    public List<CssRuleNode> rules = new ArrayList<>();

    public CssMediaNode(int line, String query) {
        super("CssMedia", line);
        this.query = query;
    }

    public void addRule(CssRuleNode node) {
        rules.add(node);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(" ".repeat(indent));
        sb.append("(line ").append(line)
                .append(") CssMedia @media ").append(query);

        for (var rule : rules) {
            sb.append("\n").append(rule.toString(indent + 2));
        }
        return sb.toString();
    }

}
