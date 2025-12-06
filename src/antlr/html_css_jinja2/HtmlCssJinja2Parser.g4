parser grammar HtmlCssJinja2Parser;

options {
    tokenVocab = HtmlCssJinja2Lexer;
}

htmlDocument
    : SEA_WS* DTD? SEA_WS* htmlElements*                            #HtmlDocumentRule
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*                               #HtmlElementsRule
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE
    )                                                               #HtmlOpeningClosingTag
    | style                                                         #StyleElement
    ;

htmlContent
    : htmlCharData? ((htmlElement | htmlComment) htmlCharData?)*    #HtmlContentRule
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?                         #HtmlAttributeRule
    ;

htmlCharData
    : HTML_TEXT                                                     #HtmlTextData
    | SEA_WS                                                        #HtmlWhitespaceData
    ;

htmlMisc // HTML Miscellaneous
    : htmlComment                                                   #HtmlMiscComment
    | SEA_WS                                                        #HtmlMiscWhitespace
    ;

htmlComment
    : HTML_COMMENT                                                  #HtmlCommentRule
    ;

style
    : STYLE_OPEN STYLE_BODY                                         #StyleBody
    ;