package ast.html_css_jinja2.html;


public class HtmlAttributeNode implements HtmlNode {

    public final String name;
    public final String value;
    public final int line;

    public HtmlAttributeNode(String name, String value, int line) {
        this.name = name;
        this.value = value;
        this.line = line;
    }

    @Override
    public String toJson(int indent) {
        return " ".repeat(indent) +
                "Attribute " + name + "=\"" + value + "\" (line " + line + ")\n";
    }
}