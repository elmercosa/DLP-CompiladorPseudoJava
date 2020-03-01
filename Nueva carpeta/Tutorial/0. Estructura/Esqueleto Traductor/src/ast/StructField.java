/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	structField:expression -> name:String  field:String

public class StructField extends AbstractExpression {

	public StructField(String name, String field) {
		this.name = name;
		this.field = field;
	}

	public StructField(Object name, Object field) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.field = (field instanceof Token) ? ((Token)field).getText() : (String) field;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, field);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
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

	private String name;
	private String field;

	public String toString() {
       return "{name:" + getName() + ", field:" + getField() + "}";
   }
}
