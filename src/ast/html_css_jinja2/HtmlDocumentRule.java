package ast.html_css_jinja2;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;

public class HtmlDocumentRule extends BaseNode {
    public List<BaseNode> children = new ArrayList<>();

    public HtmlDocumentRule(int line) {
        super("HtmlDocument", line);
    }

    public void addChild(BaseNode node) {
        children.add(node);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        for (BaseNode child : children) {
            sb.append("\n").append(child.toString(indent + 2));
        }
        return sb.toString();
    }
}
