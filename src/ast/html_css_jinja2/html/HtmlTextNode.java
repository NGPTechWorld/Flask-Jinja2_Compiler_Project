package ast.html_css_jinja2.html;


public class HtmlTextNode implements HtmlNode {

    public final String text;
    public final int line;

    public HtmlTextNode(String text, int line) {
        this.text = text;
        this.line = line;
    }

    @Override
    public String toJson(int indent) {
        return " ".repeat(indent) +
                "Text \"" + text + "\" (line " + line + ")\n";
    }
}