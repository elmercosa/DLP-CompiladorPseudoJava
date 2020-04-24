package visitor;

import ast.*;

public class PrintVisitor extends DefaultVisitor {
    //	class Program { List<Sentence> sentence; }
    public Object visit(Program node, Object param) {

        // super.visit(node, param);

        if (node.getSentence() != null)
            for (Sentence child : node.getSentence())
                child.accept(this, param);

        return null;
    }

    //	class Entero {  }
    public Object visit(Entero node, Object param) {
        System.out.print("int");
        return null;
    }

    //	class Real {  }
    public Object visit(Real node, Object param) {
        System.out.print("float");
        return null;
    }

    //	class Caracter {  }
    public Object visit(Caracter node, Object param) {
        System.out.print("char");
        return null;
    }

    //	class Clase { String name; }
    public Object visit(Clase node, Object param) {
        System.out.print(node.getName());
        return null;
    }

    //	class Array { Type tipo;  String dimension; }
    public Object visit(Array node, Object param) {
        System.out.println("[" + node.getDimension() + "]");
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
        System.out.println(" " + node.getOperator() + " ");
        if (node.getRight() != null)
            node.getRight().accept(this, param);

        return null;
    }

    //	class Comparacion { Expression left;  String operator;  Expression right; }
    public Object visit(Comparacion node, Object param) {

        // super.visit(node, param);

        if (node.getLeft() != null)
            node.getLeft().accept(this, param);
        System.out.println(" " + node.getOperator() + " ");
        if (node.getRight() != null)
            node.getRight().accept(this, param);

        return null;
    }

    //	class Logica { Expression left;  String operator;  Expression right; }
    public Object visit(Logica node, Object param) {

        // super.visit(node, param);

        if (node.getLeft() != null)
            node.getLeft().accept(this, param);
        System.out.println(" " + node.getOperator() + " ");
        if (node.getRight() != null)
            node.getRight().accept(this, param);

        return null;
    }

    //	class Invoca { String name;  List<Expression> params; }
    public Object visit(Invoca node, Object param) {
        System.out.print(node.getName()+"(");
        // super.visit(node, param);

        if (node.getParams() != null)
            for (Expression child : node.getParams()){
                child.accept(this, param);
                System.out.print(", ");
            }

        System.out.print(")");
        return null;
    }

    //	class Var { String name; }
    public Object visit(Var node, Object param) {
        System.out.print(node.getName());
        return null;
    }

    //	class LitEnt { String value; }
    public Object visit(LitEnt node, Object param) {
        System.out.print(node.getValue());
        return null;
    }

    //	class LitReal { String value; }
    public Object visit(LitReal node, Object param) {
        System.out.print(node.getValue());
        return null;
    }

    //	class LitChar { String value; }
    public Object visit(LitChar node, Object param) {
        System.out.print(node.getValue());
        return null;
    }

    //	class Negacion { Expression expr; }
    public Object visit(Negacion node, Object param) {

        System.out.print("!=");
        // super.visit(node, param);

        if (node.getExpr() != null)
            node.getExpr().accept(this, param);

        return null;
    }

    //	class Cast { Type to;  Expression from; }
    public Object visit(Cast node, Object param) {
        System.out.print("cast<");
        // super.visit(node, param);

        if (node.getTo() != null)
            node.getTo().accept(this, param);
        System.out.print(">");
        System.out.print("(");
        if (node.getFrom() != null)
            node.getFrom().accept(this, param);
        System.out.print(")");
        return null;
    }

    //	class Iarray { Expression name;  Expression index; }
    public Object visit(Iarray node, Object param) {

        // super.visit(node, param);

        if (node.getName() != null)
            node.getName().accept(this, param);
        System.out.print("[");
        if (node.getIndex() != null)
            node.getIndex().accept(this, param);
        System.out.print("]");
        return null;
    }

    //	class StructField { Expression name;  String field; }
    public Object visit(StructField node, Object param) {

        // super.visit(node, param);

        if (node.getName() != null)
            node.getName().accept(this, param);
        System.out.print(".");
        System.out.print(node.getField());
        return null;
    }

    //	class Ifelse { Expression condition;  List<Sentence> sentence;  List<Sentence> els; }
    public Object visit(Ifelse node, Object param) {

        // super.visit(node, param);
        System.out.print("if");
        System.out.print("(");
        if (node.getCondition() != null)
            node.getCondition().accept(this, param);
        System.out.println("){");
        if (node.getSentence() != null)
            for (Sentence child : node.getSentence())
                child.accept(this, param);
        System.out.print("}");
        if (node.getEls() != null && node.getEls().size() > 0){
            System.out.println("else{");
            for (Sentence child : node.getEls())
                child.accept(this, param);
            System.out.println("}");
        }else{
            System.out.println();
        }
        return null;
    }

    //	class While { Expression condition;  List<Sentence> body; }
    public Object visit(While node, Object param) {

        // super.visit(node, param);
        System.out.print("while");
        System.out.print("(");
        if (node.getCondition() != null)
            node.getCondition().accept(this, param);
        System.out.println("){");
        if (node.getBody() != null)
            for (Sentence child : node.getBody())
                child.accept(this, param);
        System.out.println("}");
        return null;
    }

    //	class Print { String tipo;  Expression expression; }
    public Object visit(Print node, Object param) {

        // super.visit(node, param);
        System.out.print(node.getTipo() + " ");
        if (node.getExpression() != null)
            node.getExpression().accept(this, param);

        return null;
    }

    //	class Read { Expression expr; }
    public Object visit(Read node, Object param) {

        // super.visit(node, param);
        System.out.print("read ");
        if (node.getExpr() != null)
            node.getExpr().accept(this, param);

        return null;
    }

    //	class Assignment { Expression var;  Expression value; }
    public Object visit(Assignment node, Object param) {

        // super.visit(node, param);

        if (node.getVar() != null)
            node.getVar().accept(this, param);
        System.out.println(" = ");
        if (node.getValue() != null)
            node.getValue().accept(this, param);

        return null;
    }

    //	class Return { Expression expression; }
    public Object visit(Return node, Object param) {

        // super.visit(node, param);
        System.out.print("return ");
        if (node.getExpression() != null)
            node.getExpression().accept(this, param);
        System.out.println(";");
        return null;
    }

    //	class ReturnVoidExpression {  }
    public Object visit(ReturnVoidExpression node, Object param) {
        return null;
    }

    //	class VarDefinition { String name;  Type tipo; }
    public Object visit(VarDefinition node, Object param) {
        System.out.print("var ");
        System.out.print(node.getName());
        System.out.print(" : ");
        // super.visit(node, param);

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        System.out.println(";");
        return null;
    }

    //	class StructFieldDefinition { String name;  Type tipo; }
    public Object visit(StructFieldDefinition node, Object param) {
        System.out.print(node.getName());
        System.out.print(" : ");

        // super.visit(node, param);

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        System.out.println(";");
        return null;
    }

    //	class FuncDefinition { String name;  List<VarDefinition> params;  Type retType;  List<Sentence> body; }
    public Object visit(FuncDefinition node, Object param) {

        // super.visit(node, param);
        System.out.print(node.getName());
        System.out.print("(");
        if (node.getParams() != null)
            for (VarDefinition child : node.getParams())
                child.accept(this, param);
        System.out.print(")");
        if (node.getRetType() != null){
            System.out.print(":");
            node.getRetType().accept(this, param);
        }
        System.out.println("{");
        if (node.getBody() != null)
            for (Sentence child : node.getBody())
                child.accept(this, param);
        System.out.println("}");
        return null;
    }

    //	class StructDefinition { String name;  List<StructFieldDefinition> fields; }
    public Object visit(StructDefinition node, Object param) {
        System.out.println("struct " + node.getName() + " {");
        // super.visit(node, param);

        if (node.getFields() != null)
            for (StructFieldDefinition child : node.getFields())
                child.accept(this, param);

        System.out.println("}");
        return null;
    }
}
