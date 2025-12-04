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
    : assignmentStatement
    | ifStatement
    | forStatement
    | funcdef
    | NEWLINE
    ;

//------------------------------------------------------------
// Function Definition
//------------------------------------------------------------
funcdef
    :  DEF IDENTIFIER LPAREN parameters? RPAREN (ARROW test)? COLON NEWLINE func_body
    ;

//// Decorators (optional)
//decorators
//    : decorator+
//    ;
//
//decorator
//    : AT IDENTIFIER (LPAREN (expression (COMMA expression)*)? RPAREN)? NEWLINE
//    ;

// Parameter list
parameters
    : param (COMMA param)* (COMMA)?  // allow trailing comma
    ;

// Single parameter (positional / default / *args / **kwargs)
param
    : IDENTIFIER (EQUAL test)?    // a or a=default
    | STAR IDENTIFIER             // *args
    | POWER IDENTIFIER            // **kwargs
    ;

// Function body
func_body
    : simpleStatement
    | INDENT (statement | returnStatement)+ DEDENT
    ;

// Simple single-line statement
simpleStatement
    : statement
    ;

// Return statement
returnStatement
    : RETURN (expressionList)? NEWLINE
    ;
// Test expression (used for defaults and return type)
test
    : expression
    ;

//------------------------------------------------------------
// For Loop
//------------------------------------------------------------
forStatement
    : FOR targetList IN iterable COLON NEWLINE body (else_block)?
    | expression FOR targetList IN iterable
    ;

iterable
    : expression
    | callExpression
    ;

callExpression
    : RANGE LPAREN (expression (COMMA expression)*)? RPAREN
    ;

else_block
    : ELSE COLON NEWLINE body
    ;

body
    : INDENT statement+ DEDENT
    ;

//------------------------------------------------------------
// If / Elif / Else Statements
//------------------------------------------------------------
ifStatement
    : IF condition COLON block (elifStatement)* (elseStatement)?
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
    : targetList EQUAL expressionList
    | targetList augmentedAssignment expression
    ;

//------------------------------------------------------------
// JSON Support
//------------------------------------------------------------
object
    : LKB (keyValue (COMMA keyValue)*)? RKB
    ;

keyValue
    : STRING COLON value
    ;

array
    : LSB (value (COMMA value)*)? RSB
    ;

value
    : DOUBLE
    | INT
    | STRING
    | object
    | array
    | TRUE
    | FALSE
    | NULL
    | IDENTIFIER
    ;

//------------------------------------------------------------
// Targets
//------------------------------------------------------------
targetList
    : target (COMMA target)*
    ;

target
    : IDENTIFIER
    ;

//------------------------------------------------------------
// Expressions
//------------------------------------------------------------
expressionList
    : expression (COMMA expression)*
    ;

expression
    : atom
    | expression STAR expression
    | expression DIV expression
    | expression PLUS expression
    | expression MINUS expression
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
// Augmented assignments
//------------------------------------------------------------
augmentedAssignment
    : PLUS_EQUAL
    | MINUS_EQUAL
    | STAR_EQUAL
    | DIV_EQUAL
    ;
