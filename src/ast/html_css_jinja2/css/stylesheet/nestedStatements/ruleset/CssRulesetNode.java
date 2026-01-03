package ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset;

import ast.html_css_jinja2.css.stylesheet.nestedStatements.helper_abstract.CssNestedStatement;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.CssDeclarationListNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.SelectorGroupNode;

//h1, .title {
//color: red;   
//  font-size: 20px;
//}

public class CssRulesetNode extends CssNestedStatement {

    int line;
    SelectorGroupNode selectors;
    CssDeclarationListNode declarations; // Can be null

    public CssRulesetNode(int line, SelectorGroupNode selectors, CssDeclarationListNode declarations) {
        super("CssRuleset", line);
        this.line = line;
        this.selectors = selectors;
        this.declarations = declarations;
    }

    // TODO indent
    @Override
    public String toString() {
        return "CssRulesetNode{" +
                "selectors=" + selectors +
                ", declarations=" + declarations +
                '}';
    }

    // @Override
    // public String toString(int indent) {
    //     StringBuilder sb = new StringBuilder(" ".repeat(indent));
    //     sb.append("(line ").append(line).append(") CssRuleset ").append(selectors);

    //     // for (var d : declarations) {
    //     //     sb.append("\n").append(d.toString(indent + 2));
    //     // }
    //     return sb.toString();
    // }

}
