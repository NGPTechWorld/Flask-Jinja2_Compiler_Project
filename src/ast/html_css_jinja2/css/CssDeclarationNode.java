package ast.html_css_jinja2.css;

//color: red;
public class CssDeclarationNode extends CssNode {

    public String property;
    public String value;

    public CssDeclarationNode(int line, String property, String value) {
        super("CssDeclaration", line);
        this.property = property;
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return " ".repeat(indent)
                + "(line " + line + ") CssDeclaration "
                + property + ": " + value;
    }

}
