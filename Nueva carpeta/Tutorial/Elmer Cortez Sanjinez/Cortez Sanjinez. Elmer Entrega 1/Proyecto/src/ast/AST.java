/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import visitor.Visitor;

public interface AST {

    public Object accept(Visitor visitor, Object param);

    Position getStart();

    Position getEnd();

    public void setPositions(Object... children);

}
