package ast.html_css_jinja2.jinjaBlock.jinjaStatement;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;

public class JinjaForStatementNode extends BaseNode {
    public List<String> variables = new ArrayList<>();
    public JinjaExpression iterable;
    public JinjaExpression ifCondition;

    public JinjaForStatementNode(int line) {
        super("JinjaForStatement", line);
    }

}
