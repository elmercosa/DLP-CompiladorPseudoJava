/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	iarray:expression -> name:expression  index:expression

public class Iarray extends AbstractExpression {

	public Iarray(Expression name, Expression index) {
		this.name = name;
		this.index = index;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, index);
	}

	public Iarray(Object name, Object index) {
		this.name = (Expression) getAST(name);
		this.index = (Expression) getAST(index);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, index);
	}

	public Expression getName() {
		return name;
	}
	public void setName(Expression name) {
		this.name = name;
	}

	public Expression getIndex() {
		return index;
	}
	public void setIndex(Expression index) {
		this.index = index;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression name;
	private Expression index;

	public String toString() {
       return "{name:" + getName() + ", index:" + getIndex() + "}";
   }
}
