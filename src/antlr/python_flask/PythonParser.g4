parser grammar PythonParser;

options {
tokenVocab = PythonLexer;
}

//------------------------------------------------------------
// Entry Point
//------------------------------------------------------------
program
: statement* EOF
;

//------------------------------------------------------------
// Statements
//------------------------------------------------------------
statement
: simpleStatement
| compoundStatement
;

simpleStatement
: assignmentStatement
| importStatement
| globalStatement
| passStatement
| returnStatement
| expressionList? NEWLINE
;

compoundStatement
: ifStatement
| forStatement
| funcdef
| classDef
;

returnStatement
    : RETURN (expressionList)? NEWLINE
    ;

importStatement
: IMPORT importItem (COMMA importItem)* NEWLINE
| FROM importModule IMPORT importItem (COMMA importItem)* NEWLINE
;

importItem
: IDENTIFIER (AS IDENTIFIER)?
;

importModule
: IDENTIFIER (DOT IDENTIFIER)*
;

globalStatement
: GLOBAL IDENTIFIER (COMMA IDENTIFIER)* NEWLINE
;

passStatement
: PASS NEWLINE
;

// MODIFIED: Class Definition (basic)
classDef
: CLASS IDENTIFIER (LPAREN arglist? RPAREN)? COLON NEWLINE body
;

body
//: INDENT simpleStatement DEDENT
: INDENT statement+ DEDENT
;

//------------------------------------------------------------
// Function Definition
//------------------------------------------------------------
funcdef
: decorators? DEF IDENTIFIER LPAREN parameters? RPAREN (ARROW expression)? COLON body
;

// MODIFIED: Decorators
decorators
: decorator+
;

decorator
: AT dottedName (LPAREN arglist? RPAREN)? NEWLINE
;

dottedName
: IDENTIFIER (DOT IDENTIFIER)*
;

// Parameter list
parameters
: param (COMMA param)* (COMMA)?
;

// Single parameter (positional / default / *args / **kwargs)
param
: IDENTIFIER (EQUAL expression)?
| STAR IDENTIFIER
| POWER IDENTIFIER
;

//------------------------------------------------------------
// For Loop
//------------------------------------------------------------
forStatement
: FOR targetList IN expressionList COLON body
;

//------------------------------------------------------------
// If / Elif / Else Statements
//------------------------------------------------------------
ifStatement
: IF expression COLON body (ELIF expression COLON body)* (ELSE COLON body)?
;

//------------------------------------------------------------
// Assignment Statements
//------------------------------------------------------------
assignmentStatement
: targetList (augmentedAssignment | EQUAL) expressionList NEWLINE
;

// Targets
targetList
: target (COMMA target)*
;

target
: IDENTIFIER
| target LSB expression RSB // e.g., my_list[0] = 5
| target DOT IDENTIFIER // e.g., my_obj.attr = 5
;

// Expression lists
expressionList
: expression (COMMA expression)*
;

// Augmented assignments
augmentedAssignment
: PLUS_EQUAL
| MINUS_EQUAL
| STAR_EQUAL
| DIV_EQUAL
| MOD_EQUAL
;

//============================================================
// EXPRESSIONS (Major Refactor)
//================================================------------
// This is the top-level expression rule
expression
: expression IS expression # IsExpression
| expression ISNOT expression # IsNotExpression
| expression (EQ | NEQ | LT | LTE | GT | GTE) expression # ComparisonExpression
| expression (AND | OR) expression # LogicalExpression
| NOT expression # NotExpression
| expression (PLUS | MINUS) expression # AddSubExpression
| expression (STAR | DIV | MOD) expression # MulDivModExpression
| POWER expression # PowerExpression
| atomExpression # AtomExpressionAt
;

// This handles calls, subscripts, and attribute access
atomExpression
: atom (trailer)*  // example: request.form.get('name')
;

trailer
: LPAREN arglist? RPAREN # CallTrailer   // example: ('name')
| LSB expression RSB # SubscriptTrailer // example: [i] or ['name']
| DOT IDENTIFIER # AttributeTrailer     // example: .get or .form
;

// Atomic values
atom
: LPAREN expressionList? RPAREN
| LKB keyValueList? RKB // Dictionary literal
| LSB expressionList? RSB // List literal
| literal
;

// List of key-value pairs for dictionaries
keyValueList
: keyValue (COMMA keyValue)* COMMA?
;

keyValue
: expression COLON expression
;

// Literals
literal
: INT
| DOUBLE
| STRING
| FSTRING
| TRUE
| FALSE
| NULL
| IDENTIFIER
;

// Argument list for function calls
arglist
: argument (COMMA argument)* COMMA?
;

argument
: (IDENTIFIER EQUAL)? expression
| POWER expression
;