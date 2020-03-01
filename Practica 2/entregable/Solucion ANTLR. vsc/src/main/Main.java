package main;

import org.antlr.v4.runtime.*;

import parser.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Lexicon textLexer = new Lexicon(CharStreams.fromFileName("test.txt"));

        Token token;
        while ((token = textLexer.nextToken()).getType() != Lexicon.EOF) {
            System.out.print(String.format("%-25s", "Token: (" + token.getType() + ", "
                    + textLexer.getVocabulary().getDisplayName(token.getType()) + ")"));
            System.out.print("Lexema: " + token.getText());
            System.out.print("\tLine: " + token.getLine());
            System.out.println("\tColumna: " + token.getCharPositionInLine());
        }

    }
}
