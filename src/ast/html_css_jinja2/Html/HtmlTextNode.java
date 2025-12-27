package ast.html_css_jinja2.Html;

public class HtmlTextNode extends HtmlNode {
    public String text;

    public HtmlTextNode(String name, int line) {
        super(name, line);
        this.text = text.trim();
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "\"" + text + "\"";
    }

}