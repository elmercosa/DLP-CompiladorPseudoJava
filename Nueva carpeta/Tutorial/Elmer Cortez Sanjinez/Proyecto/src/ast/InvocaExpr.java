/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	invocaExpr:expression -> name:String  params:expression*

public class InvocaExpr extends AbstractExpression {

	public InvocaExpr(String name, List<Expression> params) {
		this.name = name;
		this.params = params;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(params);
	}

	public InvocaExpr(Object name, Object params) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.params = this.<Expression>getAstFromContexts(params);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, params);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Expression> getParams() {
		return params;
	}
	public void setParams(List<Expression> params) {
		this.params = params;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private List<Expression> params;

	public String toString() {
       return "{name:" + getName() + ", params:" + getParams() + "}";
   }

	public FuncDefinition getDefinicion() {
		return definition;
	}

	public void setDefinicion(FuncDefinition definition) {
		this.definition = definition;
	}

	private FuncDefinition definition;

	public void setType(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setModificable(boolean modificable) {
		this.modificable = modificable;
	}

	public boolean isModificable() {
		return modificable;
	}

	private Type type;
	private boolean modificable;
}
