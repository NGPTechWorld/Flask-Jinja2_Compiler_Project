// Generated from ./src/antlr/html_css_jinja2/HtmlCssJinja2Parser.g4 by ANTLR 4.13.2

    package antlr.html_css_jinja2.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlCssJinja2Parser}.
 */
public interface HtmlCssJinja2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code HtmlDocumentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocumentRule(HtmlCssJinja2Parser.HtmlDocumentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlDocumentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocumentRule(HtmlCssJinja2Parser.HtmlDocumentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementsRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementsRule(HtmlCssJinja2Parser.HtmlElementsRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementsRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementsRule(HtmlCssJinja2Parser.HtmlElementsRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlOpeningClosingTag}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlOpeningClosingTag(HtmlCssJinja2Parser.HtmlOpeningClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlOpeningClosingTag}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlOpeningClosingTag(HtmlCssJinja2Parser.HtmlOpeningClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(HtmlCssJinja2Parser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(HtmlCssJinja2Parser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentRule(HtmlCssJinja2Parser.HtmlContentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentRule(HtmlCssJinja2Parser.HtmlContentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttributeRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeRule(HtmlCssJinja2Parser.HtmlAttributeRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttributeRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeRule(HtmlCssJinja2Parser.HtmlAttributeRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextData}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlCharData}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextData(HtmlCssJinja2Parser.HtmlTextDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextData}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlCharData}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextData(HtmlCssJinja2Parser.HtmlTextDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlWhitespaceData}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlCharData}.
	 * @param ctx the parse tree
	 */
	void enterHtmlWhitespaceData(HtmlCssJinja2Parser.HtmlWhitespaceDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlWhitespaceData}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlCharData}.
	 * @param ctx the parse tree
	 */
	void exitHtmlWhitespaceData(HtmlCssJinja2Parser.HtmlWhitespaceDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlMiscComment}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMiscComment(HtmlCssJinja2Parser.HtmlMiscCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlMiscComment}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMiscComment(HtmlCssJinja2Parser.HtmlMiscCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlMiscWhitespace}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMiscWhitespace(HtmlCssJinja2Parser.HtmlMiscWhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlMiscWhitespace}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMiscWhitespace(HtmlCssJinja2Parser.HtmlMiscWhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentRule(HtmlCssJinja2Parser.HtmlCommentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentRule(HtmlCssJinja2Parser.HtmlCommentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2Comments}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinja2Comments(HtmlCssJinja2Parser.Jinja2CommentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2Comments}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinja2Comments(HtmlCssJinja2Parser.Jinja2CommentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2Expressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinja2Expressions(HtmlCssJinja2Parser.Jinja2ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2Expressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinja2Expressions(HtmlCssJinja2Parser.Jinja2ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2Statements}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinja2Statements(HtmlCssJinja2Parser.Jinja2StatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2Statements}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinja2Statements(HtmlCssJinja2Parser.Jinja2StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2ExpressionsBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2ExpressionsBody(HtmlCssJinja2Parser.Jinja2ExpressionsBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2ExpressionsBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2ExpressionsBody(HtmlCssJinja2Parser.Jinja2ExpressionsBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2ExprContentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprContent}.
	 * @param ctx the parse tree
	 */
	void enterJinja2ExprContentRule(HtmlCssJinja2Parser.Jinja2ExprContentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2ExprContentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprContent}.
	 * @param ctx the parse tree
	 */
	void exitJinja2ExprContentRule(HtmlCssJinja2Parser.Jinja2ExprContentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2NotExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2NotExpression(HtmlCssJinja2Parser.Jinja2NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2NotExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2NotExpression(HtmlCssJinja2Parser.Jinja2NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2AddSubExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2AddSubExpression(HtmlCssJinja2Parser.Jinja2AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2AddSubExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2AddSubExpression(HtmlCssJinja2Parser.Jinja2AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2IsNotExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2IsNotExpression(HtmlCssJinja2Parser.Jinja2IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2IsNotExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2IsNotExpression(HtmlCssJinja2Parser.Jinja2IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2AtomExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2AtomExpression(HtmlCssJinja2Parser.Jinja2AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2AtomExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2AtomExpression(HtmlCssJinja2Parser.Jinja2AtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2MulDivModExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2MulDivModExpression(HtmlCssJinja2Parser.Jinja2MulDivModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2MulDivModExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2MulDivModExpression(HtmlCssJinja2Parser.Jinja2MulDivModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2LogicalExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2LogicalExpression(HtmlCssJinja2Parser.Jinja2LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2LogicalExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2LogicalExpression(HtmlCssJinja2Parser.Jinja2LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2ComparisonExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2ComparisonExpression(HtmlCssJinja2Parser.Jinja2ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2ComparisonExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2ComparisonExpression(HtmlCssJinja2Parser.Jinja2ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2IsExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2IsExpression(HtmlCssJinja2Parser.Jinja2IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2IsExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2IsExpression(HtmlCssJinja2Parser.Jinja2IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2AtomExpressionBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprAtomExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2AtomExpressionBody(HtmlCssJinja2Parser.Jinja2AtomExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2AtomExpressionBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprAtomExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2AtomExpressionBody(HtmlCssJinja2Parser.Jinja2AtomExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2CallTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprTrailer}.
	 * @param ctx the parse tree
	 */
	void enterJinja2CallTrailer(HtmlCssJinja2Parser.Jinja2CallTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2CallTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprTrailer}.
	 * @param ctx the parse tree
	 */
	void exitJinja2CallTrailer(HtmlCssJinja2Parser.Jinja2CallTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2SubscriptTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprTrailer}.
	 * @param ctx the parse tree
	 */
	void enterJinja2SubscriptTrailer(HtmlCssJinja2Parser.Jinja2SubscriptTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2SubscriptTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprTrailer}.
	 * @param ctx the parse tree
	 */
	void exitJinja2SubscriptTrailer(HtmlCssJinja2Parser.Jinja2SubscriptTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2AttributeTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprTrailer}.
	 * @param ctx the parse tree
	 */
	void enterJinja2AttributeTrailer(HtmlCssJinja2Parser.Jinja2AttributeTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2AttributeTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprTrailer}.
	 * @param ctx the parse tree
	 */
	void exitJinja2AttributeTrailer(HtmlCssJinja2Parser.Jinja2AttributeTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2ParenthesizedAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterJinja2ParenthesizedAtom(HtmlCssJinja2Parser.Jinja2ParenthesizedAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2ParenthesizedAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitJinja2ParenthesizedAtom(HtmlCssJinja2Parser.Jinja2ParenthesizedAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2ListAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterJinja2ListAtom(HtmlCssJinja2Parser.Jinja2ListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2ListAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitJinja2ListAtom(HtmlCssJinja2Parser.Jinja2ListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2LiteralAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterJinja2LiteralAtom(HtmlCssJinja2Parser.Jinja2LiteralAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2LiteralAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitJinja2LiteralAtom(HtmlCssJinja2Parser.Jinja2LiteralAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2IntLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2IntLiteral(HtmlCssJinja2Parser.Jinja2IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2IntLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2IntLiteral(HtmlCssJinja2Parser.Jinja2IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2DoubleLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2DoubleLiteral(HtmlCssJinja2Parser.Jinja2DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2DoubleLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2DoubleLiteral(HtmlCssJinja2Parser.Jinja2DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StringLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StringLiteral(HtmlCssJinja2Parser.Jinja2StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StringLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StringLiteral(HtmlCssJinja2Parser.Jinja2StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2TrueLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2TrueLiteral(HtmlCssJinja2Parser.Jinja2TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2TrueLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2TrueLiteral(HtmlCssJinja2Parser.Jinja2TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2FalseLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2FalseLiteral(HtmlCssJinja2Parser.Jinja2FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2FalseLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2FalseLiteral(HtmlCssJinja2Parser.Jinja2FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2NullLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2NullLiteral(HtmlCssJinja2Parser.Jinja2NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2NullLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2NullLiteral(HtmlCssJinja2Parser.Jinja2NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2IdLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2IdLiteral(HtmlCssJinja2Parser.Jinja2IdLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2IdLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2IdLiteral(HtmlCssJinja2Parser.Jinja2IdLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2FunctionArg}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprArgument}.
	 * @param ctx the parse tree
	 */
	void enterJinja2FunctionArg(HtmlCssJinja2Parser.Jinja2FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2FunctionArg}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaExprArgument}.
	 * @param ctx the parse tree
	 */
	void exitJinja2FunctionArg(HtmlCssJinja2Parser.Jinja2FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2ForBlock}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinja2ForBlock(HtmlCssJinja2Parser.Jinja2ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2ForBlock}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinja2ForBlock(HtmlCssJinja2Parser.Jinja2ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2IfBlock}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinja2IfBlock(HtmlCssJinja2Parser.Jinja2IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2IfBlock}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinja2IfBlock(HtmlCssJinja2Parser.Jinja2IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2ForBlockBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaForBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinja2ForBlockBody(HtmlCssJinja2Parser.Jinja2ForBlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2ForBlockBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaForBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinja2ForBlockBody(HtmlCssJinja2Parser.Jinja2ForBlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2ForStatement}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaForStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinja2ForStatement(HtmlCssJinja2Parser.Jinja2ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2ForStatement}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaForStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinja2ForStatement(HtmlCssJinja2Parser.Jinja2ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2IfBlockBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinja2IfBlockBody(HtmlCssJinja2Parser.Jinja2IfBlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2IfBlockBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinja2IfBlockBody(HtmlCssJinja2Parser.Jinja2IfBlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtIsExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtIsExpression(HtmlCssJinja2Parser.Jinja2StmtIsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtIsExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtIsExpression(HtmlCssJinja2Parser.Jinja2StmtIsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtAddSubExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtAddSubExpression(HtmlCssJinja2Parser.Jinja2StmtAddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtAddSubExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtAddSubExpression(HtmlCssJinja2Parser.Jinja2StmtAddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtNotExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtNotExpression(HtmlCssJinja2Parser.Jinja2StmtNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtNotExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtNotExpression(HtmlCssJinja2Parser.Jinja2StmtNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtComparisonExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtComparisonExpression(HtmlCssJinja2Parser.Jinja2StmtComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtComparisonExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtComparisonExpression(HtmlCssJinja2Parser.Jinja2StmtComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtLogicalExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtLogicalExpression(HtmlCssJinja2Parser.Jinja2StmtLogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtLogicalExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtLogicalExpression(HtmlCssJinja2Parser.Jinja2StmtLogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtAtomExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtAtomExpression(HtmlCssJinja2Parser.Jinja2StmtAtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtAtomExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtAtomExpression(HtmlCssJinja2Parser.Jinja2StmtAtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtMulDivModExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtMulDivModExpression(HtmlCssJinja2Parser.Jinja2StmtMulDivModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtMulDivModExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtMulDivModExpression(HtmlCssJinja2Parser.Jinja2StmtMulDivModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtIsNotExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtIsNotExpression(HtmlCssJinja2Parser.Jinja2StmtIsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtIsNotExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtIsNotExpression(HtmlCssJinja2Parser.Jinja2StmtIsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtAtomExpressionBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtAtomExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtAtomExpressionBody(HtmlCssJinja2Parser.Jinja2StmtAtomExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtAtomExpressionBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtAtomExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtAtomExpressionBody(HtmlCssJinja2Parser.Jinja2StmtAtomExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtCallTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtTrailer}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtCallTrailer(HtmlCssJinja2Parser.Jinja2StmtCallTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtCallTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtTrailer}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtCallTrailer(HtmlCssJinja2Parser.Jinja2StmtCallTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtSubscriptTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtTrailer}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtSubscriptTrailer(HtmlCssJinja2Parser.Jinja2StmtSubscriptTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtSubscriptTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtTrailer}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtSubscriptTrailer(HtmlCssJinja2Parser.Jinja2StmtSubscriptTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtAttributeTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtTrailer}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtAttributeTrailer(HtmlCssJinja2Parser.Jinja2StmtAttributeTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtAttributeTrailer}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtTrailer}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtAttributeTrailer(HtmlCssJinja2Parser.Jinja2StmtAttributeTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtParenthesizedAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtAtom}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtParenthesizedAtom(HtmlCssJinja2Parser.Jinja2StmtParenthesizedAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtParenthesizedAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtAtom}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtParenthesizedAtom(HtmlCssJinja2Parser.Jinja2StmtParenthesizedAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtListAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtAtom}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtListAtom(HtmlCssJinja2Parser.Jinja2StmtListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtListAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtAtom}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtListAtom(HtmlCssJinja2Parser.Jinja2StmtListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtLiteralAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtAtom}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtLiteralAtom(HtmlCssJinja2Parser.Jinja2StmtLiteralAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtLiteralAtom}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtAtom}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtLiteralAtom(HtmlCssJinja2Parser.Jinja2StmtLiteralAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtIntLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtIntLiteral(HtmlCssJinja2Parser.Jinja2StmtIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtIntLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtIntLiteral(HtmlCssJinja2Parser.Jinja2StmtIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtDoubleLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtDoubleLiteral(HtmlCssJinja2Parser.Jinja2StmtDoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtDoubleLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtDoubleLiteral(HtmlCssJinja2Parser.Jinja2StmtDoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtStringLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtStringLiteral(HtmlCssJinja2Parser.Jinja2StmtStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtStringLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtStringLiteral(HtmlCssJinja2Parser.Jinja2StmtStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtTrueLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtTrueLiteral(HtmlCssJinja2Parser.Jinja2StmtTrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtTrueLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtTrueLiteral(HtmlCssJinja2Parser.Jinja2StmtTrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtFalseLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtFalseLiteral(HtmlCssJinja2Parser.Jinja2StmtFalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtFalseLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtFalseLiteral(HtmlCssJinja2Parser.Jinja2StmtFalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtNullLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtNullLiteral(HtmlCssJinja2Parser.Jinja2StmtNullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtNullLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtNullLiteral(HtmlCssJinja2Parser.Jinja2StmtNullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtIdLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtIdLiteral(HtmlCssJinja2Parser.Jinja2StmtIdLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtIdLiteral}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtLiteral}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtIdLiteral(HtmlCssJinja2Parser.Jinja2StmtIdLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2StmtFunctionArg}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtArgument}.
	 * @param ctx the parse tree
	 */
	void enterJinja2StmtFunctionArg(HtmlCssJinja2Parser.Jinja2StmtFunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2StmtFunctionArg}
	 * labeled alternative in {@link HtmlCssJinja2Parser#jinjaStmtArgument}.
	 * @param ctx the parse tree
	 */
	void exitJinja2StmtFunctionArg(HtmlCssJinja2Parser.Jinja2StmtFunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja2TemplateContent}
	 * labeled alternative in {@link HtmlCssJinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterJinja2TemplateContent(HtmlCssJinja2Parser.Jinja2TemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja2TemplateContent}
	 * labeled alternative in {@link HtmlCssJinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitJinja2TemplateContent(HtmlCssJinja2Parser.Jinja2TemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyleBody(HtmlCssJinja2Parser.StyleBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyleBody(HtmlCssJinja2Parser.StyleBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssStylesheet}
	 * labeled alternative in {@link HtmlCssJinja2Parser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterCssStylesheet(HtmlCssJinja2Parser.CssStylesheetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssStylesheet}
	 * labeled alternative in {@link HtmlCssJinja2Parser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitCssStylesheet(HtmlCssJinja2Parser.CssStylesheetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssImportWithMediaQueryAndSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void enterCssImportWithMediaQueryAndSemicolon(HtmlCssJinja2Parser.CssImportWithMediaQueryAndSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssImportWithMediaQueryAndSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void exitCssImportWithMediaQueryAndSemicolon(HtmlCssJinja2Parser.CssImportWithMediaQueryAndSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssImportWithSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void enterCssImportWithSemicolon(HtmlCssJinja2Parser.CssImportWithSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssImportWithSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void exitCssImportWithSemicolon(HtmlCssJinja2Parser.CssImportWithSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssImportWithMediaQueryNoSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void enterCssImportWithMediaQueryNoSemicolon(HtmlCssJinja2Parser.CssImportWithMediaQueryNoSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssImportWithMediaQueryNoSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void exitCssImportWithMediaQueryNoSemicolon(HtmlCssJinja2Parser.CssImportWithMediaQueryNoSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssImportWithoutSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void enterCssImportWithoutSemicolon(HtmlCssJinja2Parser.CssImportWithoutSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssImportWithoutSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void exitCssImportWithoutSemicolon(HtmlCssJinja2Parser.CssImportWithoutSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaQueriesDefinition}
	 * labeled alternative in {@link HtmlCssJinja2Parser#media}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQueriesDefinition(HtmlCssJinja2Parser.CssMediaQueriesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaQueriesDefinition}
	 * labeled alternative in {@link HtmlCssJinja2Parser#media}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQueriesDefinition(HtmlCssJinja2Parser.CssMediaQueriesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaQueriesList}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQueriesList(HtmlCssJinja2Parser.CssMediaQueriesListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaQueriesList}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQueriesList(HtmlCssJinja2Parser.CssMediaQueriesListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaQueryTypeAndExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQueryTypeAndExpressions(HtmlCssJinja2Parser.CssMediaQueryTypeAndExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaQueryTypeAndExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQueryTypeAndExpressions(HtmlCssJinja2Parser.CssMediaQueryTypeAndExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaQueryExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQueryExpressions(HtmlCssJinja2Parser.CssMediaQueryExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaQueryExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQueryExpressions(HtmlCssJinja2Parser.CssMediaQueryExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaExpressions(HtmlCssJinja2Parser.CssMediaExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaExpressions(HtmlCssJinja2Parser.CssMediaExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorGroupBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorGroupBody(HtmlCssJinja2Parser.CssSelectorGroupBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorGroupBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorGroupBody(HtmlCssJinja2Parser.CssSelectorGroupBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorGroup}
	 * labeled alternative in {@link HtmlCssJinja2Parser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorGroup(HtmlCssJinja2Parser.CssSelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorGroup}
	 * labeled alternative in {@link HtmlCssJinja2Parser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorGroup(HtmlCssJinja2Parser.CssSelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssAdjacentSiblingCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCssAdjacentSiblingCombinator(HtmlCssJinja2Parser.CssAdjacentSiblingCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssAdjacentSiblingCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCssAdjacentSiblingCombinator(HtmlCssJinja2Parser.CssAdjacentSiblingCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssChildCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCssChildCombinator(HtmlCssJinja2Parser.CssChildCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssChildCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCssChildCombinator(HtmlCssJinja2Parser.CssChildCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssGeneralSiblingCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCssGeneralSiblingCombinator(HtmlCssJinja2Parser.CssGeneralSiblingCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssGeneralSiblingCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCssGeneralSiblingCombinator(HtmlCssJinja2Parser.CssGeneralSiblingCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDescendantCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCssDescendantCombinator(HtmlCssJinja2Parser.CssDescendantCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDescendantCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCssDescendantCombinator(HtmlCssJinja2Parser.CssDescendantCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCompoundSelectorWithType}
	 * labeled alternative in {@link HtmlCssJinja2Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void enterCssCompoundSelectorWithType(HtmlCssJinja2Parser.CssCompoundSelectorWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCompoundSelectorWithType}
	 * labeled alternative in {@link HtmlCssJinja2Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void exitCssCompoundSelectorWithType(HtmlCssJinja2Parser.CssCompoundSelectorWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCompoundSelectorWithoutType}
	 * labeled alternative in {@link HtmlCssJinja2Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void enterCssCompoundSelectorWithoutType(HtmlCssJinja2Parser.CssCompoundSelectorWithoutTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCompoundSelectorWithoutType}
	 * labeled alternative in {@link HtmlCssJinja2Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void exitCssCompoundSelectorWithoutType(HtmlCssJinja2Parser.CssCompoundSelectorWithoutTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssElementTypeSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssElementTypeSelector(HtmlCssJinja2Parser.CssElementTypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssElementTypeSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssElementTypeSelector(HtmlCssJinja2Parser.CssElementTypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNamespacePrefix}
	 * labeled alternative in {@link HtmlCssJinja2Parser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterCssNamespacePrefix(HtmlCssJinja2Parser.CssNamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNamespacePrefix}
	 * labeled alternative in {@link HtmlCssJinja2Parser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitCssNamespacePrefix(HtmlCssJinja2Parser.CssNamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#universal}.
	 * @param ctx the parse tree
	 */
	void enterCssUniversalSelector(HtmlCssJinja2Parser.CssUniversalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#universal}.
	 * @param ctx the parse tree
	 */
	void exitCssUniversalSelector(HtmlCssJinja2Parser.CssUniversalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#className}.
	 * @param ctx the parse tree
	 */
	void enterCssClassSelector(HtmlCssJinja2Parser.CssClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#className}.
	 * @param ctx the parse tree
	 */
	void exitCssClassSelector(HtmlCssJinja2Parser.CssClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPseudoClassOrElement}
	 * labeled alternative in {@link HtmlCssJinja2Parser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterCssPseudoClassOrElement(HtmlCssJinja2Parser.CssPseudoClassOrElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPseudoClassOrElement}
	 * labeled alternative in {@link HtmlCssJinja2Parser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitCssPseudoClassOrElement(HtmlCssJinja2Parser.CssPseudoClassOrElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssFunctionalPseudo}
	 * labeled alternative in {@link HtmlCssJinja2Parser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	void enterCssFunctionalPseudo(HtmlCssJinja2Parser.CssFunctionalPseudoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssFunctionalPseudo}
	 * labeled alternative in {@link HtmlCssJinja2Parser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	void exitCssFunctionalPseudo(HtmlCssJinja2Parser.CssFunctionalPseudoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCssValueExpression(HtmlCssJinja2Parser.CssValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCssValueExpression(HtmlCssJinja2Parser.CssValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDivideOperator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterCssDivideOperator(HtmlCssJinja2Parser.CssDivideOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDivideOperator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitCssDivideOperator(HtmlCssJinja2Parser.CssDivideOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCommaSeparator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterCssCommaSeparator(HtmlCssJinja2Parser.CssCommaSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCommaSeparator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitCssCommaSeparator(HtmlCssJinja2Parser.CssCommaSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSpaceSeparator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterCssSpaceSeparator(HtmlCssJinja2Parser.CssSpaceSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSpaceSeparator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitCssSpaceSeparator(HtmlCssJinja2Parser.CssSpaceSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdProperty}
	 * labeled alternative in {@link HtmlCssJinja2Parser#property_}.
	 * @param ctx the parse tree
	 */
	void enterCssIdProperty(HtmlCssJinja2Parser.CssIdPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdProperty}
	 * labeled alternative in {@link HtmlCssJinja2Parser#property_}.
	 * @param ctx the parse tree
	 */
	void exitCssIdProperty(HtmlCssJinja2Parser.CssIdPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssVarProperty}
	 * labeled alternative in {@link HtmlCssJinja2Parser#property_}.
	 * @param ctx the parse tree
	 */
	void enterCssVarProperty(HtmlCssJinja2Parser.CssVarPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssVarProperty}
	 * labeled alternative in {@link HtmlCssJinja2Parser#property_}.
	 * @param ctx the parse tree
	 */
	void exitCssVarProperty(HtmlCssJinja2Parser.CssVarPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRulesetDefinition}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterCssRulesetDefinition(HtmlCssJinja2Parser.CssRulesetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRulesetDefinition}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitCssRulesetDefinition(HtmlCssJinja2Parser.CssRulesetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDeclarationList}
	 * labeled alternative in {@link HtmlCssJinja2Parser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclarationList(HtmlCssJinja2Parser.CssDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDeclarationList}
	 * labeled alternative in {@link HtmlCssJinja2Parser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclarationList(HtmlCssJinja2Parser.CssDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link HtmlCssJinja2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(HtmlCssJinja2Parser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link HtmlCssJinja2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(HtmlCssJinja2Parser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssExpressionSequence}
	 * labeled alternative in {@link HtmlCssJinja2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCssExpressionSequence(HtmlCssJinja2Parser.CssExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssExpressionSequence}
	 * labeled alternative in {@link HtmlCssJinja2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCssExpressionSequence(HtmlCssJinja2Parser.CssExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNumberTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssNumberTerm(HtmlCssJinja2Parser.CssNumberTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNumberTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssNumberTerm(HtmlCssJinja2Parser.CssNumberTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPercentageTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssPercentageTerm(HtmlCssJinja2Parser.CssPercentageTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPercentageTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssPercentageTerm(HtmlCssJinja2Parser.CssPercentageTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDimensionTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssDimensionTerm(HtmlCssJinja2Parser.CssDimensionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDimensionTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssDimensionTerm(HtmlCssJinja2Parser.CssDimensionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssStringTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssStringTerm(HtmlCssJinja2Parser.CssStringTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssStringTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssStringTerm(HtmlCssJinja2Parser.CssStringTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssIdTerm(HtmlCssJinja2Parser.CssIdTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssIdTerm(HtmlCssJinja2Parser.CssIdTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssVariableTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssVariableTerm(HtmlCssJinja2Parser.CssVariableTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssVariableTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssVariableTerm(HtmlCssJinja2Parser.CssVariableTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssUrlTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssUrlTerm(HtmlCssJinja2Parser.CssUrlTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssUrlTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssUrlTerm(HtmlCssJinja2Parser.CssUrlTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssHexColorTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssHexColorTerm(HtmlCssJinja2Parser.CssHexColorTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssHexColorTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssHexColorTerm(HtmlCssJinja2Parser.CssHexColorTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCalcTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssCalcTerm(HtmlCssJinja2Parser.CssCalcTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCalcTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssCalcTerm(HtmlCssJinja2Parser.CssCalcTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssFunctionTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterCssFunctionTerm(HtmlCssJinja2Parser.CssFunctionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssFunctionTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitCssFunctionTerm(HtmlCssJinja2Parser.CssFunctionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNumberExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterCssNumberExpression(HtmlCssJinja2Parser.CssNumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNumberExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitCssNumberExpression(HtmlCssJinja2Parser.CssNumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPercentageExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#percentage}.
	 * @param ctx the parse tree
	 */
	void enterCssPercentageExpression(HtmlCssJinja2Parser.CssPercentageExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPercentageExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#percentage}.
	 * @param ctx the parse tree
	 */
	void exitCssPercentageExpression(HtmlCssJinja2Parser.CssPercentageExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDimensionExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterCssDimensionExpression(HtmlCssJinja2Parser.CssDimensionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDimensionExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitCssDimensionExpression(HtmlCssJinja2Parser.CssDimensionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRuleset}
	 * labeled alternative in {@link HtmlCssJinja2Parser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssRuleset(HtmlCssJinja2Parser.CssRulesetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRuleset}
	 * labeled alternative in {@link HtmlCssJinja2Parser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssRuleset(HtmlCssJinja2Parser.CssRulesetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaQueries}
	 * labeled alternative in {@link HtmlCssJinja2Parser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQueries(HtmlCssJinja2Parser.CssMediaQueriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaQueries}
	 * labeled alternative in {@link HtmlCssJinja2Parser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQueries(HtmlCssJinja2Parser.CssMediaQueriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssGroupRulebody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	void enterCssGroupRulebody(HtmlCssJinja2Parser.CssGroupRulebodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssGroupRulebody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	void exitCssGroupRulebody(HtmlCssJinja2Parser.CssGroupRulebodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssQuotedUrl}
	 * labeled alternative in {@link HtmlCssJinja2Parser#url}.
	 * @param ctx the parse tree
	 */
	void enterCssQuotedUrl(HtmlCssJinja2Parser.CssQuotedUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssQuotedUrl}
	 * labeled alternative in {@link HtmlCssJinja2Parser#url}.
	 * @param ctx the parse tree
	 */
	void exitCssQuotedUrl(HtmlCssJinja2Parser.CssQuotedUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssUnquotedUrl}
	 * labeled alternative in {@link HtmlCssJinja2Parser#url}.
	 * @param ctx the parse tree
	 */
	void enterCssUnquotedUrl(HtmlCssJinja2Parser.CssUnquotedUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssUnquotedUrl}
	 * labeled alternative in {@link HtmlCssJinja2Parser#url}.
	 * @param ctx the parse tree
	 */
	void exitCssUnquotedUrl(HtmlCssJinja2Parser.CssUnquotedUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCalcSumExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcSum}.
	 * @param ctx the parse tree
	 */
	void enterCssCalcSumExpression(HtmlCssJinja2Parser.CssCalcSumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCalcSumExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcSum}.
	 * @param ctx the parse tree
	 */
	void exitCssCalcSumExpression(HtmlCssJinja2Parser.CssCalcSumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCalcProductExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcProduct}.
	 * @param ctx the parse tree
	 */
	void enterCssCalcProductExpression(HtmlCssJinja2Parser.CssCalcProductExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCalcProductExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcProduct}.
	 * @param ctx the parse tree
	 */
	void exitCssCalcProductExpression(HtmlCssJinja2Parser.CssCalcProductExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNumberValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCssNumberValue(HtmlCssJinja2Parser.CssNumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNumberValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCssNumberValue(HtmlCssJinja2Parser.CssNumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDimensionValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCssDimensionValue(HtmlCssJinja2Parser.CssDimensionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDimensionValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCssDimensionValue(HtmlCssJinja2Parser.CssDimensionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPercentageValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCssPercentageValue(HtmlCssJinja2Parser.CssPercentageValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPercentageValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCssPercentageValue(HtmlCssJinja2Parser.CssPercentageValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNestedCalcExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCssNestedCalcExpression(HtmlCssJinja2Parser.CssNestedCalcExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNestedCalcExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCssNestedCalcExpression(HtmlCssJinja2Parser.CssNestedCalcExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdentifier}
	 * labeled alternative in {@link HtmlCssJinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void enterCssIdentifier(HtmlCssJinja2Parser.CssIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdentifier}
	 * labeled alternative in {@link HtmlCssJinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void exitCssIdentifier(HtmlCssJinja2Parser.CssIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaOnly}
	 * labeled alternative in {@link HtmlCssJinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaOnly(HtmlCssJinja2Parser.CssMediaOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaOnly}
	 * labeled alternative in {@link HtmlCssJinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaOnly(HtmlCssJinja2Parser.CssMediaOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNot}
	 * labeled alternative in {@link HtmlCssJinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void enterCssNot(HtmlCssJinja2Parser.CssNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNot}
	 * labeled alternative in {@link HtmlCssJinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void exitCssNot(HtmlCssJinja2Parser.CssNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssAnd}
	 * labeled alternative in {@link HtmlCssJinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void enterCssAnd(HtmlCssJinja2Parser.CssAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssAnd}
	 * labeled alternative in {@link HtmlCssJinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void exitCssAnd(HtmlCssJinja2Parser.CssAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssWhiteSpace}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ws}.
	 * @param ctx the parse tree
	 */
	void enterCssWhiteSpace(HtmlCssJinja2Parser.CssWhiteSpaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssWhiteSpace}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ws}.
	 * @param ctx the parse tree
	 */
	void exitCssWhiteSpace(HtmlCssJinja2Parser.CssWhiteSpaceContext ctx);
}