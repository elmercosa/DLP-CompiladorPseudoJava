/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package visitor;

import ast.Aritmetica;
import ast.Array;
import ast.Assignment;
import ast.Caracter;
import ast.Cast;
import ast.Clase;
import ast.Comparacion;
import ast.Entero;
import ast.FuncDefinition;
import ast.Iarray;
import ast.Ifelse;
import ast.Invoca;
import ast.LitChar;
import ast.LitEnt;
import ast.LitReal;
import ast.Logica;
import ast.Negacion;
import ast.Print;
import ast.Program;
import ast.Read;
import ast.Real;
import ast.Return;
import ast.ReturnVoidExpression;
import ast.StructDefinition;
import ast.StructField;
import ast.StructFieldDefinition;
import ast.Var;
import ast.VarDefinition;
import ast.VoidType;
import ast.While;

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
	public Object visit(StructFieldDefinition node, Object param);
	public Object visit(FuncDefinition node, Object param);
	public Object visit(StructDefinition node, Object param);
}
