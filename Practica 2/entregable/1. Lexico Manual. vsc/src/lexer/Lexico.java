/*
Añadir EN ESTE ORDEN:
- Constantes reales: 3.15, 78.23, ... (parte entera obligatoria/parte decimal OPCIONAL)
- Operadores aritméticos y otros simbolos:  + - * / . : = ; [ ] ( ) { } < >
- Palabras reservadas: if, while, read, write, int y real
*/

package lexer;

import java.io.*;

public class Lexico {
//	public static final int POR = '*'; // '*' -> 42
	public static final int REAL_CONSTANT = 255;
	public static final int INT_CONSTANT = 256;
	public static final int IDENT = 257;
	public static final int IF = 258;
	public static final int WHILE = 259;
	public static final int READ = 260;
	public static final int WRITE = 261;
	public static final int INT = 262;
	public static final int REAL = 263;
	

	private Reader input;
	private int currentChar;

	public Lexico(Reader reader) throws IOException {
		input = reader;
		readNext();
	}

	// Funciones auxiliares -------------------------------
	private int readNext() throws IOException {
		currentChar = input.read();
		return currentChar;
	}

	private int getChar() throws IOException {
		return currentChar;
	}

	// Aquí empieza el Analizador Léxico ------------------
	public Token nextToken() throws IOException {

		while (true) {
			while (Character.isWhitespace(getChar()))
				readNext();

			if (getChar() == -1)
				return new Token(0, null);

			if (getChar() == '+') {
				readNext();
				return new Token('+', "+");
			}
			if (getChar() == '-') {
				readNext();
				return new Token('-', "-");
			}
			if (getChar() == '*') {
				readNext();
				return new Token('*', "*");
			}
			if (getChar() == '/') {
				readNext();
				return new Token('/', "/");
			}
			
			if (getChar() == ':') {
				readNext();
				return new Token(':', ":");
			}
			if (getChar() == '=') {
				readNext();
				return new Token('=', "=");
			}
			if (getChar() == ';') {
				readNext();
				return new Token(';', ";");
			}
			
			if (getChar() == '[') {
				readNext();
				return new Token('[', "[");
			}
			
			if (getChar() == ']') {
				readNext();
				return new Token(']', "]");
			}
			
			if (getChar() == '(') {
				readNext();
				return new Token('(', "(");
			}

			if (getChar() == ')') {
				readNext();
				return new Token(')', ")");
			}
			
			if (getChar() == '{') {
				readNext();
				return new Token('{', "{") ;
			}
			if (getChar() == '}') {
				readNext();
				return new Token('}', "}");
			}
			if (getChar() == '<') {
				readNext();
				return new Token('<', "<");
			}
			if (getChar() == '>') {
				readNext();
				return new Token('>', ">");
			}
			
			boolean real = false;
			if (Character.isDigit(getChar())) {
				StringBuffer buffer = new StringBuffer();
				buffer.append((char) getChar());
				int next = readNext();
				while (Character.isDigit(next) || next == 46) {
					if (next == 46) {
						real = true;
					}
					buffer.append((char) getChar());
					next = readNext();
				}

				return real ? new Token(REAL_CONSTANT, buffer.toString()) : new Token(INT_CONSTANT, buffer.toString());
			}

			if (Character.isLetter(getChar())) {
				StringBuffer buffer = new StringBuffer();
				buffer.append((char) getChar());
				while (Character.isLetterOrDigit(readNext()))
					buffer.append((char) getChar());
				String word = buffer.toString();
				if(word.equals("if")) {
					return new Token(IF, buffer.toString());
				}
				if(word.equals("while")) {
					return new Token(WHILE, buffer.toString());
				}
				if(word.equals("write")) {
					return new Token(WRITE, buffer.toString());
				}
				if(word.equals("read")) {
					return new Token(READ, buffer.toString());
				}
				if(word.equals("real")) {
					return new Token(REAL, buffer.toString());
				}
				if(word.equals("int")) {
					return new Token(INT, buffer.toString());
				}
				return new Token(IDENT, word);
			}
			
			if (getChar() == '.') {
				readNext();
				return new Token('.', ".");
			}

			System.out.println("Error lexico: " + getChar());
			readNext();
		}
	}
}
