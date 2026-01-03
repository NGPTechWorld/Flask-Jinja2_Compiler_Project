package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;

// var() function , e.'var(--main-color)'.
public class CssVariableTermNode extends CssTermNode {
    int line;
    String variableName; // The name of the variable, e.g., '--main-color'

    public CssVariableTermNode(String name, int line, String variableName) {
        super(name, line);
        this.line = line;
        this.variableName = variableName;
    }

    // REVIEW
    @Override
    public String toString(int indent) {
        return "var(--" + variableName + ")";
    }

}
