/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import visitor.*;

//	returnVoidExpression:expression -> 

public class ReturnVoidExpression extends AbstractExpression {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{ReturnVoidExpression}";
   }
}
