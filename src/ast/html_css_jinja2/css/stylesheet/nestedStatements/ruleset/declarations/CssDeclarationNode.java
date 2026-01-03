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

    // REVIEW indent

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(super.toString(indent));
        sb.append(" ").append(property.toString(0)).append(": ").append(expression.toString(0));
        if (important) {
            sb.append(" !important");
        }
        sb.append(";");
        return sb.toString();
    }

}
