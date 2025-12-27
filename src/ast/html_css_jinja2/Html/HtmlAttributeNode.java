package ast.html_css_jinja2.Html;

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
        return super.toString(indent) + name + "=\"" + value + "\"";
    }
}
