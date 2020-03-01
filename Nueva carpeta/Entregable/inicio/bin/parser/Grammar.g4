grammar Grammar;
import Lexicon;

start: 'DATA' defvar+ 'CODE' sentencia+ EOF;

defvar: int_value | real_value;

int_value: tipo IDENT';';

real_value: tipo IDENT';';

tipo: 'int' | 'real';

sentencia: read | print | ifelse | asignacion | whileloop;

read:'read' IDENT ';';
print:'print' IDENT ';';
ifelse: 'if('comparacion'){'sentencia+'}else{'sentencia+'}';
whileloop:'while('comparacion'){'sentencia+'}';
comparacion: expr'!='expr;
asignacion: IDENT'='expr';';
expr: IDENT |INT_CONSTANT | suma | cast;
suma: (IDENT|INT_CONSTANT)'+'(IDENT|INT_CONSTANT);
cast: '<' ('int'|'real')'>('expr');';
