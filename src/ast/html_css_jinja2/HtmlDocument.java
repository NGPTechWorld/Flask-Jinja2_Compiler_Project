package ast.html_css_jinja2;

import java.util.ArrayList;
import java.util.List;

import ast.BaseNode;
import ast.html_css_jinja2.Html.HtmlTextNode;

public abstract class HtmlDocument extends BaseNode {
     public List<HtmlTextNode> statements = new ArrayList<>();

    public HtmlDocument(String name, int line) {
        super(name, line);
    }

}
