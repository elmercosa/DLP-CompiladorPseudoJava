grammar Grammar
	;

import Lexicon
	;

program returns[Program ast]
	: defs EOF { $ast = new Program($defs.list); }
	;

defs returns[List<Def> list = new ArrayList<Def>()]
    : (var { $list.add($var.ast); } | structFieldDefinition { $list.add($structFieldDefinition.ast); } | struct { $list.add($struct.ast); } | funcDefinition { $list.add($funcDefinition.ast); })*
    ;

var returns[VarDefinition ast]
    : 'var' IDENT ':' type ';' { $ast = new VarDefinition($IDENT, $type.ast, "global"); }
    ;

varLocal returns[VarDefinition ast]
    : 'var' IDENT ':' type ';' { $ast = new VarDefinition($IDENT, $type.ast, "local"); }
    ;

structFieldDefinition returns[StructFieldDefinition ast]
    : IDENT ':' type ';' { $ast = new StructFieldDefinition($IDENT, $type.ast); }
    ;

struct returns [StructDefinition ast]
    : 'struct' IDENT '{' fields '}' ';'  { $ast = new StructDefinition($IDENT, $fields.list); }
    ;

defVars returns[List<VarDefinition> list = new ArrayList<VarDefinition>()]
    : (varLocal { $list.add($varLocal.ast); })*
    ;

funcDefinition returns [FuncDefinition ast]
    : IDENT '(' parameter ')' returnType '{' defVars sentences '}' { $ast = new FuncDefinition($IDENT, $parameter.list, $returnType.ast, $defVars.list, $sentences.list); }
    ;

fields returns[List<StructFieldDefinition> list = new ArrayList<StructFieldDefinition>()]
    : (structFieldDefinition { $list.add($structFieldDefinition.ast); })*
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
    : (IDENT ':' type { $list.add(new VarDefinition($IDENT, $type.ast,"param")); } (',' IDENT ':' type { $list.add(new VarDefinition($IDENT, $type.ast,"param")); })*)?
    ;

sentence returns[Sentence ast]
	: 'print' expr ';' { $ast = new Print($expr.ast); }
	| 'printsp'expr ';' { $ast = new Printsp($expr.ast); }
	| 'println' returnExpression ';' { $ast = new Println($returnExpression.ast); }
    | 'return' returnExpression ';' { $ast = new Return($returnExpression.ast); }
	| 'read' expr ';' { $ast = new Read($expr.ast); }
    | IDENT '(' expressions ')' ';'? { $ast = new InvocaSent($IDENT,$expressions.list); }
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
	| expr'.'IDENT { $ast = new StructField($ctx.expr(0), $IDENT); }
	| expr '[' expr ']' { $ast = new Iarray($ctx.expr(0), $ctx.expr(1)); }
	| IDENT '(' expressions ')' ';'? { $ast = new InvocaExpr($IDENT,$expressions.list); }
	| expr op=('*' | '/') expr { $ast = new Aritmetica($ctx.expr(0), $op, $ctx.expr(1)); }
	| expr op=('+' | '-') expr { $ast = new Aritmetica($ctx.expr(0), $op, $ctx.expr(1)); }
	| expr op=('>' | '>=' | '<' | '<=' | '==' | '!=') expr { $ast = new Comparacion($ctx.expr(0), $op, $ctx.expr(1)); }
	| expr op=('&&' | '||') expr { $ast = new Logica($ctx.expr(0), $op, $ctx.expr(1)); }
	| '!' expr { $ast = new Negacion($expr.ast); }
	| 'cast' '<' type '>' '(' expr ')' { $ast = new Cast($type.ast,$expr.ast); }
	| IDENT { $ast = new Var($IDENT); }
    | INT_CONSTANT+ { $ast = new LitEnt($INT_CONSTANT); }
    | REAL_CONSTANT { $ast = new LitReal($REAL_CONSTANT); }
    | CHAR_CONSTANT { $ast = new LitChar($CHAR_CONSTANT); }
	;