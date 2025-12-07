lexer grammar HtmlCssJinja2Lexer;

HTML_COMMENT: '<!--' .*? '-->';

DTD: '<!' .*? '>'; // Document Type Definitions

SEA_WS: (' ' | '\t' | '\r'? '\n')+; // Significant Enough Whitespace

STYLE_OPEN: '<style' .*? '>' -> pushMode(CSS);

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

// <styles>
mode CSS;

STYLE_CLOSE: '</style>' -> popMode;

OpenParen    : '(';
CloseParen   : ')';
OpenBrace    : '{';
CloseBrace   : '}';
SemiColon    : ';';
Colon        : ':';
Dot          : '.';
Multiply     : '*';
Divide       : '/';
Pipe         : '|';

fragment At: '@';

fragment Hex: [0-9a-fA-F];

fragment NewlineOrSpace: '\r\n' | [ \t\r\n\f] |;

fragment Unicode: '\\' Hex Hex? Hex? Hex? Hex? Hex? NewlineOrSpace;

fragment Escape: Unicode | '\\' ~[\r\n\f0-9a-fA-F];

fragment Nmstart: [_a-zA-Z] | Nonascii | Escape;

fragment Nmchar: [_a-zA-Z0-9\-] | Nonascii | Escape;

Comment: '/*' ~'*'* '*'+ ( ~[/*] ~'*'* '*'+)* '/';

fragment Name: Nmchar+;

Url: U R L '(' Whitespace ( [!#$%&*-~] | Nonascii | Escape)* Whitespace ')';

Space: [ \t\r\n\f]+;

fragment Whitespace: Space |;

fragment Newline: '\n' | '\r\n' | '\r' | '\f';

fragment ZeroToFourZeros: '0'? '0'? '0'? '0'?;

fragment A: 'a' | 'A' | '\\' ZeroToFourZeros ('41' | '61') NewlineOrSpace;
fragment C: 'c' | 'C' | '\\' ZeroToFourZeros ('43' | '63') NewlineOrSpace;
fragment D: 'd' | 'D' | '\\' ZeroToFourZeros ('44' | '64') NewlineOrSpace;
fragment E: 'e' | 'E' | '\\' ZeroToFourZeros ('45' | '65') NewlineOrSpace;
fragment G: 'g' | 'G' | '\\' ZeroToFourZeros ('47' | '67') NewlineOrSpace | '\\g' | '\\G';
fragment H: 'h' | 'H' | '\\' ZeroToFourZeros ('48' | '68') NewlineOrSpace | '\\h' | '\\H';
fragment I: 'i' | 'I' | '\\' ZeroToFourZeros ('49' | '69') NewlineOrSpace | '\\i' | '\\I';
fragment K: 'k' | 'K' | '\\' ZeroToFourZeros ('4b' | '6b') NewlineOrSpace | '\\k' | '\\K';
fragment L: 'l' | 'L' | '\\' ZeroToFourZeros ('4c' | '6c') NewlineOrSpace | '\\l' | '\\L';
fragment M: 'm' | 'M' | '\\' ZeroToFourZeros ('4d' | '6d') NewlineOrSpace | '\\m' | '\\M';
fragment N: 'n' | 'N' | '\\' ZeroToFourZeros ('4e' | '6e') NewlineOrSpace | '\\n' | '\\N';
fragment O: 'o' | 'O' | '\\' ZeroToFourZeros ('4f' | '6f') NewlineOrSpace | '\\o' | '\\O';
fragment P: 'p' | 'P' | '\\' ZeroToFourZeros ('50' | '70') NewlineOrSpace | '\\p' | '\\P';
fragment Q: 'q' | 'Q' | '\\' ZeroToFourZeros ('51' | '71') NewlineOrSpace | '\\q' | '\\Q';
fragment R: 'r' | 'R' | '\\' ZeroToFourZeros ('52' | '72') NewlineOrSpace | '\\r' | '\\R';
fragment S: 's' | 'S' | '\\' ZeroToFourZeros ('53' | '73') NewlineOrSpace | '\\s' | '\\S';
fragment T: 't' | 'T' | '\\' ZeroToFourZeros ('54' | '74') NewlineOrSpace | '\\t' | '\\T';
fragment U: 'u' | 'U' | '\\' ZeroToFourZeros ('55' | '75') NewlineOrSpace | '\\u' | '\\U';
fragment V: 'v' | 'V' | '\\' ZeroToFourZeros ('56' | '76') NewlineOrSpace | '\\v' | '\\V';
fragment W: 'w' | 'W' | '\\' ZeroToFourZeros ('57' | '77') NewlineOrSpace | '\\w' | '\\W';
fragment X: 'x' | 'X' | '\\' ZeroToFourZeros ('58' | '78') NewlineOrSpace | '\\x' | '\\X';
fragment Y: 'y' | 'Y' | '\\' ZeroToFourZeros ('59' | '79') NewlineOrSpace | '\\y' | '\\Y';
fragment Z: 'z' | 'Z' | '\\' ZeroToFourZeros ('5a' | '7a') NewlineOrSpace | '\\z' | '\\Z';

Hash: '#' Name;

Import: At I M P O R T;

Page: At P A G E;

Media: At M E D I A;

Important: '!' (Space | Comment)* I M P O R T A N T;

fragment FontRelative: Number E M | Number E X | Number C H | Number R E M;

fragment ViewportRelative: Number V W | Number V H | Number V M I N | Number V M A X;

fragment AbsLength
    : Number P X
    | Number C M
    | Number M M
    | Number I N
    | Number P T
    | Number P C
    | Number Q
;

fragment Angle: Number D E G | Number R A D | Number G R A D | Number T U R N;

fragment Time: Number M S | Number S;

fragment Freq: Number H Z | Number K H Z;

Percentage: Number '%';

Url_: 'url(';

MediaOnly: O N L Y;

Not: N O T;

And: A N D;

fragment Length: AbsLength | FontRelative | ViewportRelative;

Dimension: Length | Time | Freq | Angle;

fragment Nonascii: ~[\u0000-\u007f];

Plus: '+';

Minus: '-';

Greater: '>';

Comma: ',';

Tilde: '~';

Number: [0-9]+ | [0-9]* '.' [0-9]+;

String_:
    '"' (~[\n\r\f\\"] | '\\' Newline | Nonascii | Escape)* '"'
    | '\'' ( ~[\n\r\f\\'] | '\\' Newline | Nonascii | Escape)* '\''
;

Calc: 'calc(';

Variable: '--' Nmstart Nmchar*;

Var: 'var(';

Ident: '-'? Nmstart Nmchar*; // identifier

Function_: Ident '(';