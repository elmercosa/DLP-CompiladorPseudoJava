grammar Grammar
	;

import Lexicon
	;

start
	: sentence*
	;

var
    : 'var' IDENT ':' tipo ';'
    | IDENT ':' tipo ';'
    | struct
    ;

struct
    : 'struct' IDENT '{' var* '}' ';'
    ;

tipo
	: 'float'
	| 'int'
	| 'char'
	| IDENT
	| '[' INT_CONSTANT ']' tipo
	;

parameter
    : (IDENT ':' tipo (',' IDENT ':' tipo)*)?
    ;

sentence
	: var
	| ('print' | 'printsp' | 'println') expr ';'
	| 'read' expr ';'
	| expr '=' expr ';'
	| 'if' '(' expr ')' '{' sentence* '}' 'else' '{' sentence* '}'
	| 'if' '(' expr ')' '{' sentence* '}'
    | 'while' '(' expr ')' '{' sentence* '}'
    | 'main' '(' ')' '{' sentence*'}'
    | IDENT '(' parameter ')' (':' tipo) ? '{' sentence* 'return' expr? ';' '}'
	;

expr
	: '(' expr ')'
	| expr ('*' | '/') expr
	| expr ('+' | '-') expr
	| expr ('>' | '>=' | '<' | '<=' | '==' | '!=') expr
	| expr ('&&' | '||') expr
	| '!' expr
	| 'cast' '<' tipo '>' '(' expr ')'
    | IDENT '(' expr (',' expr)* ')' ';'?
    | expr ('[' expr ']')+
	| expr '.' IDENT
	| IDENT
    | INT_CONSTANT+
    | REAL_CONSTANT
    | CHAR_CONSTANT
	;