package visitor.html_css_jinja2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.misc.Pair;

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
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2AddSubExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2AtomExpressionBodyContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2AttributeTrailerContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2CallTrailerContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2CommentsContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2ComparisonExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2DoubleLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2ExprContentRuleContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2ExpressionsBodyContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2FalseLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2ForBlockBodyContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2ForBlockContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2IdLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2IfBlockBodyContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2IfBlockContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2IntLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2IsExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2IsNotExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2ListAtomContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2LogicalExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2MulDivModExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2NotExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2NullLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2ParenthesizedAtomContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StatementsContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtAddSubExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtAtomExpressionBodyContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtComparisonExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtDoubleLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtFalseLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtIdLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtIntLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtLogicalExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtMulDivModExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtNotExpressionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtNullLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtStringLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtSubscriptTrailerContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtTrueLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StringLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2SubscriptTrailerContext;
// import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2TemplateContentContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2TrueLiteralContext;
import ast.BaseNode;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;
import ast.html_css_jinja2.htmlElements.HtmlAttributeNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlCommentNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlElementNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlTextNode;
import ast.html_css_jinja2.jinjaBlock.Jinja2_comment.Jinja2CommentNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.JinjaAttributeAccess;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.JinjaCallExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.JinjaIdentifier;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.JinjaListLiteral;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.JinjaLiteral;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.JinjaSubscriptExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.Jinja2AddSubExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.Jinja2ComparisonExpressionNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.Jinja2IsExpressionNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.Jinja2IsNotExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.Jinja2LogicalExpressionNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.Jinja2MulDivModExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.binaryExpression.helper_abstract.JinjaBinaryExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.unaryExpression.Jinja2NotExpressionNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.unaryExpression.JinjaUnaryExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaBodyNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaForNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaIfNode;

public class ASTBuilderVisitor2 extends HtmlCssJinja2ParserBaseVisitor<BaseNode> {

    @Override
    public BaseNode visitHtmlDocumentRule(HtmlDocumentRuleContext ctx) {
        HtmlDocumentRuleNode program = new HtmlDocumentRuleNode(ctx.getStart().getLine());
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
        // get start tag name
        String tagName = ctx.TAG_NAME(0).getText();

        // get line
        int line = ctx.getStart().getLine();

        // get endTageName with line
        String endTagName = "No End Tag";
        if (ctx.TAG_NAME(1) != null) {
            endTagName = ctx.TAG_NAME(1).getText();
            String endTagNameLine = Integer.toString(ctx.TAG_NAME(1).getSymbol().getLine());
            endTagName = endTagName.concat(" " + endTagNameLine);

        }

        // check self closing tag
        boolean selfClosing = ctx.TAG_SLASH_CLOSE() != null || isVoidElement(tagName);

        HtmlElementNode element = new HtmlElementNode(tagName,
                endTagName,
                selfClosing,
                line);

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
            // solve null values
            if (content != null && content.children != null) { // Add null check for children
                for (var child : content.children) {
                    BaseNode node = (BaseNode) visit(child);
                    if (node != null) {
                        element.children.add(node);
                    }
                }
            }
            // has null values
            // for (var child : content.children) {
            // // TODO: Need Abstraction (htmlCharData | htmlElement | htmlComment
            // |jinjaBlock)
            // BaseNode node = (BaseNode) visit(child);
            // if (node != null) {
            // element.children.add(node);
            // }
            // }
        }

        return element;

    }

    // @Override
    // public BaseNode visitStyleElement(StyleElementContext ctx) {
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
                ctx.HTML_TEXT().getText().trim(), ctx.HTML_TEXT().getSymbol().getLine());
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
        return new HtmlAttributeNode(ctx.ATTVALUE_VALUE().getSymbol().getLine(), attrName, attrValue);

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

    // ! JINJA
    // ! (1 of 3) - Jinja Expressions
    @Override
    public BaseNode visitJinja2ExpressionsBody(Jinja2ExpressionsBodyContext ctx) {
        return visit(ctx.jinjaExprContent());
    }

    @Override
    public BaseNode visitJinja2ExprContentRule(Jinja2ExprContentRuleContext ctx) {
        return visit(ctx.jinjaExprExpression(0));
    }

    // ! Atom expressions
    @Override
    public BaseNode visitJinja2ParenthesizedAtom(Jinja2ParenthesizedAtomContext ctx) {
        return visit(ctx.jinjaExprExpression());
    }

    // DONE
    // ! visitJinja2MulDivModExpression
    @Override
    public BaseNode visitJinja2MulDivModExpression(Jinja2MulDivModExpressionContext ctx) {
        return new Jinja2MulDivModExpression(
                ctx.getStart().getLine(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(0)),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(1)));
    }

    // ! visitJinja2AddSubExpression
    // DONE
    @Override
    public BaseNode visitJinja2AddSubExpression(Jinja2AddSubExpressionContext ctx) {
        return new Jinja2AddSubExpression(ctx.getStart().getLine(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(0)),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(1)));
    }

    // ! visitJinja2ComparisonExpression
    // DONE
    @Override
    public BaseNode visitJinja2ComparisonExpression(Jinja2ComparisonExpressionContext ctx) {
        return new Jinja2ComparisonExpressionNode(
                ctx.getStart().getLine(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(0)),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(1)));
    }

    // ! visitJinja2IsExpression
    @Override
    public BaseNode visitJinja2IsExpression(Jinja2IsExpressionContext ctx) {
        return new Jinja2IsExpressionNode(
                ctx.getStart().getLine(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(0)),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(1)));
    }

    // ! visitJinja2IsNotExpression
    @Override
    public BaseNode visitJinja2IsNotExpression(Jinja2IsNotExpressionContext ctx) {
        return new Jinja2IsNotExpression(
                ctx.getStart().getLine(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(0)),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(1)));
    }

    // ! visitJinja2NotExpression
    @Override
    public BaseNode visitJinja2NotExpression(Jinja2NotExpressionContext ctx) {
        return new Jinja2NotExpressionNode(
                ctx.getStart().getLine(),
                ctx.getChild(0).getText(),
                (JinjaExpression) visit(ctx.jinjaExprExpression())

        );

    }

    // ! visitJinja2LogicalExpression
    // DONE
    @Override
    public BaseNode visitJinja2LogicalExpression(Jinja2LogicalExpressionContext ctx) {
        return new Jinja2LogicalExpressionNode(
                ctx.getStart().getLine(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(0)),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaExprExpression(1)));
    }

    // --------------------------------------------------------
    // literals
    // --------------------------------------------------------
    // ! List
    @Override
    public BaseNode visitJinja2ListAtom(Jinja2ListAtomContext ctx) {
        JinjaListLiteral list = new JinjaListLiteral(ctx.getStart().getLine());

        for (var expr : ctx.jinjaExprExpression()) {
            list.elements.add((JinjaExpression) visit(expr));
        }
        return list;
    }

    @Override
    public BaseNode visitJinja2IntLiteral(Jinja2IntLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), ctx.getText());
    }

    @Override
    public BaseNode visitJinja2DoubleLiteral(Jinja2DoubleLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), ctx.getText());
    }

    @Override
    public BaseNode visitJinja2TrueLiteral(Jinja2TrueLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), "true");
    }

    @Override
    public BaseNode visitJinja2FalseLiteral(Jinja2FalseLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), "false");
    }

    @Override
    public BaseNode visitJinja2NullLiteral(Jinja2NullLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), "null");
    }

    @Override
    public BaseNode visitJinja2StringLiteral(Jinja2StringLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), ctx.getText());
    }

    @Override
    public BaseNode visitJinja2IdLiteral(Jinja2IdLiteralContext ctx) {
        return new JinjaIdentifier(ctx.getStart().getLine(), ctx.getText());
    }

    // --------------------------------------------------------
    // Trailers (call / attribute / subscript)
    // --------------------------------------------------------
    // ! Call
    @Override
    public BaseNode visitJinja2CallTrailer(Jinja2CallTrailerContext ctx) {
        // Handled in atom expression chaining
        return null;
    }

    // ! Attribute access
    // TODO
    @Override
    public BaseNode visitJinja2AttributeTrailer(Jinja2AttributeTrailerContext ctx) {
        return new JinjaAttributeAccess(
                ctx.getStart().getLine(),
                null,
                ctx.JINJA2_IDENTIFIER().getText());
    }

    // ! Subscript
    // TODO
    @Override
    public BaseNode visitJinja2SubscriptTrailer(Jinja2SubscriptTrailerContext ctx) {
        return new JinjaSubscriptExpression(
                ctx.getStart().getLine(),
                null,
                (JinjaExpression) visit(ctx.jinjaExprExpression()));
    }

    // ! Atom expression body (MOST IMPORTANT)
    // TODO Important
    @Override
    public BaseNode visitJinja2AtomExpressionBody(Jinja2AtomExpressionBodyContext ctx) {
        JinjaExpression base = (JinjaExpression) visit(ctx.jinjaExprAtom());

        for (var trailer : ctx.jinjaExprTrailer()) {

            if (trailer instanceof HtmlCssJinja2Parser.Jinja2AttributeTrailerContext attr) {
                base = new JinjaAttributeAccess(
                        trailer.getStart().getLine(),
                        base,
                        attr.JINJA2_IDENTIFIER().getText());
            }

            else if (trailer instanceof HtmlCssJinja2Parser.Jinja2SubscriptTrailerContext sub) {
                base = new JinjaSubscriptExpression(
                        trailer.getStart().getLine(),
                        base,
                        (JinjaExpression) visit(sub.jinjaExprExpression()));
            }

            else if (trailer instanceof HtmlCssJinja2Parser.Jinja2CallTrailerContext call) {
                JinjaCallExpression callExpr = new JinjaCallExpression(trailer.getStart().getLine(), base);

                for (var arg : call.jinjaExprArgument()) {
                    callExpr.arguments.add(
                            (JinjaExpression) visit(arg));
                }
                base = callExpr;
            }
        }
        return base;
    }

    // ! (2 of 3) - Jinja Statements
    @Override
    public BaseNode visitJinja2Statements(Jinja2StatementsContext ctx) {
        return visitChildren(ctx);
    }

    // --------------------------------------------------------
    // For
    // --------------------------------------------------------
    @Override
    public BaseNode visitJinja2ForBlock(Jinja2ForBlockContext ctx) {

        System.out.println(" visitJinja2ForBlock");
        return super.visitJinja2ForBlock(ctx);
    }

    // @Override
    // public BaseNode visitJinja2ForBlockBody(Jinja2ForBlockBodyContext ctx) {
    // JinjaForNode node = new JinjaForNode(ctx.getStart().getLine());
    // // ! ERRORS
    // // node.variable =
    // ctx.jinjaForStatement().JINJA2_STMT_IDENTIFIER(0).getText();
    // // node.iterable = (JinjaExpression)
    // // visit(ctx.jinjaForStatement().jinjaStmtAtomExpression());

    // for (var child : ctx.templateContent(0).children) {
    // BaseNode n = visit(child);
    // if (n != null)
    // node.body.add(n);
    // }
    // return node;

    // }

    // --------------------------------------------------------
    // If
    // --------------------------------------------------------

    @Override
    public BaseNode visitJinja2IfBlockBody(Jinja2IfBlockBodyContext ctx) {

        int line = ctx.getStart().getLine();

        // IF condition
        JinjaExpression ifCondition = (JinjaExpression) visit(ctx.jinjaStmtExpression(0));

        // IF body
        JinjaBodyNode bodyIf = new JinjaBodyNode(
                ctx.htmlContent(0).getStart().getLine());

        for (var child : ctx.htmlContent(0).children) {
            BaseNode node = visit(child);
            if (node != null) {
                bodyIf.add(node);
            }
        }

        // ELSE IF blocks
        List<Pair<JinjaExpression, JinjaBodyNode>> elseIfs = new ArrayList<>();

        int elifCount = ctx.JINJA2_STMT_ELIF().size();
        for (int i = 0; i < elifCount; i++) {
            JinjaExpression cond = (JinjaExpression) visit(ctx.jinjaStmtExpression(i + 1));

            JinjaBodyNode body = new JinjaBodyNode(
                    ctx.htmlContent(i + 1).getStart().getLine());

            for (var child : ctx.htmlContent(i + 1).children) {
                BaseNode node = visit(child);
                if (node != null)
                    body.add(node);
            }

            elseIfs.add(new Pair<>(cond, body));
        }

        // ELSE block
        JinjaBodyNode bodyElse = null;
        if (ctx.JINJA2_STMT_ELSE() != null) {
            bodyElse = new JinjaBodyNode(
                    ctx.htmlContent(ctx.htmlContent().size() - 1)
                            .getStart().getLine());

            for (var child : ctx.htmlContent(ctx.htmlContent().size() - 1).children) {
                BaseNode node = visit(child);
                if (node != null)
                    bodyElse.add(node);
            }
        }

        return new JinjaIfNode(line, ifCondition, bodyIf, elseIfs, bodyElse);
    }

    // --------------------------------------------------------
    // literals
    // --------------------------------------------------------

    // // ! Comparison
    @Override
    public BaseNode visitJinja2StmtComparisonExpression(Jinja2StmtComparisonExpressionContext ctx) {
        // ! should be for stmt not expression
        return new JinjaBinaryExpression("Jinja2StmtComparisonExpression ",
                ctx.getStart().getLine(),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaStmtExpression(0)),
                (JinjaExpression) visit(ctx.jinjaStmtExpression(1)));
    }

    // ! Logical
    @Override
    public BaseNode visitJinja2StmtLogicalExpression(Jinja2StmtLogicalExpressionContext ctx) {
        // ! should be for stmt not expression

        return new JinjaBinaryExpression("Jinja2StmtLogicalExpression ",
                ctx.getStart().getLine(),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaStmtExpression(0)),
                (JinjaExpression) visit(ctx.jinjaStmtExpression(1)));
    }

    // ! Add / Sub
    @Override
    public BaseNode visitJinja2StmtAddSubExpression(Jinja2StmtAddSubExpressionContext ctx) {
        // ! should be for stmt not expression

        return new JinjaBinaryExpression("Jinja2StmtAddSubExpression ",
                ctx.getStart().getLine(),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaStmtExpression(0)),
                (JinjaExpression) visit(ctx.jinjaStmtExpression(1)));
    }

    // ! Mul / Div / Mod
    // TODO
    @Override
    public BaseNode visitJinja2StmtMulDivModExpression(Jinja2StmtMulDivModExpressionContext ctx) {
        // ! should be for stmt not expression

        return new JinjaBinaryExpression("Jinja2StmtMulDivModExpression ",
                ctx.getStart().getLine(),
                ctx.getChild(1).getText(),
                (JinjaExpression) visit(ctx.jinjaStmtExpression(0)),
                (JinjaExpression) visit(ctx.jinjaStmtExpression(1)));
    }

    // ! NOT
    // @Override
    // public BaseNode visitJinja2StmtNotExpression(Jinja2StmtNotExpressionContext
    // ctx) {
    // return new JinjaUnaryExpression(
    // ctx.getStart().getLine(),
    // "not",
    // (JinjaExpression) visit(ctx.jinjaStmtExpression()));
    // }

    @Override
    public BaseNode visitJinja2StmtFunctionArg(
            HtmlCssJinja2Parser.Jinja2StmtFunctionArgContext ctx) {

        return visit(ctx.jinjaStmtExpression());
    }

    // ! Statement atom expression body
    @Override
    public BaseNode visitJinja2StmtAtomExpressionBody(Jinja2StmtAtomExpressionBodyContext ctx) {

        JinjaExpression base = (JinjaExpression) visit(ctx.jinjaStmtAtom());

        for (var trailer : ctx.jinjaStmtTrailer()) {

            if (trailer instanceof HtmlCssJinja2Parser.Jinja2StmtAttributeTrailerContext attr) {
                base = new JinjaAttributeAccess(
                        trailer.getStart().getLine(),
                        base,
                        attr.JINJA2_STMT_IDENTIFIER().getText());
            }

            else if (trailer instanceof Jinja2StmtSubscriptTrailerContext sub) {
                base = new JinjaSubscriptExpression(
                        trailer.getStart().getLine(),
                        base,
                        (JinjaExpression) visit(sub.jinjaStmtExpression()));
            }

            else if (trailer instanceof HtmlCssJinja2Parser.Jinja2StmtCallTrailerContext call) {
                JinjaCallExpression callExpr = new JinjaCallExpression(trailer.getStart().getLine(), base);

                for (var arg : call.jinjaStmtArgument()) {
                    callExpr.arguments.add(
                            (JinjaExpression) visit(arg));
                }
                base = callExpr;
            }
        }
        return base;
    }

    // ! LITERALS
    @Override
    public BaseNode visitJinja2StmtIntLiteral(Jinja2StmtIntLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), ctx.getText());
    }

    @Override
    public BaseNode visitJinja2StmtDoubleLiteral(Jinja2StmtDoubleLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), ctx.getText());
    }

    @Override
    public BaseNode visitJinja2StmtStringLiteral(Jinja2StmtStringLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), ctx.getText());
    }

    @Override
    public BaseNode visitJinja2StmtTrueLiteral(Jinja2StmtTrueLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), "true");
    }

    @Override
    public BaseNode visitJinja2StmtFalseLiteral(Jinja2StmtFalseLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), "false");
    }

    @Override
    public BaseNode visitJinja2StmtNullLiteral(Jinja2StmtNullLiteralContext ctx) {
        return new JinjaLiteral(ctx.getStart().getLine(), "null");
    }

    @Override
    public BaseNode visitJinja2StmtIdLiteral(Jinja2StmtIdLiteralContext ctx) {
        return new JinjaIdentifier(ctx.getStart().getLine(), ctx.getText());
    }

    // ! Template content (HTML + Jinja mix) important for {% if %} and {% for %}
    // @Override
    // public BaseNode visitJinja2TemplateContent(Jinja2TemplateContentContext ctx)
    // {
    // for (var child : ctx.children) {
    // visit(child);
    // }
    // return null;
    // }

    // ! (3 of 3) - Jinja Comments
    @Override
    public BaseNode visitJinja2Comments(Jinja2CommentsContext ctx) {
        String text = ctx.getText();
        text = text.substring(2, text.length() - 2).trim();
        return new Jinja2CommentNode(ctx.getStart().getLine(), text);
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