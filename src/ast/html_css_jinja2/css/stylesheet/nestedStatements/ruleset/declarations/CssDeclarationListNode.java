package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations;

import java.util.ArrayList;
import java.util.List;

import ast.html_css_jinja2.css.helper_abstract.CssNode;

public class CssDeclarationListNode extends CssNode {
    int line;
    List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssDeclarationListNode(String name, int line) {
        super(name, line);
    }

    public void addDeclaration(CssDeclarationNode declaration) {
        this.declarations.add(declaration);
    }
    // REVIEW indent

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append(" {");
        for (CssDeclarationNode declaration : declarations) {
            sb.append("\n").append(declaration.toString(indent + 2));
        }
        sb.append("\n").append(" ".repeat(indent)).append("}");
        return sb.toString();
    }
}
