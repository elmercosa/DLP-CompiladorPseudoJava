/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	print:sentence -> tipo:String  expression:expression

public class Print extends AbstractSentence {

	public Print(String tipo, Expression expression) {
		this.tipo = tipo;
		this.expression = expression;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expression);
	}

	public Print(Object tipo, Object expression) {
		this.tipo = (tipo instanceof Token) ? ((Token)tipo).getText() : (String) tipo;
		this.expression = (Expression) getAST(expression);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo, expression);
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String tipo;
	private Expression expression;

	public String toString() {
       return "{tipo:" + getTipo() + ", expression:" + getExpression() + "}";
   }
}
