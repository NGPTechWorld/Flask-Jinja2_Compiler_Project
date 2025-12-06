// Generated from C:/Compiler1Project/src/antlr/html_css_jinja2/HtmlCssJinja2Parser.g4 by ANTLR 4.13.2
package antlr.html_css_jinja2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlCssJinja2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlCssJinja2ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code HtmlDocumentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocumentRule(HtmlCssJinja2Parser.HtmlDocumentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementsRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementsRule(HtmlCssJinja2Parser.HtmlElementsRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpeningClosingTag}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpeningClosingTag(HtmlCssJinja2Parser.HtmlOpeningClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(HtmlCssJinja2Parser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentRule(HtmlCssJinja2Parser.HtmlContentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttributeRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeRule(HtmlCssJinja2Parser.HtmlAttributeRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextData}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlCharData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextData(HtmlCssJinja2Parser.HtmlTextDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlWhitespaceData}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlCharData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlWhitespaceData(HtmlCssJinja2Parser.HtmlWhitespaceDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlMiscComment}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMiscComment(HtmlCssJinja2Parser.HtmlMiscCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlMiscWhitespace}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMiscWhitespace(HtmlCssJinja2Parser.HtmlMiscWhitespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentRule}
	 * labeled alternative in {@link HtmlCssJinja2Parser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentRule(HtmlCssJinja2Parser.HtmlCommentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleBody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBody(HtmlCssJinja2Parser.StyleBodyContext ctx);
}