lexer grammar Lexicon;

INT_CONSTANT
	: [0-9]+;

IDENT
    : [a-zA-Z_]+ ;

WHITESPACE
	: [ \t\r\n]+ -> skip;

COMMENT
    : '/*'.*?'*/' -> skip;
