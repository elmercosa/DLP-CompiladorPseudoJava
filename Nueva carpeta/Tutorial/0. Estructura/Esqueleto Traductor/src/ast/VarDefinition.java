/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	varDefinition:sentence -> name:String  tipo:type

public class VarDefinition extends AbstractSentence {

	public VarDefinition(String name, Type tipo) {
		this.name = name;
		this.tipo = tipo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public VarDefinition(Object name, Object tipo) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.tipo = (Type) getAST(tipo);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, tipo);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Type getTipo() {
		return tipo;
	}
	public void setTipo(Type tipo) {
		this.tipo = tipo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private Type tipo;

	public String toString() {
       return "{name:" + getName() + ", tipo:" + getTipo() + "}";
   }
}
