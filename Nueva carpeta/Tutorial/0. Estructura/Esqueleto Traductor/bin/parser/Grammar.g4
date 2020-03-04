grammar Grammar
	;

import Lexicon
	;

program returns[Program ast]
	: sentences EOF { $ast = new Program($sentences.list); }
	;

var returns[VarDefinition ast]
    : 'var' IDENT ':' type ';' { $ast = new VarDefinition($IDENT, $type.ast); }
    ;

struct returns [StructDefinition ast]
    : 'struct' IDENT '{' fields '}' ';'  { $ast = new StructDefinition($IDENT, $fields.list); }
    ;

fields returns[List<VarDefinition> list = new ArrayList<VarDefinition>()]
    : (IDENT ':' type ';' { $list.add(new VarDefinition($IDENT, $type.ast)); })*
    ;

type returns[Type ast]
	: 'float' { $ast = new Real(); }
	| 'int' { $ast = new Entero(); }
	| 'char' { $ast = new Caracter(); }
	| IDENT { $ast = new Clase($IDENT); }
	| '[' INT_CONSTANT ']' type { $ast = new Array($type.ast,$INT_CONSTANT); }
	;

expressions returns[List<Expression> list = new ArrayList<Expression>()]
    : (expr { $list.add($expr.ast); } (',' expr { $list.add($expr.ast); })*)?
    ;

sentences returns[List<Sentence> list = new ArrayList<Sentence>()]
    : (sentence { $list.add($sentence.ast); })*
    ;

parameter returns[List<VarDefinition> list = new ArrayList<VarDefinition>()]
    : (IDENT ':' type { $list.add(new VarDefinition($IDENT, $type.ast)); } (',' IDENT ':' type { $list.add(new VarDefinition($IDENT, $type.ast)); })*)?
    ;

sentence returns[Sentence ast]
	: var { $ast = $var.ast; }
	| struct { $ast = $struct.ast;}
	| op=('print' | 'printsp' | 'println') expr ';' { $ast = new Print($op, $expr.ast); }
    | 'return' returnExpression ';' { $ast = new Return($returnExpression.ast); }
	| 'read' expr ';' { $ast = new Read($expr.ast); }
	| IDENT '(' parameter ')' returnType '{' sentences '}' { $ast = new FuncDefinition($IDENT, $parameter.list, $returnType.ast, $sentences.list); }
    | IDENT '(' expressions ')' ';'? { $ast = new Invoca($IDENT,$expressions.list); }
	| expr '=' expr ';' { $ast = new Assignment($ctx.expr(0),$ctx.expr(1)); }
	| 'if' '(' expr ')' '{' sentences '}' 'else' '{' sentences '}' { $ast = new Ifelse($expr.ast,$ctx.sentences(0).list,$ctx.sentences(1).list); }
	| 'if' '(' expr ')' '{' sentences '}'  { $ast = new Ifelse($expr.ast,$ctx.sentences(0).list,null); }
    | 'while' '(' expr ')' '{' sentences '}' { $ast = new While($expr.ast,$sentences.list); }
	;

returnType returns[Type ast]
    : ':'type { $ast = $type.ast; }
    | { $ast = new VoidType(); }
    ;

returnExpression returns[Expression ast]
    : expr { $ast = $expr.ast; }
    | { $ast = new ReturnVoidExpression(); }
    ;

expr returns[Expression ast]
	: '(' expr ')' { $ast = $expr.ast; }
	| IDENT '(' expressions ')' ';'? { $ast = new Invoca($IDENT,$expressions.list); }
	| expr op=('*' | '/') expr { $ast = new Aritmetica($ctx.expr(0), $op, $ctx.expr(1)); }
	| expr op=('+' | '-') expr { $ast = new Aritmetica($ctx.expr(0), $op, $ctx.expr(1)); }
	| expr op=('>' | '>=' | '<' | '<=' | '==' | '!=') expr { $ast = new Comparacion($ctx.expr(0), $op, $ctx.expr(1)); }
	| expr op=('&&' | '||') expr { $ast = new Logica($ctx.expr(0), $op, $ctx.expr(1)); }
	| '!' expr { $ast = new Negacion($expr.ast); }
	| 'cast' '<' type '>' '(' expr ')' { $ast = new Cast($type.ast,$expr.ast); }
    | expr ('[' expr ']')+ { $ast = new Iarray($ctx.expr(0), $ctx.expr(1)); }
	| expr'.'IDENT { $ast = new StructField($ctx.expr(0), $IDENT); }
	| IDENT { $ast = new Var($IDENT); }
    | INT_CONSTANT+ { $ast = new LitEnt($INT_CONSTANT); }
    | REAL_CONSTANT { $ast = new LitReal($REAL_CONSTANT); }
    | CHAR_CONSTANT { $ast = new LitChar($CHAR_CONSTANT); }
	;