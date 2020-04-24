/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package codegeneration;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ast.*;
import visitor.DefaultVisitor;

enum CodeFunction {
    ADDRESS, VALUE
}

public class CodeSelection extends DefaultVisitor {

    private Map<String, String> instruccion = new HashMap<>();

    public CodeSelection(Writer writer, String sourceFile) {
        this.writer = new PrintWriter(writer);
        this.sourceFile = sourceFile;

        instruccion.put("+", "add");
        instruccion.put("-", "sub");
        instruccion.put("*", "mul");
        instruccion.put("/", "div");
    }

    //	class Program { List<Def> def; }
    public Object visit(Program node, Object param) {

        out("#source \"" + sourceFile + "\"");
        visitChildren(node.getDef(), param);
        out("halt");

        return null;
    }

    //	class Entero {  }
    public Object visit(Entero node, Object param) {
        return null;
    }

    //	class Real {  }
    public Object visit(Real node, Object param) {
        return null;
    }

    //	class Caracter {  }
    public Object visit(Caracter node, Object param) {
        return null;
    }

    //	class Clase { String name; }
    public Object visit(Clase node, Object param) {
        return null;
    }

    //	class Array { Type tipo;  String dimension; }
    public Object visit(Array node, Object param) {

        // super.visit(node, param);

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        return null;
    }

    //	class VoidType {  }
    public Object visit(VoidType node, Object param) {
        return null;
    }

    //	class Aritmetica { Expression left;  String operator;  Expression right; }
    public Object visit(Aritmetica node, Object param) {

        // super.visit(node, param);

        if (node.getLeft() != null)
            node.getLeft().accept(this, param);

        if (node.getRight() != null)
            node.getRight().accept(this, param);

        return null;
    }

    //	class Comparacion { Expression left;  String operator;  Expression right; }
    public Object visit(Comparacion node, Object param) {

        // super.visit(node, param);

        if (node.getLeft() != null)
            node.getLeft().accept(this, param);

        if (node.getRight() != null)
            node.getRight().accept(this, param);

        return null;
    }

    //	class Logica { Expression left;  String operator;  Expression right; }
    public Object visit(Logica node, Object param) {

        // super.visit(node, param);

        if (node.getLeft() != null)
            node.getLeft().accept(this, param);

        if (node.getRight() != null)
            node.getRight().accept(this, param);

        return null;
    }

    //	class Invoca { String name;  List<Expression> params; }
    public Object visit(Invoca node, Object param) {

        // super.visit(node, param);

        if (node.getParams() != null)
            for (Expression child : node.getParams())
                child.accept(this, param);

        return null;
    }

    //	class Var { String name; }
    public Object visit(Var node, Object param) {
        if (((CodeFunction) param) == CodeFunction.VALUE) {
            visit(node, CodeFunction.ADDRESS);
            out("load", node.getType());
        } else { // Funcion.DIRECCION
            assert (param == CodeFunction.ADDRESS);
            out("pusha " + node.getDefinicion().getAddress());
        }
        return null;
    }

    //	class LitEnt { String value; }
    public Object visit(LitEnt node, Object param) {
        assert (param == CodeFunction.VALUE);
        out("push " + node.getValue());
        return null;
    }

    //	class LitReal { String value; }
    public Object visit(LitReal node, Object param) {
        assert (param == CodeFunction.VALUE);
        out("pushf " + node.getValue());
        return null;
    }

    //	class LitChar { String value; }
    public Object visit(LitChar node, Object param) {
        return null;
    }

    //	class Negacion { Expression expr; }
    public Object visit(Negacion node, Object param) {

        // super.visit(node, param);

        if (node.getExpr() != null)
            node.getExpr().accept(this, param);

        return null;
    }

    //	class Cast { Type to;  Expression from; }
    public Object visit(Cast node, Object param) {

        // super.visit(node, param);

        if (node.getTo() != null)
            node.getTo().accept(this, param);

        if (node.getFrom() != null)
            node.getFrom().accept(this, param);

        return null;
    }

    //	class Iarray { Expression name;  Expression index; }
    public Object visit(Iarray node, Object param) {

        // super.visit(node, param);

        if (node.getName() != null)
            node.getName().accept(this, param);

        if (node.getIndex() != null)
            node.getIndex().accept(this, param);

        return null;
    }

    //	class StructField { Expression name;  String field; }
    public Object visit(StructField node, Object param) {

        // super.visit(node, param);

        if (node.getName() != null)
            node.getName().accept(this, param);

        return null;
    }

    //	class Ifelse { Expression condition;  List<Sentence> sentence;  List<Sentence> els; }
    public Object visit(Ifelse node, Object param) {

        // super.visit(node, param);

        if (node.getCondition() != null)
            node.getCondition().accept(this, param);

        if (node.getSentence() != null)
            for (Sentence child : node.getSentence())
                child.accept(this, param);

        if (node.getEls() != null)
            for (Sentence child : node.getEls())
                child.accept(this, param);

        return null;
    }

    //	class While { Expression condition;  List<Sentence> body; }
    public Object visit(While node, Object param) {

        // super.visit(node, param);

        if (node.getCondition() != null)
            node.getCondition().accept(this, param);

        if (node.getBody() != null)
            for (Sentence child : node.getBody())
                child.accept(this, param);

        return null;
    }

    //	class Print { String tipo;  Expression expression; }
    public Object visit(Print node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getExpression().accept(this, CodeFunction.VALUE);
        out("out", node.getExpression().getType());

        return null;
    }

    //	class Read { Expression expr; }
    public Object visit(Read node, Object param) {

        // super.visit(node, param);

        if (node.getExpr() != null)
            node.getExpr().accept(this, param);

        return null;
    }

    //	class Assignment { Expression var;  Expression value; }
    public Object visit(Assignment node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getVar().accept(this, CodeFunction.ADDRESS);
        node.getValue().accept(this, CodeFunction.VALUE);
        out("store", node.getVar().getType());

        return null;
    }

    //	class Return { Expression expression; }
    public Object visit(Return node, Object param) {

        // super.visit(node, param);

        if (node.getExpression() != null)
            node.getExpression().accept(this, param);

        return null;
    }

    //	class ReturnVoidExpression {  }
    public Object visit(ReturnVoidExpression node, Object param) {
        return null;
    }

    //	class VarDefinition { String name;  Type tipo; }
    public Object visit(VarDefinition node, Object param) {

        // super.visit(node, param);

        if(node.getScope().equals("global")) {
            out("#GLOBAL " + node.getName() + ":" + node.getTipo().getMAPLName());
        }

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        return null;
    }

    //	class StructFieldDefinition { String name;  Type tipo; }
    public Object visit(StructFieldDefinition node, Object param) {

        // super.visit(node, param);

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        return null;
    }

    //	class FuncDefinition { String name;  List<VarDefinition> params;  Type retType;  List<VarDefinition> vars;  List<Sentence> body; }
    public Object visit(FuncDefinition node, Object param) {

        // super.visit(node, param);

        if (node.getParams() != null)
            for (VarDefinition child : node.getParams())
                child.accept(this, param);

        if (node.getRetType() != null)
            node.getRetType().accept(this, param);

        if (node.getVars() != null)
            for (VarDefinition child : node.getVars())
                child.accept(this, param);

        if (node.getBody() != null)
            for (Sentence child : node.getBody())
                child.accept(this, param);

        return null;
    }

    //	class StructDefinition { String name;  List<StructFieldDefinition> fields; }
    public Object visit(StructDefinition node, Object param) {

        // super.visit(node, param);

        if (node.getFields() != null)
            for (StructFieldDefinition child : node.getFields())
                child.accept(this, param);

        return null;
    }

    // ----------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------
    private void out(String instruction) {
        writer.println(instruction);
    }

    private void out(String instruccion, Type tipo) {
        out(instruccion + tipo.getSuffix());
    }

    private void line(Position pos) {
        out("\n#line " + pos.getLine());
    }

    private void line(AST node) {
        line(node.getEnd());
    }

    private PrintWriter writer;
    private String sourceFile;
}
