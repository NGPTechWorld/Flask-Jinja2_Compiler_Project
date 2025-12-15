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
// Done! 😎
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
| funcdef
| classDef
;
// Done! 😎
returnStatement
: RETURN (expressionList)? NEWLINE
;
// Done! 😎
breakStatement
:  BREAK NEWLINE
;
// Done! 😎
continueStatement
: CONTINUE NEWLINE
;
// Done! 😎
importStatement
: IMPORT importItem (COMMA importItem)* NEWLINE
| FROM importModule IMPORT importItem (COMMA importItem)* NEWLINE
;
// Done! 😎
importItem
: IDENTIFIER (AS IDENTIFIER)?
;
// Done! 😎
importModule
: IDENTIFIER (DOT IDENTIFIER)*
;
// Done! 😎
globalStatement
: GLOBAL IDENTIFIER (COMMA IDENTIFIER)* NEWLINE
;
// Done! 😎
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
: IDENTIFIER (EQUAL expression)?
| STAR IDENTIFIER
| POWER IDENTIFIER
;

//------------------------------------------------------------
// For Loop
//------------------------------------------------------------
forStatement
: FOR targetList IN atomExpression COLON body
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
// Done! 😎
assignmentStatement
: targetList (augmentedAssignment | EQUAL) expressionList NEWLINE
;
// Done! 😎
// Targets
targetList
: target (COMMA target)*
;
// Done! 😎
target
: IDENTIFIER                 #VarTarget
| target LSB expression RSB  #SubscriptTarget    // e.g., my_list[0] = 5
| target DOT IDENTIFIER      #AttributeTarget       // e.g., my_obj.attr = 5
;
// Done! 😎
// Expression lists
expressionList
: expression (COMMA expression)*
;
// Done! 😎
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
// Done! 😎
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
// Done! 😎
// This handles calls, subscripts, and attribute access
atomExpression
: atom 
| IDENTIFIER (trailer)*  // example: request.form.get('name')
;
// Done! 😎
trailer
: LPAREN arglist? RPAREN # CallTrailer   // example: ('name')
| LSB expression RSB # SubscriptTrailer // example: [i] or ['name']
| DOT IDENTIFIER # AttributeTrailer     // example: .get or .form
;
// Done! 😎
// Atomic values
atom
: LPAREN expressionList? RPAREN      #ParenAtom
| LKB keyValueList? RKB              #DictAtom
| LSB expressionList? RSB            #ListAtom
| literal                            #LiteralAtom
;

// Done! 😎
// List of key-value pairs for dictionaries
keyValueList
: keyValue (COMMA keyValue)* COMMA?
;
// Done! 😎
keyValue
: expression COLON expression
;
// Done! 😎
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
// Done! 😎
// Argument list for function calls
arglist
: argument (COMMA argument)* COMMA?
;
// Done! 😎
argument
: (IDENTIFIER EQUAL)? expression
| POWER expression   
;