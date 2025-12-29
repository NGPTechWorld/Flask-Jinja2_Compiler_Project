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

        for (var child : ctx.children) {
            BaseNode node = visit(child);
            if (node != null) {
                return node;
            }
        }
        return null;
    }

    @Override
    public BaseNode visitHtmlOpeningClosingTag(HtmlOpeningClosingTagContext ctx) {
        String tagName = ctx.TAG_NAME(0).getText();
        HtmlElementNode element = new HtmlElementNode(tagName, ctx.getStart().getLine());

        if (ctx.htmlContent() != null) {
            for (var child : ctx.htmlContent().children) {
                BaseNode node = visit(child);
                if (node != null) {
                    element.children.add(node);
                }
            }
        }

        return element;
    }

    // @Override
    // public BaseNode visitStyleElement(StyleElementContext ctx) {
    // // TODO Auto-generated method stub
    // System.out.println("visitStyleElement");
    // return super.visitStyleElement(ctx);
    // }

    @Override
    public BaseNode visitHtmlContentRule(HtmlContentRuleContext ctx) {
        for (var child : ctx.children) {
            visit(child);
        }
        return null;
    }

    @Override
    public BaseNode visitHtmlTextData(HtmlTextDataContext ctx) {
        return new HtmlTextNode(
                ctx.getText(), ctx.getStart().getLine());
    }

    // Ignore
    @Override
    public BaseNode visitHtmlWhitespaceData(HtmlWhitespaceDataContext ctx) {
        return null;
    }

    // Ignore
    @Override
    public BaseNode visitHtmlMiscComment(HtmlMiscCommentContext ctx) {
        return null;
    }

    // Ignore
    @Override
    public BaseNode visitHtmlMiscWhitespace(HtmlMiscWhitespaceContext ctx) {
        return null;
    }

}
