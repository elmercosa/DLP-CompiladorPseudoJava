/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import visitor.Visitor;

//	voidType:type -> 

public class VoidType extends AbstractType {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{VoidType}";
   }

	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public char getSuffix() {
		return 0;
	}

	@Override
	public String getMAPLName() {
		return "";
	}
}
