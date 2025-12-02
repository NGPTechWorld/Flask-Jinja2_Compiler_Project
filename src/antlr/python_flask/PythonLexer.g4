lexer grammar pythonLexer;

//============================================================
// Python Lexer with INDENT/DEDENT, Variables, JSON, and If
//============================================================

//-------------------------------
// Java members for INDENT/DEDENT handling
//-------------------------------
@lexer::members {
    java.util.Stack<Integer> indents = new java.util.Stack<>();
    boolean atStartOfLine = true;
    java.util.LinkedList<Token> pendingTokens = new java.util.LinkedList<>();

    /** Helper method to create a token */
    private Token commonToken(int type, String text) {
        int start = getCharIndex() - text.length();
        int stop = getCharIndex() - 1;
        return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
    }
}

//============================================================
// INDENT / DEDENT Rules
//============================================================

// Handles indentation at the start of a line
INDENT
    : {atStartOfLine}? [ ]+ {
        int spaces = getText().length();
        if (indents.isEmpty() || spaces > indents.peek()) {
            indents.push(spaces);
            pendingTokens.add(commonToken(INDENT, getText()));
        }
        atStartOfLine = false;
    }
    -> skip
;

// Handles dedentation at the start of a line
DEDENT
    : {atStartOfLine && !indents.isEmpty()}? {
        int previous = indents.pop();
        pendingTokens.add(commonToken(DEDENT, ""));
    }
    -> skip
;

//============================================================
// Literals
//============================================================
INT          : '0' | [1-9][0-9]* ;
DOUBLE       : '-'? INT '.' [0-9]+ EXP? ;
STRING       : '"' (~["\\] | ESC)* '"';
TRUE         : 'true';
FALSE        : 'false';
NULL         : 'null';

//============================================================
// Keywords
//============================================================
IF           : 'if';
ELIF         : 'elif';
ELSE         : 'else';
FOR          : 'for';
IN           : 'in';
RANGE        : 'range';
CONTINUE     : 'continue';
BREAK        : 'break';
//============================================================
// Fragments for escape sequences and exponents
//============================================================
fragment ESC : '\\' [bfnrt"\\];
fragment EXP : [Ee] [+\-]?[0-9]+ ;

//============================================================
// Brackets, comma, colon
//============================================================
LKB          : '{';
RKB          : '}';
LSB          : '[';
RSB          : ']';
LPAREN       : '(';
RPAREN       : ')';
COLON        : ':';
COMMA        : ',';

//============================================================
// Identifiers
//============================================================
IDENTIFIER   : [a-zA-Z_][a-zA-Z0-9_]* ;

//============================================================
// Operators & Delimiters
//============================================================
EQUAL        : '=' ;
PLUS         : '+' ;
MINUS        : '-' ;
STAR         : '*' ;
DIV          : '/' ;
PLUS_EQUAL   : '+=' ;
MINUS_EQUAL  : '-=' ;
STAR_EQUAL   : '*=' ;
DIV_EQUAL    : '/=' ;

EQ      : '==';
NEQ     : '!=';
LT      : '<';
LTE     : '<=';
GT      : '>';
GTE     : '>=';

//============================================================
// Whitespace & Newlines
//============================================================
NEWLINE      : ('\r'? '\n')+ ;
//WS           : [ \t\r\n]+ -> skip ;

//============================================================
// Comments (Python)
//============================================================
COMMENT : '#' ~[\r\n]* -> skip;

//DOCSTRING
//    : '"""' ( . )*? '"""' -> skip
//    | "'''" ( . )*? "'''" -> skip
//    ;