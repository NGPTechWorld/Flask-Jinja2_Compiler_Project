// Generated from C:/Compiler1Project/src/antlr/html_css_jinja2/HtmlCssJinja2Parser.g4 by ANTLR 4.13.2
package antlr.html_css_jinja2;
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
}