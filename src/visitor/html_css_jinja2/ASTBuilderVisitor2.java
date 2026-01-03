package visitor.html_css_jinja2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.misc.Pair;

import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser;
import antlr.html_css_jinja2.generated.HtmlCssJinja2ParserBaseVisitor;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssClassSelectorContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssCompoundSelectorWithTypeContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssCompoundSelectorWithoutTypeContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssMediaQueriesContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssRulesetContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssRulesetDefinitionContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssSelectorGroupBodyContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssSelectorGroupContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.CssStylesheetContext;
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
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2ForStatementContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2IdLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2IfBlockBodyContext;
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
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtNullLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtStringLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtSubscriptTrailerContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StmtTrueLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2StringLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2SubscriptTrailerContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.Jinja2TrueLiteralContext;
import antlr.html_css_jinja2.generated.HtmlCssJinja2Parser.StyleBodyContext;
import ast.BaseNode;
import ast.html_css_jinja2.HtmlDocumentRuleNode;
import ast.html_css_jinja2.css.stylesheet.StylesheetNode;
import ast.html_css_jinja2.css.stylesheet.imports.CssImportNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.helper_abstract.CssNestedStatement;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.CssRulesetNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.CssDeclarationListNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.CssExpressionNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.declarations.expressionsAndTerms.terms.helper_abstract.CssTermNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.SelectorGroupNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.SelectorNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.SimpleSelectorSequenceNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.CssClassSelectorNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.CssIdSelectorNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.CssPseudoSelectorNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.TypeSelectorNode;
import ast.html_css_jinja2.css.stylesheet.nestedStatements.ruleset.selectors.selectorComponent.helper_abstract.CssSelectorComponentNode;
import ast.html_css_jinja2.helper_abstract.HtmlElementsJinjaBlockTemplate;
import ast.html_css_jinja2.htmlElements.HtmlAttributeNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlCommentNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlElementNode;
import ast.html_css_jinja2.htmlElements.html_content.HtmlTextNode;
import ast.html_css_jinja2.jinjaBlock.Jinja2_comment.Jinja2CommentNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.helper_abstract.JinjaExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.JinjaListLiteral;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer.JinjaAttributeAccess;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer.JinjaCallExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaExprTrailer.JinjaSubscriptExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaBooleanLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaDoubleLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaIdentifier;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaIntLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaNullLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.atom.jinjaliteralAtom.JinjaStringLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.Jinja2AddSubExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.Jinja2ComparisonExpressionNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.Jinja2IsExpressionNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.Jinja2IsNotExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.Jinja2LogicalExpressionNode;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.Jinja2MulDivModExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.binaryExpression.helper_abstract.JinjaBinaryExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaExpression.jinjaExprContent.jinjaExprExpression.unaryExpression.Jinja2NotExpressionNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaBodyNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaForNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaForStatementNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.JinjaIfNode;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtBooleanLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtDoubleLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtIdentifier;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtIntLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtNullLiteralExpression;
import ast.html_css_jinja2.jinjaBlock.jinjaStatement.jinjaStmtExpression.atom.jinjaStmtLiteralAtom.JinjaStmtStringLiteralExpression;

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
        JinjaBodyNode bodyNode = new JinjaBodyNode(ctx.getStart().getLine());

        if (ctx.children != null) {
            for (var child : ctx.children) {
                BaseNode node = visit(child);
                if (node != null) {
                    bodyNode.add(node);
                }
            }
        }

        return bodyNode;

    }

    @Override
    public BaseNode visitHtmlTextData(HtmlTextDataContext ctx) {
        String text = ctx.getText();

        // Ignore pure whitespace
        if (text.trim().isEmpty()) {
            return null;
        }

        return new HtmlTextNode(text, ctx.getStart().getLine());
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

        // Check if the attribute has a value
        if (ctx.ATTVALUE_VALUE() != null) {
            attrValue = ctx.ATTVALUE_VALUE().getText();
            // Remove quotes from the attribute value
            if (attrValue.startsWith("\"") || attrValue.startsWith("'")) {
                attrValue = attrValue.substring(1, attrValue.length() - 1);
            }
        }

        // Use the line number from the attribute name instead of the value
        int line = ctx.TAG_NAME().getSymbol().getLine();

        return new HtmlAttributeNode(line, attrName, attrValue);
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
        return new JinjaIntLiteralExpression(ctx.getStart().getLine(), Integer.parseInt(ctx.getText()));
    }

    @Override
    public BaseNode visitJinja2DoubleLiteral(Jinja2DoubleLiteralContext ctx) {
        return new JinjaDoubleLiteralExpression(ctx.getStart().getLine(), Double.parseDouble(ctx.getText()));
    }

    @Override
    public BaseNode visitJinja2TrueLiteral(Jinja2TrueLiteralContext ctx) {
        return new JinjaBooleanLiteralExpression(ctx.getStart().getLine(), true);
    }

    @Override
    public BaseNode visitJinja2FalseLiteral(Jinja2FalseLiteralContext ctx) {
        return new JinjaBooleanLiteralExpression(ctx.getStart().getLine(), false);
    }

    @Override
    public BaseNode visitJinja2NullLiteral(Jinja2NullLiteralContext ctx) {
        return new JinjaNullLiteralExpression(ctx.getStart().getLine());
    }

    @Override
    public BaseNode visitJinja2StringLiteral(Jinja2StringLiteralContext ctx) {
        String text = ctx.getText();
        if (text.length() >= 2 && (text.startsWith("\"") || text.startsWith("'"))) {
            text = text.substring(1, text.length() - 1);
        }
        return new JinjaStringLiteralExpression(ctx.getStart().getLine(), text);
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
    public BaseNode visitJinja2ForBlockBody(Jinja2ForBlockBodyContext ctx) {
        int line = ctx.getStart().getLine();

        // header
        JinjaForStatementNode stmt = (JinjaForStatementNode) visit(ctx.jinjaForStatement());

        JinjaForNode node = new JinjaForNode(line);

        // variables
        node.variables = stmt.variables;

        // iterable
        node.iterable = stmt.iterable;

        // optional if filter
        node.ifCondition = stmt.ifCondition;

        // body
        if (ctx.htmlContent(0) != null && ctx.htmlContent(0).children != null) {
            for (var child : ctx.htmlContent(0).children) {
                BaseNode n = visit(child);
                if (n != null)
                    node.body.add(n);
            }
        }

        // else
        if (ctx.JINJA2_STMT_ELSE() != null &&
                ctx.htmlContent(1) != null &&
                ctx.htmlContent(1).children != null) {

            for (var child : ctx.htmlContent(1).children) {
                BaseNode n = visit(child);
                if (n != null)
                    node.elseBody.add(n);
            }
        }

        return node;

    }

    @Override
    public BaseNode visitJinja2ForStatement(Jinja2ForStatementContext ctx) {

        JinjaForStatementNode stmt = new JinjaForStatementNode(ctx.getStart().getLine());

        // variables
        for (var id : ctx.JINJA2_STMT_IDENTIFIER()) {
            stmt.variables.add(id.getText());
        }

        // iterable
        stmt.iterable = (JinjaExpression) visit(ctx.jinjaStmtAtomExpression());

        // optional IF filter
        if (ctx.jinjaStmtExpression() != null) {
            stmt.ifCondition = (JinjaExpression) visit(ctx.jinjaStmtExpression());
        }
        return stmt;
    }

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
        return new JinjaStmtIntLiteralExpression(ctx.getStart().getLine(), Integer.parseInt(ctx.getText()));
    }

    @Override
    public BaseNode visitJinja2StmtDoubleLiteral(Jinja2StmtDoubleLiteralContext ctx) {
        return new JinjaStmtDoubleLiteralExpression(ctx.getStart().getLine(), Double.parseDouble(ctx.getText()));
    }

    @Override
    public BaseNode visitJinja2StmtStringLiteral(Jinja2StmtStringLiteralContext ctx) {
        // Remove quotes from the string
        String text = ctx.getText();
        if (text.length() >= 2 && (text.startsWith("\"") || text.startsWith("'"))) {
            text = text.substring(1, text.length() - 1);
        }
        return new JinjaStmtStringLiteralExpression(ctx.getStart().getLine(), text);
    }

    @Override
    public BaseNode visitJinja2StmtTrueLiteral(Jinja2StmtTrueLiteralContext ctx) {
        return new JinjaStmtBooleanLiteralExpression(ctx.getStart().getLine(), true);
    }

    @Override
    public BaseNode visitJinja2StmtFalseLiteral(Jinja2StmtFalseLiteralContext ctx) {
        return new JinjaStmtBooleanLiteralExpression(ctx.getStart().getLine(), false);
    }

    @Override
    public BaseNode visitJinja2StmtNullLiteral(Jinja2StmtNullLiteralContext ctx) {
        return new JinjaStmtNullLiteralExpression(ctx.getStart().getLine());
    }

    @Override
    public BaseNode visitJinja2StmtIdLiteral(Jinja2StmtIdLiteralContext ctx) {
        return new JinjaStmtIdentifier(ctx.getStart().getLine(), ctx.getText());
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

    // ****************
    // ! CSS
    // ****************
    @Override
    public BaseNode visitStyleBody(StyleBodyContext ctx) {

        return visit(ctx.stylesheet());
    }

    @Override
    public BaseNode visitCssStylesheet(CssStylesheetContext ctx) {
        int line = ctx.getStart().getLine();
        StylesheetNode stylesheet = new StylesheetNode(line);

        for (HtmlCssJinja2Parser.ImportsContext importCtx : ctx.imports()) {
            CssImportNode importNode = (CssImportNode) visit(importCtx);
            if (importNode != null) {
                stylesheet.addImport(importNode);
            }
        }

        for (HtmlCssJinja2Parser.NestedStatementContext stmtCtx : ctx.nestedStatement()) {
            CssNestedStatement statementNode = (CssNestedStatement) visit(stmtCtx);
            if (statementNode != null) {
                stylesheet.addStatement(statementNode);
            }
        }

        return stylesheet;
    }

    // --- Ruleset ---
    @Override
    public BaseNode visitCssRuleset(CssRulesetContext ctx) {
        return visit(ctx.ruleset());
    }

    @Override
    public BaseNode visitCssMediaQueries(CssMediaQueriesContext ctx) {
        return visit(ctx.media());
    }

    // --- Ruleset ---
    // Visit and add alْl nested statements (rulesets, media queries, etc.)
    @Override
    public BaseNode visitCssRulesetDefinition(CssRulesetDefinitionContext ctx) {
        int line = ctx.getStart().getLine();
        SelectorGroupNode selectors = (SelectorGroupNode) visit(ctx.selectorGroup());
        CssDeclarationListNode declarations = null;
        if (ctx.declarationList() != null) {
            declarations = (CssDeclarationListNode) visit(ctx.declarationList());
        }

        return new CssRulesetNode(line, selectors, declarations);
    }

    // --- Selectors ---

    @Override
    public BaseNode visitCssSelectorGroupBody(CssSelectorGroupBodyContext ctx) {
        int line = ctx.getStart().getLine();
        SelectorGroupNode group = new SelectorGroupNode(line);
        for (HtmlCssJinja2Parser.SelectorContext selectorCtx : ctx.selector()) {
            group.addSelector((SelectorNode) visit(selectorCtx));
        }
        return group;
    }

    @Override
    public BaseNode visitCssSelectorGroup(CssSelectorGroupContext ctx) {
        int line = ctx.getStart().getLine();

        // Add null check for the first sequence
        SimpleSelectorSequenceNode firstSeq = null;
        if (ctx.simpleSelectorSequence(0) != null) {
            firstSeq = (SimpleSelectorSequenceNode) visit(ctx.simpleSelectorSequence(0));
        }

        SelectorNode selector = new SelectorNode(line, firstSeq);

        // Handle subsequent sequences with combinators
        for (int i = 0; i < ctx.combinator().size(); i++) {
            String combinator = ctx.combinator(i).getText(); // ">", "+", "~", or a space

            // Add null check for the next sequence
            SimpleSelectorSequenceNode nextSeq = null;
            if (ctx.simpleSelectorSequence(i + 1) != null) {
                nextSeq = (SimpleSelectorSequenceNode) visit(ctx.simpleSelectorSequence(i + 1));
            }

            if (nextSeq != null) {
                selector.addCombinatorAndSequence(combinator, nextSeq);
            }
        }
        return selector;
    }

    @Override
    public BaseNode visitCssCompoundSelectorWithType(CssCompoundSelectorWithTypeContext ctx) {
        int line = ctx.getStart().getLine();

        // 1. Visit the type selector (e.g., 'div', 'h1') - add null check
        TypeSelectorNode typeSelector = null;
        if (ctx.typeSelector() != null) {
            typeSelector = (TypeSelectorNode) visit(ctx.typeSelector());
        }

        // 2. Create the main node for this sequence
        SimpleSelectorSequenceNode sequence = new SimpleSelectorSequenceNode(line, typeSelector);

        // 3. Process and add ID selectors (e.g., '#my-id')
        for (var compCtx : ctx.Hash()) {
            String id = compCtx.getText().substring(1); // Remove the '#'
            sequence.addComponent(new CssIdSelectorNode(compCtx.getSymbol().getLine(), id));
        }

        // 4. Process and add class selectors (e.g., '.my-class')
        for (var compCtx : ctx.className()) {
            sequence.addComponent((CssClassSelectorNode) visit(compCtx));
        }

        // 5. Process and add pseudo-selectors (e.g., ':hover', '::before')
        for (var compCtx : ctx.pseudo()) {
            sequence.addComponent((CssPseudoSelectorNode) visit(compCtx));
        }

        return sequence;
    }

    // Add missing visitor method for type selector
    @Override
    public BaseNode visitCssElementTypeSelector(HtmlCssJinja2Parser.CssElementTypeSelectorContext ctx) {
        String namespacePrefix = null;
        if (ctx.typeNamespacePrefix() != null) {
            namespacePrefix = ctx.typeNamespacePrefix().getText();
        }
        return new TypeSelectorNode(ctx.cssIdent().getText(), ctx.getStart().getLine(), namespacePrefix);
    }

    // Add missing visitor method for pseudo selector
    // Add missing visitor method for pseudo selector
    // @Override
    // public BaseNode
    // visitCssPseudoClassOrElement(HtmlCssJinja2Parser.CssPseudoClassOrElementContext
    // ctx) {
    // boolean isElement = ctx.getChild(1).getText().equals(":");
    // String name = "";
    // CssExpressionNode expression = null;

    // // Check if it's a simple pseudo selector (like :hover, ::before)
    // if (ctx.cssIdent() != null) {
    // name = ctx.cssIdent().getText();
    // }
    // // Check if it's a functional pseudo selector (like :nth-child(2n+1))
    // else if (ctx.getChildCount() > 2 && ctx.getChild(2) instanceof
    // HtmlCssJinja2Parser.CssFunctionalPseudoContext) {
    // HtmlCssJinja2Parser.CssFunctionalPseudoContext funcCtx =
    // (HtmlCssJinja2Parser.CssFunctionalPseudoContext) ctx
    // .getChild(2);

    // // Extract the function name from the text
    // String funcText = funcCtx.getText();
    // int parenIndex = funcText.indexOf('(');
    // if (parenIndex > 0) {
    // name = funcText.substring(0, parenIndex);
    // }

    // // Visit the expression inside the parentheses
    // if (funcCtx.getChildCount() > 2) {
    // expression = (CssExpressionNode) visit(funcCtx.getChild(1)); // The
    // expression is the second child
    // }
    // }

    // return new CssPseudoSelectorNode(name, ctx.getStart().getLine(), isElement,
    // expression);
    // }

    // Add missing visitor method for pseudo selector
    @Override
    public BaseNode visitCssPseudoClassOrElement(HtmlCssJinja2Parser.CssPseudoClassOrElementContext ctx) {
        boolean isElement = ctx.getChildCount() > 1 && ctx.getChild(1).getText().equals(":");
        String name = "";
        CssExpressionNode expression = null;

        // Check if it's a simple pseudo selector (like :hover, ::before)
        if (ctx.cssIdent() != null) {
            name = ctx.cssIdent().getText();
        }
        // Check if it's a functional pseudo selector (like :nth-child(2n+1))
        else if (ctx.getChildCount() > 2 && ctx.getChild(2) instanceof HtmlCssJinja2Parser.CssFunctionalPseudoContext) {
            HtmlCssJinja2Parser.CssFunctionalPseudoContext funcCtx = (HtmlCssJinja2Parser.CssFunctionalPseudoContext) ctx
                    .getChild(2);

            // Extract the function name from the text
            String funcText = funcCtx.getText();
            int parenIndex = funcText.indexOf('(');
            if (parenIndex > 0) {
                name = funcText.substring(0, parenIndex);
            }

            // Visit the expression inside the parentheses - add null check
            if (funcCtx.getChildCount() > 2 && funcCtx.getChild(1) != null) {
                expression = (CssExpressionNode) visit(funcCtx.getChild(1)); // The expression is the second child
            }
        }

        return new CssPseudoSelectorNode(name, ctx.getStart().getLine(), isElement, expression);
    }

    // Add visitor method for functional pseudo selector
    @Override
    public BaseNode visitCssFunctionalPseudo(HtmlCssJinja2Parser.CssFunctionalPseudoContext ctx) {
        // Extract the function name from the text
        String funcText = ctx.getText();
        int parenIndex = funcText.indexOf('(');
        String name = parenIndex > 0 ? funcText.substring(0, parenIndex) : "";

        // Visit the expression inside the parentheses - add null check
        CssExpressionNode expression = null;
        if (ctx.getChildCount() > 2 && ctx.getChild(1) != null) {
            expression = (CssExpressionNode) visit(ctx.getChild(1)); // The expression is the second child
        }

        boolean isElement = false; // This will be determined by the parent context
        return new CssPseudoSelectorNode(name, ctx.getStart().getLine(), isElement, expression);
    }

    // Add visitor method for expression in functional pseudo selector
    @Override
    public BaseNode visitCssExpressionSequence(HtmlCssJinja2Parser.CssExpressionSequenceContext ctx) {
        CssExpressionNode expression = new CssExpressionNode("CssExpression", ctx.getStart().getLine());

        if (ctx.term() != null) {
            for (var termCtx : ctx.term()) {
                BaseNode term = visit(termCtx);
                if (term != null) {
                    expression.addTerm((CssTermNode) term);
                }
            }
        }

        return expression;
    }

    // Add missing visitor method for universal selector
    @Override
    public BaseNode visitCssUniversalSelector(HtmlCssJinja2Parser.CssUniversalSelectorContext ctx) {
        String namespacePrefix = null;
        if (ctx.typeNamespacePrefix() != null) {
            namespacePrefix = ctx.typeNamespacePrefix().getText();
        }
        return new TypeSelectorNode("*", ctx.getStart().getLine(), namespacePrefix);
    }

    @Override
    public BaseNode visitCssCompoundSelectorWithoutType(CssCompoundSelectorWithoutTypeContext ctx) {
        int line = ctx.getStart().getLine();

        // 1. This sequence has no type selector, so it's null
        TypeSelectorNode typeSelector = null;

        // 2. Create the main node for this sequence
        SimpleSelectorSequenceNode sequence = new SimpleSelectorSequenceNode(line, typeSelector);

        // 3. Process and add ID selectors (e.g., '#my-id')
        for (var compCtx : ctx.Hash()) {
            String id = compCtx.getText().substring(1); // Remove the '#'
            sequence.addComponent(new CssIdSelectorNode(compCtx.getSymbol().getLine(), id));
        }

        // 4. Process and add class selectors (e.g., '.my-class')
        for (var compCtx : ctx.className()) {
            sequence.addComponent((CssClassSelectorNode) visit(compCtx));
        }

        // 5. Process and add pseudo-selectors (e.g., ':hover', '::before')
        for (var compCtx : ctx.pseudo()) {
            sequence.addComponent((CssPseudoSelectorNode) visit(compCtx));
        }

        return sequence;
    }

    @Override
    public BaseNode visitCssClassSelector(CssClassSelectorContext ctx) {
        return new CssClassSelectorNode(ctx.cssIdent().getText(), ctx.getStart().getLine());
    }

    // @Override
    // public BaseNode visitCssClassSelector(CssClassSelectorContext ctx) {
    // return new CssClassSelectorNode(ctx.getStart().getLine(),
    // ctx.cssIdent().getText());
    // }

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