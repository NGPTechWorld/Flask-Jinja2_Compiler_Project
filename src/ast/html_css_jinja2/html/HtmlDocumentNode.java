package ast.html_css_jinja2.html;

import java.util.List;

import ast.html_css_jinja2.AstNode;

public class HtmlDocumentNode implements HtmlNode {

    public final List<AstNode> elements;
    public final int line;

    public HtmlDocumentNode(List<AstNode> elements, int line) {
        this.elements = elements;
        this.line = line;
    }

    @Override
    public String toJson(int indent) {
        String s = " ".repeat(indent) + "HtmlDocument (line " + line + ")\n";
        for (AstNode e : elements)
            s += e.toJson(indent + 2);
        return s;
    }
}