package ast.html_css_jinja2.css;

public class CssSelectorNode extends CssNode {
    // combinators, pseudos in future
    public String text; // raw selector text

    public CssSelectorNode(int line, String text) {
        super("CssSelector", line);
        this.text = text;
    }

    @Override
    public String toString(int indent) {
        return " ".repeat(indent)
                + "(line " + line + ") CssSelector " + text;
    }

}