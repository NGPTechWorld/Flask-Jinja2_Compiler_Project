package ast.html_css_jinja2.css.stylesheet.nestedStatements.media.mediaQueryList;

import ast.html_css_jinja2.css.helper_abstract.CssNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.CssExpressionNode;

public class MediaExpressionNode extends CssNode {
    int line;
    String feature; // e.g., "max-width"
    CssExpressionNode expression; // e.g., "600px"

    public MediaExpressionNode(String name, int line, String feature, CssExpressionNode expression) {
        super(name, line);
        this.line = line;
        this.feature = feature;
        this.expression = expression;
    }


    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(feature);
        if (expression != null) {
            sb.append(": ").append(expression.toString(0));
        }
        sb.append(")");
        return sb.toString();
    }

}
