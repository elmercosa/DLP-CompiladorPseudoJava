/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Program node, Object param);
	public Object visit(Entero node, Object param);
	public Object visit(Real node, Object param);
	public Object visit(Caracter node, Object param);
	public Object visit(Clase node, Object param);
	public Object visit(Array node, Object param);
	public Object visit(VoidType node, Object param);
	public Object visit(Aritmetica node, Object param);
	public Object visit(Comparacion node, Object param);
	public Object visit(Logica node, Object param);
	public Object visit(Invoca node, Object param);
	public Object visit(Var node, Object param);
	public Object visit(LitEnt node, Object param);
	public Object visit(LitReal node, Object param);
	public Object visit(LitChar node, Object param);
	public Object visit(Negacion node, Object param);
	public Object visit(Cast node, Object param);
	public Object visit(Iarray node, Object param);
	public Object visit(StructField node, Object param);
	public Object visit(Ifelse node, Object param);
	public Object visit(While node, Object param);
	public Object visit(Print node, Object param);
	public Object visit(Read node, Object param);
	public Object visit(Assignment node, Object param);
	public Object visit(Return node, Object param);
	public Object visit(ReturnVoidExpression node, Object param);
	public Object visit(VarDefinition node, Object param);
	public Object visit(FuncDefinition node, Object param);
	public Object visit(StructDefinition node, Object param);
}
