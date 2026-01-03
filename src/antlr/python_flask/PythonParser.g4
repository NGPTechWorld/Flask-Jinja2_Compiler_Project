parser grammar PythonParser;
@header {
package antlr.python_flask.generated;
}
// Import tokens from the lexer grammar
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
| breakStatement
| continueStatement
| expressionList? NEWLINE
;

compoundStatement
: ifStatement
| forStatement
| whileStatement
| funcdef
| classDef
;

returnStatement
: RETURN (expressionList)? NEWLINE
;

breakStatement
:  BREAK NEWLINE
;

continueStatement
: CONTINUE NEWLINE
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

// Class Definition (basic)
classDef
: CLASS IDENTIFIER (LPAREN arglist? RPAREN)? COLON body
;

body
: INDENT statement+ DEDENT
;

//------------------------------------------------------------
// Function Definition
//------------------------------------------------------------

funcdef
: decorators? DEF IDENTIFIER LPAREN parameters? RPAREN (ARROW expression)? COLON body
;

// Decorators
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
: IDENTIFIER (EQUAL expression)?   #NormalParam
| STAR IDENTIFIER                  #VarArgParam
| POWER IDENTIFIER                #KwVarArgParam
;

//------------------------------------------------------------
// For Loop
//------------------------------------------------------------

forStatement
: FOR targetList IN expressionList COLON body
;

whileStatement
: WHILE expression COLON body
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
: IDENTIFIER                 #VarTarget
| target LSB expression RSB  #SubscriptTarget    // e.g., my_list[0] = 5
| target DOT IDENTIFIER      #AttributeTarget       // e.g., my_obj.attr = 5
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
//============================================================
// This is the top-level expression rule

expression
: atomExpression                           # AtomExpressionAt
| expression POWER expression              # PowerExpression
| expression (STAR | DIV | MOD) expression # MulDivModExpression
| expression (PLUS | MINUS) expression     # AddSubExpression
| expression (EQ | NEQ | LT | LTE | GT | GTE) expression# ComparisonExpression
| expression IS expression                 # IsExpression
| expression ISNOT expression              # IsNotExpression
| NOT expression                           # NotExpression
| expression AND expression                # AndExpression
| expression OR expression                 # OrExpression
;

// This handles calls, subscripts, and attribute access
atomExpression
: atom 
| IDENTIFIER (trailer)*  // example: request.form.get('name')
;

trailer
: LPAREN arglist? RPAREN # CallTrailer   // example: ('name')
| LSB expression RSB # SubscriptTrailer // example: [i] or ['name']
| DOT IDENTIFIER # AttributeTrailer     // example: .get or .form
;

// Atomic values
atom
: LPAREN expressionList? RPAREN      #ParenAtom
| LKB keyValueList? RKB              #DictAtom
| LSB expressionList? RSB            #ListAtom
| literal                            #LiteralAtom
;


// List of key-value pairs for dictionaries
keyValueList
:NEWLINE* keyValue (COMMA NEWLINE* keyValue)* COMMA? NEWLINE*
;

keyValue
: expression COLON expression
;

// Literals
literal
: INT              #IntLiteral
| DOUBLE           #DoubleLiteral
| STRING           #StringLiteral
| FSTRING          #FStringLiteral
| TRUE             #BooleanLiteral
| FALSE            #BooleanLiteral
| NULL             #NullLiteral
| IDENTIFIER       #IdentifierLiteral
;

// Argument list for function calls
arglist
: argument (COMMA argument)* COMMA?
;

argument
: (IDENTIFIER EQUAL)? expression
| POWER expression   
;