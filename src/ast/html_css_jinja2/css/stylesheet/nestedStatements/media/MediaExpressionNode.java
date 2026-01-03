package ast.html_css_jinja2.css.stylesheet.nestedStatements.media;

import ast.html_css_jinja2.css.CssRuleNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.expressionsAndTerms.CssExpressionNode;

public class MediaExpressionNode extends CssRuleNode {
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
