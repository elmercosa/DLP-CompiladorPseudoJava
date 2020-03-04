/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	funcDefinition:sentence -> name:String  params:varDefinition*  retType:type  body:sentence*

public class FuncDefinition extends AbstractSentence {

	public FuncDefinition(String name, List<VarDefinition> params, Type retType, List<Sentence> body) {
		this.name = name;
		this.params = params;
		this.retType = retType;
		this.body = body;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(params, retType, body);
	}

	public FuncDefinition(Object name, Object params, Object retType, Object body) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.params = this.<VarDefinition>getAstFromContexts(params);
		this.retType = (Type) getAST(retType);
		this.body = this.<Sentence>getAstFromContexts(body);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, params, retType, body);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<VarDefinition> getParams() {
		return params;
	}
	public void setParams(List<VarDefinition> params) {
		this.params = params;
	}

	public Type getRetType() {
		return retType;
	}
	public void setRetType(Type retType) {
		this.retType = retType;
	}

	public List<Sentence> getBody() {
		return body;
	}
	public void setBody(List<Sentence> body) {
		this.body = body;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private List<VarDefinition> params;
	private Type retType;
	private List<Sentence> body;

	public String toString() {
       return "{name:" + getName() + ", params:" + getParams() + ", retType:" + getRetType() + ", body:" + getBody() + "}";
   }
}
