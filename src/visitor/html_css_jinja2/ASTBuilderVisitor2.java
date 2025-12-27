package visitor.html_css_jinja2;

import antlr.html_css_jinja2.generated.HtmlCssJinja2ParserBaseVisitor;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlDocumentRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlOpeningClosingTagContext;
import ast.BaseNode;

public class ASTBuilderVisitor2 extends HtmlCssJinja2ParserBaseVisitor<BaseNode> {
    @Override
    public BaseNode visitHtmlDocumentRule(HtmlDocumentRuleContext ctx) {
        return super.visitHtmlDocumentRule(ctx);
        // for(ParseTree child : ctx.children){

        // }
    }

    @Override
    public BaseNode visitHtmlOpeningClosingTag(HtmlOpeningClosingTagContext ctx) {
        return super.visitHtmlOpeningClosingTag(ctx);
    }
}
