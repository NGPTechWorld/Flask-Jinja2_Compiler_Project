package ast.html_css_jinja2.css;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;

public class StylesheetNode extends CssNode {

    public List<BaseNode> rules = new ArrayList<>();

    public StylesheetNode(int line) {
        super("Stylesheet", line);
    }

    public void addRule(BaseNode node) {
        rules.add(node);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(" ".repeat(indent));
        sb.append("(line ").append(line).append(") Stylesheet");

        for (var rule : rules) {

            sb.append("\n").append(rule.toString(indent + 2));
        }
        return sb.toString();
    }

}
