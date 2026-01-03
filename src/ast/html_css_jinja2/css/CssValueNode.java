package ast.html_css_jinja2.css;

public class CssValueNode extends CssNode {

    public String text;

    public CssValueNode(int line, String text) {
        super("CssValue", line);
        this.text = text;
    }

    @Override
    public String toString(int indent) {
        return " ".repeat(indent)
                + "(line " + line + ") CssValue " + text;
    }

}
