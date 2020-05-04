/**
 * Tutorial de Diseño de Lenguajes de Programación
 *
 * @author Raúl Izquierdo
 */

package codegeneration;

import ast.*;
import visitor.DefaultVisitor;

import java.util.List;

/**
 * Clase encargada de asignar direcciones a las variables.
 */
public class MemoryAllocation extends DefaultVisitor {

    private int address = 0;

    //	class Program { List<Def> def; }
    public Object visit(Program node, Object param) {

        if (node.getDef() != null)
            for (Def child : node.getDef())
                child.accept(this, param);

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

    //	class InvocaExpr { String name;  List<Expression> params; }
    public Object visit(InvocaExpr node, Object param) {

        if (node.getParams() != null)
            for (Expression child : node.getParams())
                child.accept(this, param);

        return null;
    }

    //	class InvocaSent { String name;  List<Expression> params; }
    public Object visit(InvocaSent node, Object param) {

        if (node.getParams() != null)
            for (Expression child : node.getParams())
                child.accept(this, param);

        return null;
    }

    //	class Var { String name; }
    public Object visit(Var node, Object param) {
        return null;
    }

    //	class LitEnt { String value; }
    public Object visit(LitEnt node, Object param) {
        return null;
    }

    //	class LitReal { String value; }
    public Object visit(LitReal node, Object param) {
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

    //	class Print { Expression expression; }
    public Object visit(Print node, Object param) {

        // super.visit(node, param);

        if (node.getExpression() != null)
            node.getExpression().accept(this, param);

        return null;
    }

    //	class Printsp { Expression expression; }
    public Object visit(Printsp node, Object param) {

        // super.visit(node, param);

        if (node.getExpression() != null)
            node.getExpression().accept(this, param);

        return null;
    }

    //	class Println { Expression expression; }
    public Object visit(Println node, Object param) {

        // super.visit(node, param);

        if (node.getExpression() != null)
            node.getExpression().accept(this, param);

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

        // super.visit(node, param);

        if (node.getVar() != null)
            node.getVar().accept(this, param);

        if (node.getValue() != null)
            node.getValue().accept(this, param);

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

        if (node.getScope().equals("global")) {
            node.setAddress(address);
            address += node.getTipo().getSize();
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
            for (int i = 0; i < node.getParams().size(); i++) {
                node.getParams().get(i).accept(this, param);
                node.getParams().get(i).setAddress(calcularBPParam(node.getParams(), i));
            }

        if (node.getRetType() != null)
            node.getRetType().accept(this, param);

        if (node.getVars() != null)
            for (int i = 0; i < node.getVars().size(); i++) {
                node.getVars().get(i).accept(this, param);
                node.getVars().get(i).setAddress(calcularBPLocal(node.getVars(), i));
            }

        if (node.getBody() != null)
            for (Sentence child : node.getBody())
                child.accept(this, param);

        return null;
    }

    private int calcularBPLocal(List<VarDefinition> vars, int index) {
        int size = 0;

        for (int i = 0; i < index + 1; i++) {
            size -= vars.get(i).getTipo().getSize();
        }
        return size;
    }

    private int calcularBPParam(List<VarDefinition> params, int index) {
        int size = 0;

        for (int i = index +1; i < params.size(); i++) {
            size += params.get(i).getTipo().getSize();
        }

        return 4 + size;
    }

    //	class StructDefinition { String name;  List<StructFieldDefinition> fields; }
    public Object visit(StructDefinition node, Object param) {

        int adresssStruct = 0;

        if (node.getFields() != null)
            for (StructFieldDefinition child : node.getFields()) {
                child.setAddress(address+adresssStruct);
                adresssStruct += child.getTipo().getSize();
                child.accept(this, param);
            }

//        address += adresssStruct;
        return null;
    }

}
