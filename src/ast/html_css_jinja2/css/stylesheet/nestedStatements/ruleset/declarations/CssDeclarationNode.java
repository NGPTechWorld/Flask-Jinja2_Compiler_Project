package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.CssExpressionNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.property.helper_abstract.CssPropertyNode;

//color: red;
public class CssDeclarationNode extends CssNode {

    int line;
    CssPropertyNode property;
    CssExpressionNode expression;
    boolean important;

    public CssDeclarationNode(int line, CssPropertyNode property, CssExpressionNode expression, boolean important) {
        super("CssDeclaration", line);
        this.line = line;
        this.property = property;
        this.expression = expression;
        this.important = important;
    }

    // @Override
    // public String toString(int indent) {
    // return " ".repeat(indent)
    // + "(line " + line + ") CssDeclaration "
    // + property + ": " + value;
    // }
    // TODO indent
    @Override
    public String toString() {
        return "CssDeclarationNode{" +
                "property=" + property +
                ", expression=" + expression +
                ", important=" + important +
                '}';
    }

}
