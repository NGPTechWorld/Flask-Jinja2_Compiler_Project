package ast.html_css_jinja2.Jinja2;


// ! @Osama_Zerkawi what is Literal
public class Jinja2LiteralNode extends Jinja2Node {
    public String value;
    public String type;

    public Jinja2LiteralNode(int line, String type, String value) {
        super("Jinja2Literal", line);
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString(int indent) {
        return super.toString(indent) + "[" + type + "] " + value;
    }
}
