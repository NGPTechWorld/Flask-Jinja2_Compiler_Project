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
    //TODO indent
    @Override
    public String toString() {
        return "MediaExpressionNode{" +
                "feature='" + feature + '\'' +
                ", expression=" + expression +
                '}';
    }

}
