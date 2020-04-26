/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import visitor.Visitor;

//	real:type -> 

public class Real extends AbstractType {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{Real}";
   }

	@Override
	public int getSize() {
		return 4;
	}

	@Override
	public char getSuffix() {
		return 'f';
	}

	@Override
	public String getMAPLName() {
		return "float";
	}
}
