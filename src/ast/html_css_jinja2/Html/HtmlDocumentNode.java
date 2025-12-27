package ast.html_css_jinja2.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocumentNode extends HtmlNode {
    public List<HtmlNode> children = new ArrayList<>();

    public HtmlDocumentNode(int line) {
        super("HtmlDocument", line);
    }

    public void addChild(HtmlNode node) {
        children.add(node);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        for (HtmlNode child : children) {
            sb.append("\n").append(child.toString(indent + 2));
        }
        return sb.toString();
    }

}
