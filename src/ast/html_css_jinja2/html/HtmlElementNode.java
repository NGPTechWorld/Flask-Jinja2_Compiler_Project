package ast.html_css_jinja2.html;

import java.util.List;

import ast.html_css_jinja2.AstNode;

public class HtmlElementNode implements HtmlNode {

    public final String tagName;
    public final List<HtmlAttributeNode> attributes;
    public final List<AstNode> children;
    public final int line;

    public HtmlElementNode(String tagName, List<HtmlAttributeNode> attributes,
            List<AstNode> children, int line) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
        this.line = line;
    }

    @Override
    public String toJson(int indent) {
        String s = " ".repeat(indent) +
                "Element <" + tagName + "> (line " + line + ")\n";

        for (HtmlAttributeNode a : attributes)
            s += a.toJson(indent + 2);

        for (AstNode c : children)
            s += c.toJson(indent + 2);

        return s;
    }
}