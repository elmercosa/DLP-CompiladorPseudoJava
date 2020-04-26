/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Program { List<Def> def; }
	public Object visit(Program node, Object param) {
		visitChildren(node.getDef(), param);
		return null;
	}

	//	class Entero {  }
	public Object visit(Entero node, Object param) {
		return null;
	}

	//	class Real {  }
	public Object visit(Real node, Object param) {
		return null;
	}

	//	class Caracter {  }
	public Object visit(Caracter node, Object param) {
		return null;
	}

	//	class Clase { String name; }
	public Object visit(Clase node, Object param) {
		return null;
	}

	//	class Array { Type tipo;  String dimension; }
	public Object visit(Array node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class VoidType {  }
	public Object visit(VoidType node, Object param) {
		return null;
	}

	//	class Aritmetica { Expression left;  String operator;  Expression right; }
	public Object visit(Aritmetica node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class Comparacion { Expression left;  String operator;  Expression right; }
	public Object visit(Comparacion node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class Logica { Expression left;  String operator;  Expression right; }
	public Object visit(Logica node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class InvocaExpr { String name;  List<Expression> params; }
	public Object visit(InvocaExpr node, Object param) {
		visitChildren(node.getParams(), param);
		return null;
	}

	//	class Var { String name; }
	public Object visit(Var node, Object param) {
		return null;
	}

	//	class LitEnt { String value; }
	public Object visit(LitEnt node, Object param) {
		return null;
	}

	//	class LitReal { String value; }
	public Object visit(LitReal node, Object param) {
		return null;
	}

	//	class LitChar { String value; }
	public Object visit(LitChar node, Object param) {
		return null;
	}

	//	class Negacion { Expression expr; }
	public Object visit(Negacion node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class Cast { Type to;  Expression from; }
	public Object visit(Cast node, Object param) {
		if (node.getTo() != null)
			node.getTo().accept(this, param);
		if (node.getFrom() != null)
			node.getFrom().accept(this, param);
		return null;
	}

	//	class Iarray { Expression name;  Expression index; }
	public Object visit(Iarray node, Object param) {
		if (node.getName() != null)
			node.getName().accept(this, param);
		if (node.getIndex() != null)
			node.getIndex().accept(this, param);
		return null;
	}

	//	class StructField { Expression name;  String field; }
	public Object visit(StructField node, Object param) {
		if (node.getName() != null)
			node.getName().accept(this, param);
		return null;
	}

	//	class InvocaSent { String name;  List<Expression> params; }
	public Object visit(InvocaSent node, Object param) {
		visitChildren(node.getParams(), param);
		return null;
	}

	//	class Ifelse { Expression condition;  List<Sentence> sentence;  List<Sentence> els; }
	public Object visit(Ifelse node, Object param) {
		if (node.getCondition() != null)
			node.getCondition().accept(this, param);
		visitChildren(node.getSentence(), param);
		visitChildren(node.getEls(), param);
		return null;
	}

	//	class While { Expression condition;  List<Sentence> body; }
	public Object visit(While node, Object param) {
		if (node.getCondition() != null)
			node.getCondition().accept(this, param);
		visitChildren(node.getBody(), param);
		return null;
	}

	//	class Print { Expression expression; }
	public Object visit(Print node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class Printsp { Expression expression; }
	public Object visit(Printsp node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class Println { Expression expression; }
	public Object visit(Println node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class Read { Expression expr; }
	public Object visit(Read node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class Assignment { Expression var;  Expression value; }
	public Object visit(Assignment node, Object param) {
		if (node.getVar() != null)
			node.getVar().accept(this, param);
		if (node.getValue() != null)
			node.getValue().accept(this, param);
		return null;
	}

	//	class Return { Expression expression; }
	public Object visit(Return node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class ReturnVoidExpression {  }
	public Object visit(ReturnVoidExpression node, Object param) {
		return null;
	}

	//	class VarDefinition { String name;  Type tipo;  String scope; }
	public Object visit(VarDefinition node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class StructFieldDefinition { String name;  Type tipo; }
	public Object visit(StructFieldDefinition node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class FuncDefinition { String name;  List<VarDefinition> params;  Type retType;  List<VarDefinition> vars;  List<Sentence> body; }
	public Object visit(FuncDefinition node, Object param) {
		visitChildren(node.getParams(), param);
		if (node.getRetType() != null)
			node.getRetType().accept(this, param);
		visitChildren(node.getVars(), param);
		visitChildren(node.getBody(), param);
		return null;
	}

	//	class StructDefinition { String name;  List<StructFieldDefinition> fields; }
	public Object visit(StructDefinition node, Object param) {
		visitChildren(node.getFields(), param);
		return null;
	}

	// Método auxiliar -----------------------------
	protected void visitChildren(List<? extends AST> children, Object param) {
		if (children != null)
			for (AST child : children)
				child.accept(this, param);
	}
}
