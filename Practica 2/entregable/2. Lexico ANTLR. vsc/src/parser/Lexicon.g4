/*
Añadir EN ESTE ORDEN:
- En el main, además del token, imprimir el lexema, línea y columna.
- Identificadores. Deben empezar por letra y luego puede ser letra, dígito o subrayado '_'.
- Palabras reservadas: read, write, int y float.
- Operadores aritméticos y otros simbolos:  + - = ;
- Constantes reales: 3.15, 78.23, ... (parte entera obligatoria/ parte decimal OBLIGATORIA).
- Comentarios de una línea y multilinea (como en Java).
*/

lexer grammar Lexicon
	;

COMMENT:( ('/*' .*? '*/') | ('//' .*? '\n') )-> skip;

READ: 'read';
WRITE: 'write';
INT: 'int';
FLOAT: 'float';

PCOMA: ';' ;
IGUAL: '=';
SUMA: '+';
RESTA: '-';

IDENT: [a-zA-Z]+[a-zA-Z]*[0-9]*'_'*;

REAL_CONSTANT
	: [0-9]+'.'[0-9]*
	;

INT_CONSTANT
	: [0-9]+
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;

