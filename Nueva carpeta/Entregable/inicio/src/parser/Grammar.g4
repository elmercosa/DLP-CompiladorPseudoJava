grammar Grammar;
import Lexicon;

start: 'DATA' defvar+ 'CODE' sentencia+ EOF;

defvar: int_value | real_value;

int_value: tipo IDENT';';

real_value: tipo IDENT';';

tipo: 'int' | 'real';



sentencia: read | print | ifelse | asignacion | whileloop;

ifelse: 'if''('comparacion')''{'sentencia+'}''else''{'sentencia+'}';

read:'read' IDENT ';';
print:'print' IDENT ';';

expr: IDENT |INT_CONSTANT | suma | cast;

whileloop:'while('comparacion'){'sentencia+'}';

comparacion: '('?(IDENT|INT_CONSTANT)'!='(IDENT|INT_CONSTANT)')'?;
suma: '('?(IDENT|INT_CONSTANT)'+'(IDENT|INT_CONSTANT|cast)')'?;


cast: '<' ('int'|'real')'>('expr');';
asignacion: IDENT'='expr';';
