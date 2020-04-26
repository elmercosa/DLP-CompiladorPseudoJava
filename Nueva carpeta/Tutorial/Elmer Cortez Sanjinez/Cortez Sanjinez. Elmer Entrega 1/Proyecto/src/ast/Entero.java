/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import visitor.Visitor;

//	entero:type -> 

public class Entero extends AbstractType {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{Entero}";
   }

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public char getSuffix() {
		return 'i';
	}

	@Override
	public String getMAPLName() {
		return "int";
	}
}
