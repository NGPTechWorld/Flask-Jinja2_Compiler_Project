lexer grammar HtmlCssJinja2Lexer;

HTML_COMMENT: '<!--' .*? '-->';

DTD: '<!' .*? '>'; // Document Type Definitions

SEA_WS: (' ' | '\t' | '\r'? '\n')+; // Significant Enough Whitespace

STYLE_OPEN: '<style' .*? '>' -> pushMode(STYLE);

TAG_OPEN: '<' -> pushMode(TAG);

HTML_TEXT: ~'<'+;

// tag declarations
mode TAG;

TAG_CLOSE: '>' -> popMode;

TAG_SLASH_CLOSE: '/>' -> popMode;

TAG_SLASH: '/';

TAG_EQUALS: '=' -> pushMode(ATTVALUE);

TAG_NAME: TAG_NameStartChar TAG_NameChar*;

TAG_WHITESPACE: [ \t\r\n] -> channel(HIDDEN);

fragment HEXDIGIT: [a-fA-F0-9];

fragment DIGIT: [0-9];

fragment TAG_NameChar:
    TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
;

fragment TAG_NameStartChar: [a-zA-Z];

// <styles>
mode STYLE;

STYLE_BODY: .*? '</style>' -> popMode;

// attribute values
mode ATTVALUE;

ATTVALUE_VALUE: ' '* ATTRIBUTE -> popMode;

ATTRIBUTE: DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING | ATTCHARS | HEXCHARS | DECCHARS;

fragment ATTCHARS: ATTCHAR+ ' '?;

fragment ATTCHAR: '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';' | '#' | [0-9a-zA-Z];

fragment HEXCHARS: '#' [0-9a-fA-F]+;

fragment DECCHARS: [0-9]+ '%'?;

fragment DOUBLE_QUOTE_STRING: '"' ~[<"]* '"';

fragment SINGLE_QUOTE_STRING: '\'' ~[<']* '\'';