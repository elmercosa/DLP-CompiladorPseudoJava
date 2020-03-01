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

expressions return[List<Expression>]

expr returns[Expression ast]
	: '(' expr ')' { $ast = $expr.ast; }
	| expr ('*' | '/') expr { $ast = new Aritmetica($ctx.expr(0).ast, $op.text, $ctx.expr(1).ast); }
	| expr ('+' | '-') expr { $ast = new Aritmetica($ctx.expr(0).ast, $op.text, $ctx.expr(1).ast); }
	| expr ('>' | '>=' | '<' | '<=' | '==' | '!=') expr { $ast = new Comparacion($ctx.expr(0).ast, $op.text, $ctx.expr(1).ast); }
	| expr ('&&' | '||') expr { $ast = new Logica($ctx.expr(0).ast, $op.text, $ctx.expr(1).ast); }
	| '!' expr { $ast = new Negacion($expr.ast); }
	| 'cast' '<' tipo '>' '(' expr ')' { $ast = new Cast($tipo.ast,$expr.ast); }
    | IDENT '(' expr (',' expr)* ')' ';'? { $ast = new Invoca($tipo.ast,$expr.ast); }
    | expr ('[' expr ']')+
	| expr '.' IDENT
	| IDENT { $ast = new Var($IDENT.text); }
    | INT_CONSTANT+ { $ast = new Entero($INT_CONSTANT.text); }
    | REAL_CONSTANT { $ast = new Real($REAL_CONSTANT.text); }
    | CHAR_CONSTANT { $ast = new Caracter($CHAR_CONSTANT.text); }
	;