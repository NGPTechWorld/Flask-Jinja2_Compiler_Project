package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.CssExpressionNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

// a generic CSS function term like rgb(), rgba(), translateX(),
public class CssFunctionTermNode extends CssTermNode {
    int line;
    String name; // The function name, e.g., 'rgb', 'translateX'
    CssExpressionNode parameters; // The expressions inside the parentheses

    public CssFunctionTermNode(String name, int line, CssExpressionNode parameters) {
        super(name, line);
        this.line = line;
        this.name = name;
        this.parameters = parameters;
    }

    // REVIEW indent
    @Override
    public String toString(int indent) {
        return name + "(" + parameters.toString(0) + ")";
    }

}
