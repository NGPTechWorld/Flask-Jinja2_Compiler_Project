package ast.html_css_jinja2.css;

import java.util.ArrayList;
import java.util.List;

//h1, .title {
//color: red;
//  font-size: 20px;
//}

public class CssRulesetNode extends CssRuleNode {

    public String selector;
    public List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssRulesetNode(int line, String selector) {
        super("CssRuleset", line);
        this.selector = selector;
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder(" ".repeat(indent));
        sb.append("(line ").append(line).append(") CssRuleset ").append(selector);

        for (var d : declarations) {
            sb.append("\n").append(d.toString(indent + 2));
        }
        return sb.toString();
    }
}
