lexer grammar PythonLexer;

//============================================================
// Python Lexer with INDENT/DEDENT, Variables, JSON, and If
//============================================================

//-------------------------------
// Java members for INDENT/DEDENT handling
//-------------------------------
@header {
import antlr.python_flask.IndentationHelper;
}
@members {
    IndentationHelper helper = new IndentationHelper();

    @Override
    public Token nextToken() {
        if (!helper.getPendingTokens().isEmpty())
            return helper.getPendingTokens().poll();

        Token next = super.nextToken();

        if (next.getType() == EOF)
            return helper.handleEOF((CommonToken) next, this);

        return next;
    }
}


//============================================================
// INDENT / DEDENT Rules
//============================================================

NEWLINE
         : ('\r'? '\n')  { helper.handleNewline(this); }
         ;

INDENT  : ;
DEDENT  : ;

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
// WS : [ \t]+ -> skip;
//WS
//    : [ \t]+ -> channel(HIDDEN)
//    ;

//============================================================
// Comments (Python)
//============================================================
COMMENT : '#' ~[\r\n]* -> skip;

//DOCSTRING
//    : '"""' ( . )*? '"""' -> skip
//    | "'''" ( . )*? "'''" -> skip
//    ;