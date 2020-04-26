/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	varDefinition:def -> name:String  tipo:type  scope:String

public class VarDefinition extends AbstractDef {

	public VarDefinition(String name, Type tipo, String scope) {
		this.name = name;
		this.tipo = tipo;
		this.scope = scope;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public VarDefinition(Object name, Object tipo, Object scope) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.tipo = (Type) getAST(tipo);
		this.scope = (scope instanceof Token) ? ((Token)scope).getText() : (String) scope;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, tipo, scope);
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

	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private Type tipo;
	private String scope;

	public String toString() {
       return "{name:" + getName() + ", tipo:" + getTipo() + ", scope:" + getScope() + "}";
   }
}
