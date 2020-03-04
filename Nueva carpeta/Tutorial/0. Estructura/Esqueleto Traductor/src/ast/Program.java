/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import java.util.*;
import visitor.*;

//	program -> sentence:sentence*

public class Program extends AbstractAST  {

	public Program(List<Sentence> sentence) {
		this.sentence = sentence;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(sentence);
	}

	public Program(Object sentence) {
		this.sentence = this.<Sentence>getAstFromContexts(sentence);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(sentence);
	}

	public List<Sentence> getSentence() {
		return sentence;
	}
	public void setSentence(List<Sentence> sentence) {
		this.sentence = sentence;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Sentence> sentence;

	public String toString() {
       return "{sentence:" + getSentence() + "}";
   }
}
