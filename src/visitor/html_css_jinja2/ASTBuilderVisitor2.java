package visitor.html_css_jinja2;

import java.util.Set;

import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser;
import antlr.html_css_jinja2.generated.HtmlCssJinja2ParserBaseVisitor;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlAttributeRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlCommentRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlContentRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlDocumentRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlElementsRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlMiscCommentContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlMiscWhitespaceContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlOpeningClosingTagContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlTextDataContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.HtmlWhitespaceDataContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2CommentsContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.StyleElementContext;
import ast.BaseNode;
import ast.html_css_jinja2.HtmlDocumentRule;
import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;
import ast.html_css_jinja2.htmlElements.HtmlAttributeNode;
import ast.html_css_jinja2.htmlElements.HtmlCommentNode;
import ast.html_css_jinja2.htmlElements.HtmlElementNode;
import ast.html_css_jinja2.htmlElements.HtmlTextNode;
import ast.html_css_jinja2.jinjaBlock.Jinja2Comment;

public class ASTBuilderVisitor2 extends HtmlCssJinja2ParserBaseVisitor<BaseNode> {

    @Override
    public BaseNode visitHtmlDocumentRule(HtmlDocumentRuleContext ctx) {
        HtmlDocumentRule program = new HtmlDocumentRule(ctx.getStart().getLine());
        for (var child : ctx.children) {
            // visit html elements or jinja block
            HtmlElementsJinjaBlockTemplate node = (HtmlElementsJinjaBlockTemplate) visit(child);
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

        // * Option C Fix to make it except our example code
        String tagName = ctx.TAG_NAME(0).getText();
        boolean selfClosing = ctx.TAG_SLASH_CLOSE() != null;

        HtmlElementNode element = new HtmlElementNode(tagName, selfClosing, ctx.getStart().getLine());

        // attributes
        for (HtmlCssJinja2Parser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            if (attr != null) {
                element.addAttribute(attr);
            }
        }

        // children
        if (!selfClosing && ctx.htmlContent() != null) {

            HtmlContentRuleContext content = (HtmlContentRuleContext) ctx.htmlContent();
            // TODO: Need Abstraction
            // text
            for (var textCtx : content.htmlCharData()) {
                BaseNode node = visit(textCtx);
                if (node != null)
                    element.children.add(node);
            }

            // elements
            for (var elemCtx : content.htmlElement()) {
                BaseNode node = visit(elemCtx);
                if (node != null)
                    element.children.add(node);
            }

            // comments
            for (var commentCtx : content.htmlComment()) {
                BaseNode node = visit(commentCtx);
                if (node != null)
                    element.children.add(node);
            }

            // jinja
            for (var jinjaCtx : content.jinjaBlock()) {
                BaseNode node = visit(jinjaCtx);
                if (node != null)
                    element.children.add(node);
            }
        }

        return element;

        // // * Option A <img> - <br> are HtmlElement
        // // * and <img /> are closing tags
        // String tagName = ctx.TAG_NAME(0).getText();

        // boolean selfClosing = ctx.TAG_SLASH_CLOSE() != null;

        // HtmlElementNode element = new HtmlElementNode(tagName, selfClosing,
        // ctx.getStart().getLine());

        // // attributes
        // for (HtmlCssJinja2Parser.HtmlAttributeContext attrCtx : ctx.htmlAttribute())
        // {
        // HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
        // element.addAttribute(attr);
        // }

        // // children only if not self-closing
        // if (!selfClosing && ctx.htmlContent() != null) {
        // for (var child : ctx.htmlContent().children) {
        // BaseNode node = visit(child);
        // if (node != null) {
        // element.children.add(node);
        // }
        // }
        // }

        // return element;

        // * Option B <img> - <br> or <img /> are closing tags
        // String tagName = ctx.TAG_NAME(0).getText();

        // boolean selfClosing = ctx.TAG_SLASH_CLOSE() != null ||
        // isVoidElement(tagName);

        // HtmlElementNode element = new HtmlElementNode(tagName, selfClosing,
        // ctx.getStart().getLine());

        // // attributes
        // for (HtmlCssJinja2Parser.HtmlAttributeContext attrCtx : ctx.htmlAttribute())
        // {
        // HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
        // element.addAttribute(attr);
        // }
        // // children ONLY if not self closing
        // if (!selfClosing && ctx.htmlContent() != null) {
        // for (var child : ctx.htmlContent().children) {
        // BaseNode node = visit(child);
        // if (node != null) {
        // element.children.add(node);
        // }
        // }
        // }

        // return element;
    }

    // @Override
    // public BaseNode visitStyleElement(StyleElementContext ctx) {
    // // TODO Auto-generated method stub
    // System.out.println("visitStyleElement");
    // return super.visitStyleElement(ctx);
    // }

    @Override
    public BaseNode visitHtmlContentRule(HtmlContentRuleContext ctx) {
        // Here It doesn't need HtmlContentRule
        // Instead we just need to iterate over it's children
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

    @Override
    public BaseNode visitHtmlAttributeRule(HtmlAttributeRuleContext ctx) {
        String attrName = ctx.TAG_NAME().getText();
        String attrValue = null;
        if (ctx.ATTVALUE_VALUE() != null) {
            attrValue = ctx.ATTVALUE_VALUE().getText();
            attrValue = attrValue.substring(1, attrValue.length() - 1);
        }

        return new HtmlAttributeNode(ctx.getStart().getLine(), attrName, attrValue);

    }

    @Override
    public BaseNode visitHtmlCommentRule(HtmlCommentRuleContext ctx) {
        String text = ctx.getText();

        // Remove <!-- and -->
        text = text.substring(4, text.length() - 3).trim();

        return new HtmlCommentNode(
                ctx.getStart().getLine(),
                text);
    }

    @Override
    public BaseNode visitJinja2Comments(Jinja2CommentsContext ctx) {

        String text = ctx.getText();
        text = text.substring(2, text.length() - 2).trim();

        return new Jinja2Comment(ctx.getStart().getLine(), text);
    }

    // ! Helper for self closing html
    // This is used to detect the selfclosing tags
    // for example : <img />
    // or <br>
    private static final Set<String> VOID_ELEMENTS = Set.of(
            "area", "base", "br", "col", "embed", "hr",
            "img", "input", "link", "meta", "param",
            "source", "track", "wbr");

    private boolean isVoidElement(String tag) {
        return VOID_ELEMENTS.contains(tag.toLowerCase());
    }
}
