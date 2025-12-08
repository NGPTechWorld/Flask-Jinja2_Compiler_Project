package visitor.html_css_jinja2;

import java.util.ArrayList;
import java.util.List;
import ast.html_css_jinja2.*;
import ast.html_css_jinja2.html.HtmlAttributeNode;
import ast.html_css_jinja2.html.HtmlDocumentNode;
import ast.html_css_jinja2.html.HtmlElementNode;
import ast.html_css_jinja2.html.HtmlTextNode;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser;
import antlr.html_css_jinja2.generated.HtmlCssJinja2ParserBaseVisitor;

public class BuildAstVisitor extends HtmlCssJinja2ParserBaseVisitor<AstNode> {

    @Override
    public AstNode visitHtmlDocumentRule(HtmlCssJinja2Parser.HtmlDocumentRuleContext ctx) {

        List<AstNode> elements = new ArrayList<>();
        for (var ele : ctx.htmlElements()) {
            elements.add(visit(ele));
        }

        return new HtmlDocumentNode(elements, ctx.getStart().getLine());
    }

    @Override
    public AstNode visitHtmlElementsRule(HtmlCssJinja2Parser.HtmlElementsRuleContext ctx) {
        return visit(ctx.htmlElement());
    }

    @Override
    public AstNode visitHtmlOpeningClosingTag(HtmlCssJinja2Parser.HtmlOpeningClosingTagContext ctx) {

        String tagName = ctx.TAG_NAME(0).getText();
        int line = ctx.getStart().getLine();

        List<HtmlAttributeNode> attrs = new ArrayList<>();
        for (var att : ctx.htmlAttribute()) {
            attrs.add((HtmlAttributeNode) visit(att));
        }

        List<AstNode> kids = new ArrayList<>();
        if (ctx.htmlContent() != null) {
            kids.add(visit(ctx.htmlContent()));
        }

        return new HtmlElementNode(tagName, attrs, kids, line);
    }

    @Override
    public AstNode visitHtmlAttributeRule(HtmlCssJinja2Parser.HtmlAttributeRuleContext ctx) {
        String name = ctx.TAG_NAME().getText();
        String value = ctx.ATTVALUE_VALUE() != null ? ctx.ATTVALUE_VALUE().getText() : "";

        return new HtmlAttributeNode(name, value, ctx.getStart().getLine());
    }

    @Override
    public AstNode visitHtmlTextData(HtmlCssJinja2Parser.HtmlTextDataContext ctx) {
        return new HtmlTextNode(ctx.HTML_TEXT().getText(), ctx.getStart().getLine());
    }

    @Override
    public AstNode visitHtmlContentRule(HtmlCssJinja2Parser.HtmlContentRuleContext ctx) {

        List<AstNode> kids = new ArrayList<>();

        if (ctx.children != null) {
            for (var ch : ctx.children) {

                // Text
                if (ch instanceof HtmlCssJinja2Parser.HtmlCharDataContext textCtx) {
                    AstNode node = visit(textCtx);
                    kids.add(node);
                }

                // Nested elements
                else if (ch instanceof HtmlCssJinja2Parser.HtmlElementContext elemCtx) {
                    AstNode node = visit(elemCtx);
                    kids.add(node);
                }

                // Comments
                else if (ch instanceof HtmlCssJinja2Parser.HtmlCommentContext commentCtx) {
                    AstNode node = visit(commentCtx);
                    kids.add(node);
                }
            }
        }

        // If only one node, return it directly
        if (kids.size() == 1)
            return kids.get(0);

        // Otherwise wrap in a content node
        return new HtmlElementNode("content", List.of(), kids, ctx.getStart().getLine());
    }
}