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
	/**
	 * Visit a parse tree produced by the {@code CssStylesheet}
	 * labeled alternative in {@link HtmlCssJinja2Parser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStylesheet(HtmlCssJinja2Parser.CssStylesheetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssImportWithMediaQueryAndSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportWithMediaQueryAndSemicolon(HtmlCssJinja2Parser.CssImportWithMediaQueryAndSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssImportWithSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportWithSemicolon(HtmlCssJinja2Parser.CssImportWithSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssImportWithMediaQueryNoSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportWithMediaQueryNoSemicolon(HtmlCssJinja2Parser.CssImportWithMediaQueryNoSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssImportWithoutSemicolon}
	 * labeled alternative in {@link HtmlCssJinja2Parser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportWithoutSemicolon(HtmlCssJinja2Parser.CssImportWithoutSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaQueriesDefinition}
	 * labeled alternative in {@link HtmlCssJinja2Parser#media}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQueriesDefinition(HtmlCssJinja2Parser.CssMediaQueriesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaQueriesList}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQueriesList(HtmlCssJinja2Parser.CssMediaQueriesListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaQueryTypeAndExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQueryTypeAndExpressions(HtmlCssJinja2Parser.CssMediaQueryTypeAndExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaQueryExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQueryExpressions(HtmlCssJinja2Parser.CssMediaQueryExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaExpressions}
	 * labeled alternative in {@link HtmlCssJinja2Parser#mediaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaExpressions(HtmlCssJinja2Parser.CssMediaExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlCssJinja2Parser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(HtmlCssJinja2Parser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorGroup}
	 * labeled alternative in {@link HtmlCssJinja2Parser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorGroup(HtmlCssJinja2Parser.CssSelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssAdjacentSiblingCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAdjacentSiblingCombinator(HtmlCssJinja2Parser.CssAdjacentSiblingCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssChildCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssChildCombinator(HtmlCssJinja2Parser.CssChildCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssGeneralSiblingCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssGeneralSiblingCombinator(HtmlCssJinja2Parser.CssGeneralSiblingCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDescendantCombinator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDescendantCombinator(HtmlCssJinja2Parser.CssDescendantCombinatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCompoundSelectorWithType}
	 * labeled alternative in {@link HtmlCssJinja2Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCompoundSelectorWithType(HtmlCssJinja2Parser.CssCompoundSelectorWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCompoundSelectorWithoutType}
	 * labeled alternative in {@link HtmlCssJinja2Parser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCompoundSelectorWithoutType(HtmlCssJinja2Parser.CssCompoundSelectorWithoutTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssElementTypeSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssElementTypeSelector(HtmlCssJinja2Parser.CssElementTypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNamespacePrefix}
	 * labeled alternative in {@link HtmlCssJinja2Parser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNamespacePrefix(HtmlCssJinja2Parser.CssNamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssUniversalSelector(HtmlCssJinja2Parser.CssUniversalSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link HtmlCssJinja2Parser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClassSelector(HtmlCssJinja2Parser.CssClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPseudoClassOrElement}
	 * labeled alternative in {@link HtmlCssJinja2Parser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPseudoClassOrElement(HtmlCssJinja2Parser.CssPseudoClassOrElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssFunctionalPseudo}
	 * labeled alternative in {@link HtmlCssJinja2Parser#functionalPseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionalPseudo(HtmlCssJinja2Parser.CssFunctionalPseudoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueExpression(HtmlCssJinja2Parser.CssValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDivideOperator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDivideOperator(HtmlCssJinja2Parser.CssDivideOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCommaSeparator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCommaSeparator(HtmlCssJinja2Parser.CssCommaSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSpaceSeparator}
	 * labeled alternative in {@link HtmlCssJinja2Parser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSpaceSeparator(HtmlCssJinja2Parser.CssSpaceSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdProperty}
	 * labeled alternative in {@link HtmlCssJinja2Parser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdProperty(HtmlCssJinja2Parser.CssIdPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssVarProperty}
	 * labeled alternative in {@link HtmlCssJinja2Parser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssVarProperty(HtmlCssJinja2Parser.CssVarPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRulesetDefinition}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRulesetDefinition(HtmlCssJinja2Parser.CssRulesetDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDeclarationList}
	 * labeled alternative in {@link HtmlCssJinja2Parser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarationList(HtmlCssJinja2Parser.CssDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link HtmlCssJinja2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(HtmlCssJinja2Parser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssExpressionSequence}
	 * labeled alternative in {@link HtmlCssJinja2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssExpressionSequence(HtmlCssJinja2Parser.CssExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNumberTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumberTerm(HtmlCssJinja2Parser.CssNumberTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPercentageTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPercentageTerm(HtmlCssJinja2Parser.CssPercentageTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDimensionTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDimensionTerm(HtmlCssJinja2Parser.CssDimensionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStringTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStringTerm(HtmlCssJinja2Parser.CssStringTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdTerm(HtmlCssJinja2Parser.CssIdTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssVariableTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssVariableTerm(HtmlCssJinja2Parser.CssVariableTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssUrlTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssUrlTerm(HtmlCssJinja2Parser.CssUrlTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssHexColorTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssHexColorTerm(HtmlCssJinja2Parser.CssHexColorTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCalcTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCalcTerm(HtmlCssJinja2Parser.CssCalcTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssFunctionTerm}
	 * labeled alternative in {@link HtmlCssJinja2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionTerm(HtmlCssJinja2Parser.CssFunctionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNumberExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumberExpression(HtmlCssJinja2Parser.CssNumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPercentageExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#percentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPercentageExpression(HtmlCssJinja2Parser.CssPercentageExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDimensionExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDimensionExpression(HtmlCssJinja2Parser.CssDimensionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRuleset}
	 * labeled alternative in {@link HtmlCssJinja2Parser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRuleset(HtmlCssJinja2Parser.CssRulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaQueries}
	 * labeled alternative in {@link HtmlCssJinja2Parser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaQueries(HtmlCssJinja2Parser.CssMediaQueriesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssGroupRulebody}
	 * labeled alternative in {@link HtmlCssJinja2Parser#groupRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssGroupRulebody(HtmlCssJinja2Parser.CssGroupRulebodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssQuotedUrl}
	 * labeled alternative in {@link HtmlCssJinja2Parser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssQuotedUrl(HtmlCssJinja2Parser.CssQuotedUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssUnquotedUrl}
	 * labeled alternative in {@link HtmlCssJinja2Parser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssUnquotedUrl(HtmlCssJinja2Parser.CssUnquotedUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCalcSumExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCalcSumExpression(HtmlCssJinja2Parser.CssCalcSumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCalcProductExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCalcProductExpression(HtmlCssJinja2Parser.CssCalcProductExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNumberValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumberValue(HtmlCssJinja2Parser.CssNumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDimensionValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDimensionValue(HtmlCssJinja2Parser.CssDimensionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPercentageValue}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPercentageValue(HtmlCssJinja2Parser.CssPercentageValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNestedCalcExpression}
	 * labeled alternative in {@link HtmlCssJinja2Parser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNestedCalcExpression(HtmlCssJinja2Parser.CssNestedCalcExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdentifier}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdentifier(HtmlCssJinja2Parser.CssIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaOnly}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaOnly(HtmlCssJinja2Parser.CssMediaOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNot}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNot(HtmlCssJinja2Parser.CssNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssAnd}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAnd(HtmlCssJinja2Parser.CssAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssWhiteSpace}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssWhiteSpace(HtmlCssJinja2Parser.CssWhiteSpaceContext ctx);
}