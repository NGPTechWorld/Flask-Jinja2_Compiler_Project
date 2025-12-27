package ast.html_css_jinja2.Css;

// ! @Osama_Zerkawi this is important
public class CssDeclarationNode extends CssNode {

    public String property;
    public String value;
    public boolean important;

    public CssDeclarationNode(int line, String property, String value, boolean important) {
        super("CssDeclaration", line);
        this.property = property;
        this.value = value;
        this.important = important;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + property + ": " + value + (important ? " !important" : "");
    }
}
