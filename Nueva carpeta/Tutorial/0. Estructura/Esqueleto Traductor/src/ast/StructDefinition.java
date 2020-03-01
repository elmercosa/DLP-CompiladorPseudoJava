/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	structDefinition:sentence -> name:String  fields:varDefinition*

public class StructDefinition extends AbstractSentence {

	public StructDefinition(String name, List<VarDefinition> fields) {
		this.name = name;
		this.fields = fields;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(fields);
	}

	public StructDefinition(Object name, Object fields) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.fields = this.<VarDefinition>getAstFromContexts(fields);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, fields);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<VarDefinition> getFields() {
		return fields;
	}
	public void setFields(List<VarDefinition> fields) {
		this.fields = fields;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private List<VarDefinition> fields;

	public String toString() {
       return "{name:" + getName() + ", fields:" + getFields() + "}";
   }
}
