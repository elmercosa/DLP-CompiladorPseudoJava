/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	array:type -> tipo:type  dimension:String

public class Array extends AbstractType {

	public Array(Type tipo, String dimension) {
		this.tipo = tipo;
		this.dimension = dimension;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public Array(Object tipo, Object dimension) {
		this.tipo = (Type) getAST(tipo);
		this.dimension = (dimension instanceof Token) ? ((Token)dimension).getText() : (String) dimension;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo, dimension);
	}

	public Type getTipo() {
		return tipo;
	}
	public void setTipo(Type tipo) {
		this.tipo = tipo;
	}

	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Type tipo;
	private String dimension;

	public String toString() {
       return "{tipo:" + getTipo() + ", dimension:" + getDimension() + "}";
   }
}
