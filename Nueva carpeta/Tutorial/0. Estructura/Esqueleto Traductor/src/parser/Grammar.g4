grammar Grammar
	;

import Lexicon
	;

start
	: sentence*
	;

var
    : 'var' defvar
    | defvar
    | struct
    ;

defvar
    : IDENT ':' tipo ';'
    ;

struct
    : 'struct' IDENT '{' defvar* '}' ';'
    ;

tipo
	: 'float'
	| 'int'
	| 'char'
	| IDENT
	| '[' INT_CONSTANT ']' tipo
	;

value
    : INT_CONSTANT+
    | REAL_CONSTANT
    | CHAR_CONSTANT
    ;

parameter
    : IDENT ':' tipo
    | IDENT ':' tipo ',' parameter
    ;

sentence
	: var
	| ('print' | 'printsp' | 'println') expr ';'
	| 'read' expr ';'
	| sentence '=' sentence ';'
	| 'cast' '<' tipo '>' '(' expr ')'
	| 'if' '(' expr ')' '{' sentence* '}' 'else' '{' sentence* '}'
	| 'if' '(' expr ')' '{' sentence* '}'
    | 'while' '(' expr ')' '{' sentence* '}'
    | 'main' '(' ')' '{' sentence*'}'
    | IDENT '(' parameter* ')' (':' tipo) ? '{' sentence* '}'
    | 'return' expr? ';'
    | IDENT '(' sentence (',' sentence)* ')' ';'?
    | IDENT ('[' expr ']')+
    | expr
	;

expr
	: '(' expr ')'
	| expr ('*' | '/') expr
	| expr ('+' | '-') expr
	| expr ('>' | '>=' | '<' | '<=' | '==' | '!=') expr
	| expr ('&&' | '||') expr
	| '!' expr
	| expr '.' IDENT
	| expr '[' expr ']'
	| IDENT
	| value
	;