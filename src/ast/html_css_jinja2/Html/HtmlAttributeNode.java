package ast.html_css_jinja2.Html;

import ast.html_css_jinja2.Html.helper_abstract.HtmlNode;

public class HtmlAttributeNode extends HtmlNode {
    public String name;
    public String value;

    public HtmlAttributeNode(int line, String name, String value) {
        super("HtmlAttribute", line);
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        if (value == null) {
            return " ".repeat(indent) + "(line " + line + ") HtmlAttribute " + name;
        }
        return " ".repeat(indent) + "(line " + line + ") HtmlAttribute "
                + name + "=\"" + value + "\"";
    }
}
