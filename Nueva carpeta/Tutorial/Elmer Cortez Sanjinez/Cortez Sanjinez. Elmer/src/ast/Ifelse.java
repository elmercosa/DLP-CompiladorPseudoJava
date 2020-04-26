/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import java.util.List;

import visitor.Visitor;

//	ifelse:sentence -> condition:expression  sentence:sentence*  els:sentence*

public class Ifelse extends AbstractSentence {

	public Ifelse(Expression condition, List<Sentence> sentence, List<Sentence> els) {
		this.condition = condition;
		this.sentence = sentence;
		this.els = els;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condition, sentence, els);
	}

	public Ifelse(Object condition, Object sentence, Object els) {
		this.condition = (Expression) getAST(condition);
		this.sentence = this.<Sentence>getAstFromContexts(sentence);
		this.els = this.<Sentence>getAstFromContexts(els);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condition, sentence, els);
	}

	public Expression getCondition() {
		return condition;
	}
	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public List<Sentence> getSentence() {
		return sentence;
	}
	public void setSentence(List<Sentence> sentence) {
		this.sentence = sentence;
	}

	public List<Sentence> getEls() {
		return els;
	}
	public void setEls(List<Sentence> els) {
		this.els = els;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression condition;
	private List<Sentence> sentence;
	private List<Sentence> els;

	public String toString() {
       return "{condition:" + getCondition() + ", sentence:" + getSentence() + ", els:" + getEls() + "}";
   }
}
