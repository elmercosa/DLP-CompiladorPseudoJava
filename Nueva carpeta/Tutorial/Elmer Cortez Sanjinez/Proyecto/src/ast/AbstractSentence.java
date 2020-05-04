/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

public abstract class AbstractSentence extends AbstractAST implements Sentence {

    public FuncDefinition getDefinicion() {
        return definition;
    }

    public void setDefinicion(FuncDefinition definition) {
        this.definition = definition;
    }

    private FuncDefinition definition;

}
