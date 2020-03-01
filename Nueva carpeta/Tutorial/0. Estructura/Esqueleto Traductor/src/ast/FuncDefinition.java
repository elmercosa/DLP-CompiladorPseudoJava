/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	funcDefinition:sentence -> name:String  params:varDefinition  body:sentence*  ret:expression

public class FuncDefinition extends AbstractSentence {

	public FuncDefinition(String name, VarDefinition params, List<Sentence> body, Expression ret) {
		this.name = name;
		this.params = params;
		this.body = body;
		this.ret = ret;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(params, body, ret);
	}

	public FuncDefinition(Object name, Object params, Object body, Object ret) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.params = (VarDefinition) getAST(params);
		this.body = this.<Sentence>getAstFromContexts(body);
		this.ret = (Expression) getAST(ret);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, params, body, ret);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public VarDefinition getParams() {
		return params;
	}
	public void setParams(VarDefinition params) {
		this.params = params;
	}

	public List<Sentence> getBody() {
		return body;
	}
	public void setBody(List<Sentence> body) {
		this.body = body;
	}

	public Expression getRet() {
		return ret;
	}
	public void setRet(Expression ret) {
		this.ret = ret;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private VarDefinition params;
	private List<Sentence> body;
	private Expression ret;

	public String toString() {
       return "{name:" + getName() + ", params:" + getParams() + ", body:" + getBody() + ", ret:" + getRet() + "}";
   }
}
