parser grammar HtmlCssJinja2Parser;

options {
    tokenVocab = HtmlCssJinja2Lexer;
}

// HTML document structure
htmlDocument
    : SEA_WS* DTD? SEA_WS* (htmlElements | jinjaBlock)* EOF            #HtmlDocumentRule
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*                                  #HtmlElementsRule
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE
    )                                                                  #HtmlOpeningClosingTag
    | style                                                            #StyleElement
    ;

htmlContent
    : (htmlCharData | htmlElement | htmlComment | jinjaBlock)*         #HtmlContentRule
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?                            #HtmlAttributeRule
    ;

htmlCharData
    : HTML_TEXT                                                        #HtmlTextData
    | SEA_WS                                                           #HtmlWhitespaceData
    ;

htmlMisc // HTML Miscellaneous
    : htmlComment                                                      #HtmlMiscComment
    | SEA_WS                                                           #HtmlMiscWhitespace
    ;

htmlComment
    : HTML_COMMENT                                                     #HtmlCommentRule
    ;

// Jinja2 rules in HTML context
jinjaBlock
    : JINJA2_COMMENT                                                   #Jinja2Comments
    | jinjaExpression                                                  #Jinja2Expressions
    | jinjaStatement                                                   #Jinja2Statements
    ;

// Jinja2 Expressions
jinjaExpression
    : JINJA2_OPEN_EXPR jinjaExprContent? JINJA2_CLOSE_EXPR             #Jinja2ExpressionsBody
    ;

jinjaExprContent
    : jinjaExprExpression jinjaExprExpression*                         #Jinja2ExprContentRule
    ;

jinjaExprExpression
    : jinjaExprExpression JINJA2_IS jinjaExprExpression                #Jinja2IsExpression
    | jinjaExprExpression JINJA2_ISNOT jinjaExprExpression             #Jinja2IsNotExpression
    | jinjaExprExpression (JINJA2_EQ | JINJA2_NEQ | JINJA2_LT
        | JINJA2_LTE | JINJA2_GT | JINJA2_GTE) jinjaExprExpression     #Jinja2ComparisonExpression
    | jinjaExprExpression (JINJA2_AND | JINJA2_OR) jinjaExprExpression #Jinja2LogicalExpression
    | JINJA2_NOT jinjaExprExpression                                   #Jinja2NotExpression
    | jinjaExprExpression (JINJA2_PLUS | JINJA2_MINUS) jinjaExprExpression #Jinja2AddSubExpression
    | jinjaExprExpression (JINJA2_STAR | JINJA2_DIV | JINJA2_MOD) jinjaExprExpression #Jinja2MulDivModExpression
    | jinjaExprAtomExpression                                          #Jinja2AtomExpression
    ;

jinjaExprAtomExpression
    : jinjaExprAtom (jinjaExprTrailer)*                                #Jinja2AtomExpressionBody
    ;

jinjaExprTrailer
    : JINJA2_LPAREN (jinjaExprArgument (JINJA2_COMMA jinjaExprArgument)*
                                        JINJA2_COMMA?)? JINJA2_RPAREN  #Jinja2CallTrailer
    | JINJA2_LSB jinjaExprExpression JINJA2_RSB                        #Jinja2SubscriptTrailer
    | JINJA2_DOT JINJA2_IDENTIFIER                                     #Jinja2AttributeTrailer
    ;

jinjaExprAtom
    : JINJA2_LPAREN jinjaExprExpression? JINJA2_RPAREN                 #Jinja2ParenthesizedAtom
    | JINJA2_LSB (jinjaExprExpression (JINJA2_COMMA jinjaExprExpression)*)? JINJA2_RSB #Jinja2ListAtom
    | jinjaExprLiteral                                                 #Jinja2LiteralAtom
    ;

jinjaExprLiteral
    : JINJA2_INT                                                       #Jinja2IntLiteral
    | JINJA2_DOUBLE                                                    #Jinja2DoubleLiteral
    | JINJA2_STRING                                                    #Jinja2StringLiteral
    | JINJA2_TRUE                                                      #Jinja2TrueLiteral
    | JINJA2_FALSE                                                     #Jinja2FalseLiteral
    | JINJA2_NULL                                                      #Jinja2NullLiteral
    | JINJA2_IDENTIFIER                                                #Jinja2IdLiteral
    ;

jinjaExprArgument
    : (JINJA2_IDENTIFIER JINJA2_EQUAL)? jinjaExprExpression            #Jinja2FunctionArg
    ;

// Jinja2 Statements
jinjaStatement
    : jinjaForBlock                                                   #Jinja2ForBlock
    | jinjaIfBlock                                                    #Jinja2IfBlock
    ;

jinjaForBlock
    : JINJA2_OPEN_STMT jinjaForStatement JINJA2_CLOSE_STMT templateContent
        (JINJA2_OPEN_STMT JINJA2_STMT_ELSE JINJA2_CLOSE_STMT templateContent)?
        JINJA2_OPEN_STMT JINJA2_STMT_ENDFOR JINJA2_CLOSE_STMT         #Jinja2ForBlockBody
    ;

jinjaForStatement
    : JINJA2_STMT_FOR JINJA2_STMT_IDENTIFIER (JINJA2_STMT_COMMA JINJA2_STMT_IDENTIFIER)* JINJA2_STMT_IN
      jinjaStmtAtomExpression (JINJA2_STMT_IF jinjaStmtExpression)?   #Jinja2ForStatement
    ;

jinjaIfBlock
    : JINJA2_OPEN_STMT JINJA2_STMT_IF jinjaStmtExpression JINJA2_CLOSE_STMT templateContent
        (JINJA2_OPEN_STMT JINJA2_STMT_ELIF jinjaStmtExpression JINJA2_CLOSE_STMT templateContent)*
        (JINJA2_OPEN_STMT JINJA2_STMT_ELSE JINJA2_CLOSE_STMT templateContent)?
        JINJA2_OPEN_STMT JINJA2_STMT_ENDIF JINJA2_CLOSE_STMT          #Jinja2IfBlockBody
    ;

jinjaStmtExpression
    : jinjaStmtExpression JINJA2_STMT_IS jinjaStmtExpression          #Jinja2StmtIsExpression
    | jinjaStmtExpression JINJA2_STMT_ISNOT jinjaStmtExpression       #Jinja2StmtIsNotExpression
    | jinjaStmtExpression (JINJA2_STMT_EQ | JINJA2_STMT_NEQ | JINJA2_STMT_LT |
    JINJA2_STMT_LTE | JINJA2_STMT_GT | JINJA2_STMT_GTE) jinjaStmtExpression #Jinja2StmtComparisonExpression
    | jinjaStmtExpression (JINJA2_STMT_AND | JINJA2_STMT_OR) jinjaStmtExpression #Jinja2StmtLogicalExpression
    | JINJA2_STMT_NOT jinjaStmtExpression                             #Jinja2StmtNotExpression
    | jinjaStmtExpression (JINJA2_STMT_PLUS | JINJA2_STMT_MINUS) jinjaStmtExpression #Jinja2StmtAddSubExpression
    | jinjaStmtExpression (JINJA2_STMT_STAR | JINJA2_STMT_DIV | JINJA2_STMT_MOD) jinjaStmtExpression #Jinja2StmtMulDivModExpression
    | jinjaStmtAtomExpression                                         #Jinja2StmtAtomExpression
    ;

jinjaStmtAtomExpression
    : jinjaStmtAtom (jinjaStmtTrailer)*                               #Jinja2StmtAtomExpressionBody
    ;

jinjaStmtTrailer
    : JINJA2_STMT_LPAREN (jinjaStmtArgument (JINJA2_STMT_COMMA jinjaStmtArgument)*
                              JINJA2_STMT_COMMA?)? JINJA2_STMT_RPAREN #Jinja2StmtCallTrailer
    | JINJA2_STMT_LSB jinjaStmtExpression JINJA2_STMT_RSB             #Jinja2StmtSubscriptTrailer
    | JINJA2_STMT_DOT JINJA2_STMT_IDENTIFIER                          #Jinja2StmtAttributeTrailer
    ;

jinjaStmtAtom
    : JINJA2_STMT_LPAREN jinjaStmtExpression? JINJA2_STMT_RPAREN      #Jinja2StmtParenthesizedAtom
    | JINJA2_STMT_LSB (jinjaStmtExpression
           (JINJA2_STMT_COMMA jinjaStmtExpression)*)? JINJA2_STMT_RSB #Jinja2StmtListAtom
    | jinjaStmtLiteral                                                #Jinja2StmtLiteralAtom
    ;

jinjaStmtLiteral
    : JINJA2_STMT_INT                                                 #Jinja2StmtIntLiteral
    | JINJA2_STMT_DOUBLE                                              #Jinja2StmtDoubleLiteral
    | JINJA2_STMT_STRING                                              #Jinja2StmtStringLiteral
    | JINJA2_STMT_TRUE                                                #Jinja2StmtTrueLiteral
    | JINJA2_STMT_FALSE                                               #Jinja2StmtFalseLiteral
    | JINJA2_STMT_NULL                                                #Jinja2StmtNullLiteral
    | JINJA2_STMT_IDENTIFIER                                          #Jinja2StmtIdLiteral
    ;

jinjaStmtArgument
    : (JINJA2_STMT_IDENTIFIER JINJA2_STMT_EQUAL)? jinjaStmtExpression #Jinja2StmtFunctionArg
    ;

templateContent
    : (htmlCharData | htmlElement | htmlComment | jinjaBlock)*        #Jinja2TemplateContent
    ;

// CSS rules
style
    : STYLE_OPEN stylesheet STYLE_CLOSE                              #StyleBody
    ;

stylesheet
    : ws (imports ws)* (nestedStatement ws)*                         #CssStylesheet
    ;

imports
    : Import ws (String_ | url) ws mediaQueryList SemiColon ws       #CssImportWithMediaQueryAndSemicolon
    | Import ws (String_ | url) ws SemiColon ws                      #CssImportWithSemicolon
    | Import ws (String_ | url) ws mediaQueryList                    #CssImportWithMediaQueryNoSemicolon
    | Import ws (String_ | url) ws                                   #CssImportWithoutSemicolon
    ;

media // Media queries
    : Media ws mediaQueryList groupRuleBody ws                       #CssMediaQueriesDefinition
    ;

mediaQueryList
    : (mediaQuery (Comma ws mediaQuery)*)? ws                        #CssMediaQueriesList
    ;

mediaQuery
    : (MediaOnly | Not)? ws cssIdent ws (And ws mediaExpression)*    #CssMediaQueryTypeAndExpressions
    | mediaExpression (And ws mediaExpression)*                      #CssMediaQueryExpressions
    ;

mediaExpression
    : OpenParen ws cssIdent ws (':' ws expr)? CloseParen ws          #CssMediaExpressions
    ;

selectorGroup
    : selector (Comma ws selector)*                                  #CssSelectorGroupBody
    ;

selector
    : simpleSelectorSequence ws (combinator simpleSelectorSequence ws)* #CssSelectorGroup
    ;

combinator
    : Plus ws                                                        #CssAdjacentSiblingCombinator
    | Greater ws                                                     #CssChildCombinator
    | Tilde ws                                                       #CssGeneralSiblingCombinator
    | Space ws                                                       #CssDescendantCombinator
    ;

simpleSelectorSequence
    : (typeSelector | universal) (Hash | className | pseudo)*        #CssCompoundSelectorWithType
    | ( Hash | className | pseudo)+                                  #CssCompoundSelectorWithoutType
    ;

typeSelector
    : typeNamespacePrefix? cssIdent                                  #CssElementTypeSelector
    ;

typeNamespacePrefix
    : (cssIdent | Multiply)? '|'                                     #CssNamespacePrefix
    ;

universal
    : typeNamespacePrefix? Multiply                                  #CssUniversalSelector
    ;

className
    : Dot cssIdent                                                   #CssClassSelector
    ;

pseudo
    : ':' ':'? (cssIdent | functionalPseudo)                         #CssPseudoClassOrElement
    ;

functionalPseudo
    : Function_ ws expression CloseParen                             #CssFunctionalPseudo
    ;

expression
    : (( Plus | Minus | Dimension | Number | String_ | cssIdent) ws)+ #CssValueExpression
    ;

operator_
    : Divide ws                                                      #CssDivideOperator
    | Comma ws                                                       #CssCommaSeparator
    | Space ws                                                       #CssSpaceSeparator
    ;

property_
    : cssIdent ws                                                    #CssIdProperty
    | Variable ws                                                    #CssVarProperty
    ;

ruleset
    : selectorGroup '{' ws declarationList? '}' ws                   #CssRulesetDefinition
    ;

declarationList
    : (';' ws)* declaration ws (';' ws declaration?)*                #CssDeclarationList
    ;

declaration
    : property_ ':' ws expr (Important ws)?                          #CssDeclaration
    ;

expr
    : term (operator_? term)*                                        #CssExpressionSequence
    ;

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

number
    : (Plus | Minus)? Number                                         #CssNumberExpression
    ;

percentage
    : (Plus | Minus)? Percentage                                     #CssPercentageExpression
    ;

dimension
    : (Plus | Minus)? Dimension                                      #CssDimensionExpression
    ;

nestedStatement
    : ruleset                                                        #CssRuleset
    | media                                                          #CssMediaQueries
    ;

groupRuleBody
    : '{' ws nestedStatement* '}' ws                                 #CssGroupRulebody
    ;

url
    : Url_ ws String_ ws CloseParen                                  #CssQuotedUrl
    | Url                                                            #CssUnquotedUrl
    ;

calcSum
    : calcProduct (Space ws (Plus | Minus) ws Space ws calcProduct)* #CssCalcSumExpression
    ;

calcProduct
    : calcValue (Multiply ws calcValue | Divide ws number ws)*       #CssCalcProductExpression
    ;

calcValue
    : number ws                                                      #CssNumberValue
    | dimension ws                                                   #CssDimensionValue
    | percentage ws                                                  #CssPercentageValue
    | OpenParen ws calcSum CloseParen ws                             #CssNestedCalcExpression
    ;

cssIdent
    : Ident                                                          #CssIdentifier
    | MediaOnly                                                      #CssMediaOnly
    | Not                                                            #CssNot
    | And                                                            #CssAnd
    ;

ws
    : (Comment | Space)*                                             #CssWhiteSpace
    ;