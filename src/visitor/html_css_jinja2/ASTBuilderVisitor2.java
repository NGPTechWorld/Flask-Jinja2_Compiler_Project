package visitor.html_css_jinja2;

import antlr.html_css_jinja2.generated.HtmlCssJinja2ParserBaseVisitor;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlContentRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlDocumentRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlElementsRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlMiscCommentContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlMiscWhitespaceContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlOpeningClosingTagContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlTextDataContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlWhitespaceDataContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.StyleElementContext;
import ast.BaseNode;
import ast.html_css_jinja2.TemplateProgramNode;
import ast.html_css_jinja2.Html.HtmlElementNode;
import ast.html_css_jinja2.Html.HtmlTextNode;

public class ASTBuilderVisitor2 extends HtmlCssJinja2ParserBaseVisitor<BaseNode> {

    @Override
    public BaseNode visitHtmlDocumentRule(HtmlDocumentRuleContext ctx) {
        TemplateProgramNode program = new TemplateProgramNode(ctx.getStart().getLine());
        System.out.println(ctx.getChildCount());
        for (var child : ctx.children) {
            BaseNode node = visit(child);
            if (node != null) {
                program.addChild(node);
            }
        }
        return program;
    }

    @Override
    public BaseNode visitHtmlElementsRule(HtmlElementsRuleContext ctx) {
        HtmlElementNode htmlElementNode = new HtmlElementNode(ctx.getText(), ctx.getStart().getLine());
        return htmlElementNode;
    }

    @Override
    public BaseNode visitHtmlOpeningClosingTag(HtmlOpeningClosingTagContext ctx) {
        // TODO Auto-generated method stub
        return super.visitHtmlOpeningClosingTag(ctx);
    }

    @Override
    public BaseNode visitStyleElement(StyleElementContext ctx) {
        // TODO Auto-generated method stub
        return super.visitStyleElement(ctx);
    }

    @Override
    public BaseNode visitHtmlContentRule(HtmlContentRuleContext ctx) {
        return super.visitHtmlContentRule(ctx);
    }

    @Override
    public BaseNode visitHtmlTextData(HtmlTextDataContext ctx) {
        HtmlTextNode htmlTextNode = new HtmlTextNode(ctx.getStart().getLine());
        System.out.println(ctx.getChildCount());
        return super.visitHtmlTextData(ctx);
    }

    @Override
    public BaseNode visitHtmlWhitespaceData(HtmlWhitespaceDataContext ctx) {
        // TODO Auto-generated method stub
        return super.visitHtmlWhitespaceData(ctx);
    }

    @Override
    public BaseNode visitHtmlMiscComment(HtmlMiscCommentContext ctx) {
        // TODO Auto-generated method stub
        return super.visitHtmlMiscComment(ctx);
    }

    @Override
    public BaseNode visitHtmlMiscWhitespace(HtmlMiscWhitespaceContext ctx) {
        // TODO Auto-generated method stub
        return super.visitHtmlMiscWhitespace(ctx);
    }

}
