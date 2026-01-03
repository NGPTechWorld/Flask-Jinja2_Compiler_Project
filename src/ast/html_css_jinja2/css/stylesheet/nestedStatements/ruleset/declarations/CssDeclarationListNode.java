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
    // TODO indent
    @Override
    public String toString() {
        return "CssDeclarationListNode{" + "declarations=" + declarations + '}';
    }
}
