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

	//	class Class { String name; }
	public Object visit(Class node, Object param) {
		return null;
	}

	//	class Array { String name;  Type type; }
	public Object visit(Array node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
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

	//	class ExprBin { Expression left;  String operator;  Expression right; }
	public Object visit(ExprBin node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class Invoca { String name;  List<Expression> params; }
	public Object visit(Invoca node, Object param) {
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

	//	class Iarray { String name;  Expression index; }
	public Object visit(Iarray node, Object param) {
		if (node.getIndex() != null)
			node.getIndex().accept(this, param);
		return null;
	}

	//	class StructField { String name;  String field; }
	public Object visit(StructField node, Object param) {
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

	//	class Write { Printer type; }
	public Object visit(Write node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
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

	//	class VarDefinition { String name;  Type type; }
	public Object visit(VarDefinition node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

	//	class FuncDefinition { String name;  VarDefinition params;  List<Sentence> body;  Expression ret; }
	public Object visit(FuncDefinition node, Object param) {
		if (node.getParams() != null)
			node.getParams().accept(this, param);
		visitChildren(node.getBody(), param);
		if (node.getRet() != null)
			node.getRet().accept(this, param);
		return null;
	}

	//	class StructDefinition { String name;  List<VarDefinition> fields; }
	public Object visit(StructDefinition node, Object param) {
		visitChildren(node.getFields(), param);
		return null;
	}

	//	class Program { List<VarDefinition> definitions;  List<Sentence> sentences; }
	public Object visit(Program node, Object param) {
		visitChildren(node.getDefinitions(), param);
		visitChildren(node.getSentences(), param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
