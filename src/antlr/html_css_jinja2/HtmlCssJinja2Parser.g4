parser grammar HtmlCssJinja2Parser;

@header {
    package antlr.html_css_jinja2.generated;
}

options {
    tokenVocab = HtmlCssJinja2Lexer;
}

//! HTML document structure 

// DONE htmlDocument
htmlDocument
: SEA_WS* DTD? SEA_WS* (htmlElements | jinjaBlock)* EOF            #HtmlDocumentRule
;

// DONE htmlElements
htmlElements
: htmlMisc* htmlElement htmlMisc*                                  #HtmlElementsRule
;

// DONE htmlElement
// DONE  HtmlOpeningClosingTag
// TODO  StyleElement
htmlElement //! + visit(ctx)
: TAG_OPEN TAG_NAME htmlAttribute* 
(
TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? 
| TAG_SLASH_CLOSE
)                                                                  #HtmlOpeningClosingTag 
| style                                                            #StyleElement    
;

// DOING HtmlContentRule
htmlContent //! visitChildren()
: (htmlCharData | htmlElement | htmlComment | jinjaBlock)*         #HtmlContentRule 
;

// DONE htmlAttribute
htmlAttribute //! ctx.INT().getText()
: TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?                            #HtmlAttributeRule 
;

// DONE HtmlTextData
// DONE HtmlWhitespaceData (Delete)
htmlCharData
: HTML_TEXT                                                        #HtmlTextData 
| SEA_WS                                                           #HtmlWhitespaceData 
;

// DONE HtmlMiscComment (Delete)
// DONE HtmlMiscWhitespace (Delete)
htmlMisc // HTML Miscellaneous
: htmlComment                                                      #HtmlMiscComment 
| SEA_WS                                                           #HtmlMiscWhitespace 
;

// DONE htmlComment
htmlComment
: HTML_COMMENT                                                     #HtmlCommentRule 
;

// DONE jinjaBlock
//! Jinja2 rules in HTML context
jinjaBlock //! visiChildren(ctx)
: JINJA2_COMMENT                                                   #Jinja2Comments
| jinjaExpression                                                  #Jinja2Expressions
| jinjaStatement                                                   #Jinja2Statements
;

// DOING jinjaExpression
// Jinja2 Expressions  
jinjaExpression
: JINJA2_OPEN_EXPR jinjaExprContent? JINJA2_CLOSE_EXPR             #Jinja2ExpressionsBody
;

// TODO jinjaExprContentNode
jinjaExprContent  //! + visit(ctx)
: jinjaExprExpression jinjaExprExpression*                         #Jinja2ExprContentRule
;

// TODO jinjaExprExpression a lot of nodes
jinjaExprExpression
: jinjaExprAtomExpression                                                                                            #Jinja2AtomExpression
| jinjaExprExpression (JINJA2_STAR | JINJA2_DIV | JINJA2_MOD) jinjaExprExpression                                    #Jinja2MulDivModExpression
| jinjaExprExpression (JINJA2_PLUS | JINJA2_MINUS) jinjaExprExpression                                               #Jinja2AddSubExpression
| jinjaExprExpression (JINJA2_EQ | JINJA2_NEQ | JINJA2_LT | JINJA2_LTE | JINJA2_GT | JINJA2_GTE) jinjaExprExpression #Jinja2ComparisonExpression
| jinjaExprExpression JINJA2_IS jinjaExprExpression                                                                  #Jinja2IsExpression
| jinjaExprExpression JINJA2_ISNOT jinjaExprExpression                                                               #Jinja2IsNotExpression
| JINJA2_NOT jinjaExprExpression                                                                                     #Jinja2NotExpression
| jinjaExprExpression (JINJA2_AND | JINJA2_OR) jinjaExprExpression                                                   #Jinja2LogicalExpression
;

// TODO jinjaExprAtomExpression
jinjaExprAtomExpression  // ! + visit(ctx)
: jinjaExprAtom (jinjaExprTrailer)*                                #Jinja2AtomExpressionBody
;

// TODO jinjaExprTrailer
jinjaExprTrailer
: JINJA2_LPAREN (jinjaExprArgument (JINJA2_COMMA jinjaExprArgument)*
JINJA2_COMMA?)? JINJA2_RPAREN                                      #Jinja2CallTrailer
| JINJA2_LSB jinjaExprExpression JINJA2_RSB                        #Jinja2SubscriptTrailer
| JINJA2_DOT JINJA2_IDENTIFIER                                     #Jinja2AttributeTrailer
;

// TODO jinjaExprAtom
jinjaExprAtom
: JINJA2_LPAREN jinjaExprExpression? JINJA2_RPAREN                 #Jinja2ParenthesizedAtom
| JINJA2_LSB (jinjaExprExpression (JINJA2_COMMA jinjaExprExpression)*)? JINJA2_RSB #Jinja2ListAtom
| jinjaExprLiteral                                                 #Jinja2LiteralAtom
;

// TODO jinjaExprLiteral
jinjaExprLiteral //! VisitChildren(ctx) + ctx.INT().getText()
: JINJA2_INT                                                       #Jinja2IntLiteral
| JINJA2_DOUBLE                                                    #Jinja2DoubleLiteral
| JINJA2_STRING                                                    #Jinja2StringLiteral
| JINJA2_TRUE                                                      #Jinja2TrueLiteral
| JINJA2_FALSE                                                     #Jinja2FalseLiteral
| JINJA2_NULL                                                      #Jinja2NullLiteral
| JINJA2_IDENTIFIER                                                #Jinja2IdLiteral
;

// TODO jinjaExprArgument
jinjaExprArgument //! ctx.INT().getText()
: (JINJA2_IDENTIFIER JINJA2_EQUAL)? jinjaExprExpression            #Jinja2FunctionArg
;

// DONE jinjaStatement
// Jinja2 Statements
jinjaStatement
: jinjaForBlock                                                   #Jinja2ForBlock
| jinjaIfBlock                                                    #Jinja2IfBlock
;

// TODO jinjaForBlock
jinjaForBlock
: JINJA2_OPEN_STMT jinjaForStatement JINJA2_CLOSE_STMT templateContent
    (JINJA2_OPEN_STMT JINJA2_STMT_ELSE JINJA2_CLOSE_STMT templateContent)?
    JINJA2_OPEN_STMT JINJA2_STMT_ENDFOR JINJA2_CLOSE_STMT         #Jinja2ForBlockBody
;

// TODO jinjaForStatement
jinjaForStatement
: JINJA2_STMT_FOR JINJA2_STMT_IDENTIFIER (JINJA2_STMT_COMMA JINJA2_STMT_IDENTIFIER)* JINJA2_STMT_IN
jinjaStmtAtomExpression (JINJA2_STMT_IF jinjaStmtExpression)?   #Jinja2ForStatement
;

// TODO jinjaIfBlock
jinjaIfBlock
: JINJA2_OPEN_STMT JINJA2_STMT_IF jinjaStmtExpression JINJA2_CLOSE_STMT templateContent
(JINJA2_OPEN_STMT JINJA2_STMT_ELIF jinjaStmtExpression JINJA2_CLOSE_STMT templateContent)*
(JINJA2_OPEN_STMT JINJA2_STMT_ELSE JINJA2_CLOSE_STMT templateContent)?
JINJA2_OPEN_STMT JINJA2_STMT_ENDIF JINJA2_CLOSE_STMT          #Jinja2IfBlockBody
;

// TODO jinjaStmtExpression
jinjaStmtExpression //! VisitChildren(ctx)
: jinjaStmtExpression JINJA2_STMT_IS jinjaStmtExpression                                                                                           #Jinja2StmtIsExpression
| jinjaStmtExpression JINJA2_STMT_ISNOT jinjaStmtExpression                                                                                        #Jinja2StmtIsNotExpression
| jinjaStmtExpression (JINJA2_STMT_EQ | JINJA2_STMT_NEQ | JINJA2_STMT_LT | JINJA2_STMT_LTE | JINJA2_STMT_GT | JINJA2_STMT_GTE) jinjaStmtExpression #Jinja2StmtComparisonExpression
| jinjaStmtExpression (JINJA2_STMT_AND | JINJA2_STMT_OR) jinjaStmtExpression                                                                       #Jinja2StmtLogicalExpression
| JINJA2_STMT_NOT jinjaStmtExpression                                                                                                              #Jinja2StmtNotExpression
| jinjaStmtExpression (JINJA2_STMT_PLUS | JINJA2_STMT_MINUS) jinjaStmtExpression                                                                   #Jinja2StmtAddSubExpression
| jinjaStmtExpression (JINJA2_STMT_STAR | JINJA2_STMT_DIV | JINJA2_STMT_MOD) jinjaStmtExpression                                                   #Jinja2StmtMulDivModExpression
| jinjaStmtAtomExpression                                                                                                                          #Jinja2StmtAtomExpression
;

// TODO jinjaStmtAtomExpression
jinjaStmtAtomExpression
: jinjaStmtAtom (jinjaStmtTrailer)*                               #Jinja2StmtAtomExpressionBody
;

// TODO jinjaStmtTrailer
jinjaStmtTrailer //! VisitChildren(ctx)
: JINJA2_STMT_LPAREN (jinjaStmtArgument (JINJA2_STMT_COMMA jinjaStmtArgument)*
JINJA2_STMT_COMMA?)? JINJA2_STMT_RPAREN #Jinja2StmtCallTrailer
| JINJA2_STMT_LSB jinjaStmtExpression JINJA2_STMT_RSB             #Jinja2StmtSubscriptTrailer
| JINJA2_STMT_DOT JINJA2_STMT_IDENTIFIER                          #Jinja2StmtAttributeTrailer
;

// TODO jinjaStmtAtom
jinjaStmtAtom //! VisitChildren(ctx)
: JINJA2_STMT_LPAREN jinjaStmtExpression? JINJA2_STMT_RPAREN      #Jinja2StmtParenthesizedAtom
| JINJA2_STMT_LSB (jinjaStmtExpression
(JINJA2_STMT_COMMA jinjaStmtExpression)*)? JINJA2_STMT_RSB        #Jinja2StmtListAtom
| jinjaStmtLiteral                                                #Jinja2StmtLiteralAtom
;

// TODO jinjaStmtLiteral
jinjaStmtLiteral //! VisitChildren(ctx) + ctx.INT().getText()
: JINJA2_STMT_INT                                                 #Jinja2StmtIntLiteral
| JINJA2_STMT_DOUBLE                                              #Jinja2StmtDoubleLiteral
| JINJA2_STMT_STRING                                              #Jinja2StmtStringLiteral
| JINJA2_STMT_TRUE                                                #Jinja2StmtTrueLiteral
| JINJA2_STMT_FALSE                                               #Jinja2StmtFalseLiteral
| JINJA2_STMT_NULL                                                #Jinja2StmtNullLiteral
| JINJA2_STMT_IDENTIFIER                                          #Jinja2StmtIdLiteral
;

// TODO jinjaStmtArgument
jinjaStmtArgument
: (JINJA2_STMT_IDENTIFIER JINJA2_STMT_EQUAL)? jinjaStmtExpression #Jinja2StmtFunctionArg
;

// TODO templateContent : Check if need replace with htmlContent
templateContent //! VisitChildren(ctx) 
: (htmlCharData | htmlElement | htmlComment | jinjaBlock)*        #Jinja2TemplateContent
;

//! CSS rules
// TODO style
style
: STYLE_OPEN stylesheet STYLE_CLOSE                              #StyleBody
;

// TODO stylesheet
stylesheet
: ws (imports ws)* (nestedStatement ws)*                         #CssStylesheet
;

// TODO imports
imports
: Import ws (String_ | url) ws mediaQueryList SemiColon ws       #CssImportWithMediaQueryAndSemicolon
| Import ws (String_ | url) ws SemiColon ws                      #CssImportWithSemicolon
| Import ws (String_ | url) ws mediaQueryList                    #CssImportWithMediaQueryNoSemicolon
| Import ws (String_ | url) ws                                   #CssImportWithoutSemicolon
;

// TODO media
media // Media queries
: Media ws mediaQueryList groupRuleBody ws                       #CssMediaQueriesDefinition
;

// TODO mediaQueryList
mediaQueryList
: (mediaQuery (Comma ws mediaQuery)*)? ws                        #CssMediaQueriesList
;

// TODO mediaQuery
mediaQuery
: (MediaOnly | Not)? ws cssIdent ws (And ws mediaExpression)*    #CssMediaQueryTypeAndExpressions
| mediaExpression (And ws mediaExpression)*                      #CssMediaQueryExpressions
;

// TODO mediaExpression
mediaExpression
: OpenParen ws cssIdent ws (':' ws expr)? CloseParen ws          #CssMediaExpressions
;

// TODO selectorGroup
selectorGroup
: selector (Comma ws selector)*                                  #CssSelectorGroupBody
;

// TODO selector
selector
: simpleSelectorSequence ws (combinator simpleSelectorSequence ws)* #CssSelectorGroup
;

// TODO combinator
combinator
: Plus ws                                                        #CssAdjacentSiblingCombinator
| Greater ws                                                     #CssChildCombinator
| Tilde ws                                                       #CssGeneralSiblingCombinator
| Space ws                                                       #CssDescendantCombinator
;

// TODO simpleSelectorSequence
simpleSelectorSequence
: (typeSelector | universal) (Hash | className | pseudo)*        #CssCompoundSelectorWithType
| ( Hash | className | pseudo)+                                  #CssCompoundSelectorWithoutType
;

// TODO typeSelector
typeSelector
: typeNamespacePrefix? cssIdent                                  #CssElementTypeSelector
;

// TODO typeNamespacePrefix
typeNamespacePrefix
: (cssIdent | Multiply)? '|'                                     #CssNamespacePrefix
;

// TODO universal
universal
: typeNamespacePrefix? Multiply                                  #CssUniversalSelector
;

// TODO className
className
: Dot cssIdent                                                   #CssClassSelector
;

// TODO pseudo
pseudo
: ':' ':'? (cssIdent | functionalPseudo)                         #CssPseudoClassOrElement
;

// TODO functionalPseudo
functionalPseudo
: Function_ ws expression CloseParen                             #CssFunctionalPseudo
;

// TODO expression
expression
: (( Plus | Minus | Dimension | Number | String_ | cssIdent) ws)+ #CssValueExpression
;

// TODO operator_
operator_
: Divide ws                                                      #CssDivideOperator
| Comma ws                                                       #CssCommaSeparator
| Space ws                                                       #CssSpaceSeparator
;

// TODO property_
property_
: cssIdent ws                                                    #CssIdProperty
| Variable ws                                                    #CssVarProperty
;

// TODO ruleset
ruleset
: selectorGroup '{' ws declarationList? '}' ws                   #CssRulesetDefinition
;

// TODO declarationList
declarationList
: (';' ws)* declaration ws (';' ws declaration?)*                #CssDeclarationList
;

// TODO declaration
declaration
: property_ ':' ws expr (Important ws)?                          #CssDeclaration
;

// TODO expr
expr
    : term (operator_? term)*                                        #CssExpressionSequence
    ;

// TODO term
term
: number ws                                                      #CssNumberTerm
| percentage ws                                                  #CssPercentageTerm
| dimension ws                                                   #CssDimensionTerm
| String_ ws                                                     #CssStringTerm
| cssIdent ws                                                    #CssIdTerm
| Var ws Variable ws CloseParen ws                               #CssVariableTerm
| url ws                                                         #CssUrlTerm
| Hash ws                                                        #CssHexColorTerm
| Calc ws calcSum CloseParen ws                                  #CssCalcTerm
| Function_ ws expr CloseParen ws                                #CssFunctionTerm
;

// TODO number
number
: (Plus | Minus)? Number                                         #CssNumberExpression
;

// TODO percentage
percentage
: (Plus | Minus)? Percentage                                     #CssPercentageExpression
;

// TODO dimension
dimension
: (Plus | Minus)? Dimension                                      #CssDimensionExpression
;

// TODO nestedStatement
nestedStatement
: ruleset                                                        #CssRuleset
| media                                                          #CssMediaQueries
;

// TODO groupRuleBody
groupRuleBody
: '{' ws nestedStatement* '}' ws                                 #CssGroupRulebody
;

// TODO url
url
: Url_ ws String_ ws CloseParen                                  #CssQuotedUrl
| Url                                                            #CssUnquotedUrl
;

// TODO calcSum
calcSum
: calcProduct (Space ws (Plus | Minus) ws Space ws calcProduct)* #CssCalcSumExpression
;

// TODO calcProduct
calcProduct
: calcValue (Multiply ws calcValue | Divide ws number ws)*       #CssCalcProductExpression
;

// TODO calcValue
calcValue
: number ws                                                      #CssNumberValue
| dimension ws                                                   #CssDimensionValue
| percentage ws                                                  #CssPercentageValue
| OpenParen ws calcSum CloseParen ws                             #CssNestedCalcExpression
;

// TODO cssIdent
cssIdent
: Ident                                                          #CssIdentifier
| MediaOnly                                                      #CssMediaOnly
| Not                                                            #CssNot
| And                                                            #CssAnd
;

// TODO ws
ws
: (Comment | Space)*                                             #CssWhiteSpace
;