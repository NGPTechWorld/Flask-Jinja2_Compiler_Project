package ast.html_css_jinja2.Css;

import java.util.ArrayList;
import java.util.List;

public class CssStylesheetNode extends CssNode {

    public List<CssNode> statements = new ArrayList<>();

    public CssStylesheetNode(int line) {
        super("CssStylesheet", line);
    }

    public void addStatement(CssNode statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        for (CssNode stmt : statements) {
            sb.append("\n").append(stmt.toString(indent + 2));
        }
        return sb.toString();
    }

}
