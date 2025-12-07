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
	 * Enter a parse tree produced by {@link HtmlCssJinja2Parser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(HtmlCssJinja2Parser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlCssJinja2Parser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(HtmlCssJinja2Parser.SelectorGroupContext ctx);
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
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterCssIdentifier(HtmlCssJinja2Parser.CssIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdentifier}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitCssIdentifier(HtmlCssJinja2Parser.CssIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaOnly}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaOnly(HtmlCssJinja2Parser.CssMediaOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaOnly}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaOnly(HtmlCssJinja2Parser.CssMediaOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNot}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterCssNot(HtmlCssJinja2Parser.CssNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNot}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitCssNot(HtmlCssJinja2Parser.CssNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssAnd}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterCssAnd(HtmlCssJinja2Parser.CssAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssAnd}
	 * labeled alternative in {@link HtmlCssJinja2Parser#ident}.
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