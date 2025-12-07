lexer grammar PythonLexer;

//============================================================
// Python Lexer with INDENT/DEDENT, Variables, JSON, and If
//============================================================

//-------------------------------
// Java members for INDENT/DEDENT handling
//-------------------------------
@header {
package antlr.python_flask.generated;

import antlr.python_flask.DenterHelper;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonToken;
}
@members {
    private final DenterHelper denter = new DenterHelper(
        NEWLINE,
        PythonParser.INDENT,
        PythonParser.DEDENT
    ) {
        @Override
        protected Token pullToken() {
            return PythonLexer.super.nextToken();
        }
    };

    @Override
    public Token nextToken() {
        return denter.nextToken();
    }
}


//============================================================
// INDENT / DEDENT Rules
//============================================================

NEWLINE
    :   ('\r'? '\n') [ \t]*
    ;

INDENT  : ;
DEDENT  : ;
WS      : [ \t]+ -> skip;

//============================================================
// Literals
//============================================================
INT          : '0' | [1-9][0-9]* ;
DOUBLE       : '-'? INT '.' [0-9]+ EXP? ;
STRING       : '"' (~["\\] | ESC)* '"' | '\'' (~['\\] | ESC)* '\'';
TRUE         : 'True';
FALSE        : 'False';
NULL         : 'None';

// NEW: F-String support (simplified)
FSTRING      : 'f"' (~["\\] | ESC)* '"';

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
DEF          : 'def';
RETURN       : 'return';
IMPORT       : 'import';
FROM         : 'from';
AS           : 'as';
GLOBAL       : 'global';
IS           : 'is';
AND          : 'and';
OR           : 'or';
NOT          : 'not';
PASS         : 'pass';
CLASS        : 'class';

//============================================================
// Fragments for escape sequences and exponents
//============================================================
fragment ESC : '\\' [bfnrt"\\];
fragment EXP : [Ee] [+\-]?[0-9]+ ;

//============================================================
// Brackets, comma, colon, dot
//============================================================
LKB          : '{';
RKB          : '}';
LSB          : '[';
RSB          : ']';
LPAREN       : '(';
RPAREN       : ')';
COLON        : ':';
COMMA        : ',';
ARROW        : '->';
POWER        : '**';
AT           : '@';
DOT          : '.';

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
MOD          : '%' ;
PLUS_EQUAL   : '+=' ;
MINUS_EQUAL  : '-=' ;
STAR_EQUAL   : '*=' ;
DIV_EQUAL    : '/=' ;
MOD_EQUAL    : '%=';

EQ      : '==';
NEQ     : '!=';
LT      : '<';
LTE     : '<=';
GT      : '>';
GTE     : '>=';
ISNOT   : 'is not';

//============================================================
// Comments (Python)
//============================================================
COMMENT : '#' ~[\r\n]* -> skip;

//DOCSTRING
//    : '"""' ( . )*? '"""' -> skip
//    | "'''" ( . )*? "'''" -> skip
//    ;