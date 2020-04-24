/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	assignment:sentence -> var:expression  value:expression

public class Assignment extends AbstractSentence {

	public Assignment(Expression var, Expression value) {
		this.var = var;
		this.value = value;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(var, value);
	}

	public Assignment(Object var, Object value) {
		this.var = (Expression) getAST(var);
		this.value = (Expression) getAST(value);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(var, value);
	}

	public Expression getVar() {
		return var;
	}
	public void setVar(Expression var) {
		this.var = var;
	}

	public Expression getValue() {
		return value;
	}
	public void setValue(Expression value) {
		this.value = value;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression var;
	private Expression value;

	public String toString() {
       return "{var:" + getVar() + ", value:" + getValue() + "}";
   }
}
