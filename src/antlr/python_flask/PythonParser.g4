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
: statement*
;


//------------------------------------------------------------
// Statements
//------------------------------------------------------------
statement
: assignmentStatement // variable assignment
| ifStatement
| forStatement
| NEWLINE // empty or blank line
;

//------------------------------------------------------------
// For Loop
//------------------------------------------------------------
forStatement
: FOR targetList IN iterable COLON  block (else_block)?
;

iterable
: array
| callExpression
;

callExpression
: RANGE LPAREN (expression (COMMA expression)*)?RPAREN
;

else_block
: ELSE COLON  block
;

//------------------------------------------------------------
// If / Elif / Else Statements
//------------------------------------------------------------
ifStatement
: IF condition COLON  block (elifStatement)* (elseStatement)?
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
: targetList EQUAL expressionList // normal assignment: a,b = 1,2
| targetList augmentedAssignment expression // augmented: x += 5
//| json // json decleration
;

//// Json definition
//json: object
//    | array
//    ;

//------------------------------------------------------------
// Json Support
//------------------------------------------------------------
// Objecvt definition
object : LKB (keyValue (COMMA keyValue)*)? RKB
       ;

//key value definition
keyValue : STRING COLON value;

// Array definition
array : LSB (value (COMMA value)*)? RSB
      ;

// Value definition
value: DOUBLE                            #Double
     | INT                               #Integer
     | STRING                            #String
     | object                            #ObjectValue
     | array                             #ArrayValue
     | TRUE                              #Bool
     | FALSE                             #Bool
     | NULL                              #Null
     ;

//------------------------------------------------------------
// Targets (Left-hand side of assignment)
//------------------------------------------------------------
targetList
: target (COMMA target)*
;


target
: IDENTIFIER
;


//------------------------------------------------------------
// Expressions (Right-hand side of assignment)
//------------------------------------------------------------
expressionList
: expression (COMMA expression)*
;


expression
: atom // single value
| expression STAR expression // multiplication
| expression DIV expression // division
| expression PLUS expression // addition
| expression MINUS expression // subtraction
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
// Augmented assignments (+=, -=, ...)
//------------------------------------------------------------
augmentedAssignment
: PLUS_EQUAL
| MINUS_EQUAL
| STAR_EQUAL
| DIV_EQUAL
;