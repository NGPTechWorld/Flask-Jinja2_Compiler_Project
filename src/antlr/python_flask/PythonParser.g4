parser grammar PythonParser;

options {
    tokenVocab = PythonLexer;
}

//------------------------------------------------------------
// Entry Point
//------------------------------------------------------------
program
    : statement*
    ;

//------------------------------------------------------------
// Statements
//------------------------------------------------------------
statement
    | ifStatement
    | forStatement
    ;

//------------------------------------------------------------
// For Loop
//------------------------------------------------------------
forStatement
    ;

iterable
    | callExpression
    ;

callExpression
    : RANGE LPAREN (expression (COMMA expression)*)? RPAREN
    ;

else_block
    ;

//------------------------------------------------------------
// If / Elif / Else Statements
//------------------------------------------------------------
ifStatement
    ;

elifStatement
    : ELIF condition COLON block
    ;

elseStatement
    : ELSE COLON block
    ;

//------------------------------------------------------------
// Condition: single expression with optional comparison
//------------------------------------------------------------
condition
    : expression (compOperator expression)?
    ;

compOperator
    : EQ
    | NEQ
    | LT
    | LTE
    | GT
    | GTE
    ;

//------------------------------------------------------------
// Block of statements (Python style)
//------------------------------------------------------------
block
    : INDENT statement+ DEDENT
    ;

//------------------------------------------------------------
// Assignment Statements
//------------------------------------------------------------
assignmentStatement
    ;

//------------------------------------------------------------
//------------------------------------------------------------
    ;


    ;

    ;

//------------------------------------------------------------
//------------------------------------------------------------
targetList
    : target (COMMA target)*
    ;

target
    : IDENTIFIER
    ;

//------------------------------------------------------------
//------------------------------------------------------------
expressionList
    : expression (COMMA expression)*
    ;

expression
    ;

//------------------------------------------------------------
// Atomic values
//------------------------------------------------------------
atom
    : INT
    | STRING
    | IDENTIFIER
    | object
    | array
    ;

//------------------------------------------------------------
//------------------------------------------------------------
augmentedAssignment
    : PLUS_EQUAL
    | MINUS_EQUAL
    | STAR_EQUAL
    | DIV_EQUAL
    ;