/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	structField:expression -> name:expression  field:String

public class StructField extends AbstractExpression {

	public StructField(Expression name, String field) {
		this.name = name;
		this.field = field;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name);
	}

	public StructField(Object name, Object field) {
		this.name = (Expression) getAST(name);
		this.field = (field instanceof Token) ? ((Token)field).getText() : (String) field;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, field);
	}

	public Expression getName() {
		return name;
	}
	public void setName(Expression name) {
		this.name = name;
	}

	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression name;
	private String field;

	public String toString() {
       return "{name:" + getName() + ", field:" + getField() + "}";
   }
}
