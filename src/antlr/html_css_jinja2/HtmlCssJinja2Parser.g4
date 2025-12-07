parser grammar HtmlCssJinja2Parser;

options {
    tokenVocab = HtmlCssJinja2Lexer;
}

htmlDocument
    : SEA_WS* DTD? SEA_WS* htmlElements*                                  #HtmlDocumentRule
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*                                     #HtmlElementsRule
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE
    )                                                                     #HtmlOpeningClosingTag
    | style                                                               #StyleElement
    ;

htmlContent
    : htmlCharData? ((htmlElement | htmlComment) htmlCharData?)*          #HtmlContentRule
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?                               #HtmlAttributeRule
    ;

htmlCharData
    : HTML_TEXT                                                           #HtmlTextData
    | SEA_WS                                                              #HtmlWhitespaceData
    ;

htmlMisc // HTML Miscellaneous
    : htmlComment                                                         #HtmlMiscComment
    | SEA_WS                                                              #HtmlMiscWhitespace
    ;

htmlComment
    : HTML_COMMENT                                                        #HtmlCommentRule
    ;

style
    : STYLE_OPEN stylesheet STYLE_CLOSE                                   #StyleBody
    ;

stylesheet
    : ws (imports ws)* (nestedStatement ws)*                              #CssStylesheet
    ;

imports
    : Import ws (String_ | url) ws mediaQueryList SemiColon ws            #CssImportWithMediaQueryAndSemicolon
    | Import ws (String_ | url) ws SemiColon ws                           #CssImportWithSemicolon
    | Import ws (String_ | url) ws mediaQueryList                         #CssImportWithMediaQueryNoSemicolon
    | Import ws (String_ | url) ws                                        #CssImportWithoutSemicolon
    ;

media // Media queries
    : Media ws mediaQueryList groupRuleBody ws                            #CssMediaQueriesDefinition
    ;

mediaQueryList
    : (mediaQuery (Comma ws mediaQuery)*)? ws                             #CssMediaQueriesList
    ;

mediaQuery
    : (MediaOnly | Not)? ws ident ws (And ws mediaExpression)*            #CssMediaQueryTypeAndExpressions
    | mediaExpression (And ws mediaExpression)*                           #CssMediaQueryExpressions
    ;

mediaExpression
    : '(' ws ident ws (':' ws expr)? ')' ws                               #CssMediaExpressions
    ;

selectorGroup
    : selector (Comma ws selector)*
    ;

selector
    : simpleSelectorSequence ws (combinator simpleSelectorSequence ws)*   #CssSelectorGroup
    ;

combinator
    : Plus ws                                                             #CssAdjacentSiblingCombinator
    | Greater ws                                                          #CssChildCombinator
    | Tilde ws                                                            #CssGeneralSiblingCombinator
    | Space ws                                                            #CssDescendantCombinator
    ;

simpleSelectorSequence
    : (typeSelector | universal) (Hash | className | pseudo)*             #CssCompoundSelectorWithType
    | ( Hash | className | pseudo)+                                       #CssCompoundSelectorWithoutType
    ;

typeSelector
    : typeNamespacePrefix? ident                                          #CssElementTypeSelector
    ;

typeNamespacePrefix
    : (ident | '*')? '|'                                                  #CssNamespacePrefix
    ;

universal
    : typeNamespacePrefix? '*'                                            #CssUniversalSelector
    ;

className
    : '.' ident                                                           #CssClassSelector
    ;

pseudo
    : ':' ':'? (ident | functionalPseudo)                                 #CssPseudoClassOrElement
    ;

functionalPseudo
    : Function_ ws expression ')'                                         #CssFunctionalPseudo
    ;

expression
    : (( Plus | Minus | Dimension | Number | String_ | ident) ws)+        #CssValueExpression
    ;

operator_
    : Divide ws                                                           #CssDivideOperator
    | Comma ws                                                            #CssCommaSeparator
    | Space ws                                                            #CssSpaceSeparator
    ;

property_
    : ident ws                                                            #CssIdProperty
    | Variable ws                                                         #CssVarProperty
    ;

ruleset
    : selectorGroup '{' ws declarationList? '}' ws                        #CssRulesetDefinition
    ;

declarationList
    : (';' ws)* declaration ws (';' ws declaration?)*                     #CssDeclarationList
    ;

declaration
    : property_ ':' ws expr (Important ws)?                               #CssDeclaration
    ;

expr
    : term (operator_? term)*                                             #CssExpressionSequence
    ;

term
    : number ws                                                           #CssNumberTerm
    | percentage ws                                                       #CssPercentageTerm
    | dimension ws                                                        #CssDimensionTerm
    | String_ ws                                                          #CssStringTerm
    | ident ws                                                            #CssIdTerm
    | Var ws Variable ws ')' ws                                           #CssVariableTerm
    | url ws                                                              #CssUrlTerm
    | Hash ws                                                             #CssHexColorTerm
    | Calc ws calcSum ')' ws                                              #CssCalcTerm
    | Function_ ws expr ')' ws                                            #CssFunctionTerm
    ;

number
    : (Plus | Minus)? Number                                              #CssNumberExpression
    ;

percentage
    : (Plus | Minus)? Percentage                                          #CssPercentageExpression
    ;

dimension
    : (Plus | Minus)? Dimension                                           #CssDimensionExpression
    ;

nestedStatement
    : ruleset                                                             #CssRuleset
    | media                                                               #CssMediaQueries
    ;

groupRuleBody
    : '{' ws nestedStatement* '}' ws                                      #CssGroupRulebody
    ;

url
    : Url_ ws String_ ws ')'                                              #CssQuotedUrl
    | Url                                                                 #CssUnquotedUrl
    ;

calcSum
    : calcProduct (Space ws (Plus | Minus) ws Space ws calcProduct)*      #CssCalcSumExpression
    ;

calcProduct
    : calcValue (Multiply ws calcValue | Divide ws number ws)*            #CssCalcProductExpression
    ;

calcValue
    : number ws                                                           #CssNumberValue
    | dimension ws                                                        #CssDimensionValue
    | percentage ws                                                       #CssPercentageValue
    | OpenParen ws calcSum CloseParen ws                                  #CssNestedCalcExpression
    ;

ident
    : Ident                                                               #CssIdentifier
    | MediaOnly                                                           #CssMediaOnly
    | Not                                                                 #CssNot
    | And                                                                 #CssAnd
    ;

ws
    : (Comment | Space)*                                                  #CssWhiteSpace
    ;