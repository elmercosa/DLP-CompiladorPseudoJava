package semantic;

import ast.*;
import main.ErrorManager;
import visitor.ContextMap;
import visitor.DefaultVisitor;

import java.util.HashMap;
import java.util.Map;

public class Identification extends DefaultVisitor {

    private ContextMap<String, VarDefinition> variables = new ContextMap<>();

    private Map<String, FuncDefinition> funciones = new HashMap<>();

    private Map<String, StructDefinition> strucs = new HashMap<>();

    private ErrorManager errorManager;

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    //	class Program { List<Def> def; }
    public Object visit(Program node, Object param) {

        // super.visit(node, param);

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
        StructDefinition struct = strucs.get(node.getName());
        predicado(struct != null, "Struct no definido "+node.getName(),node);
        node.setDefinicion(struct);
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

        FuncDefinition definicion = funciones.get(node.getName());
        predicado(definicion != null, "Funcion no definida "+node.getName(),node);
        node.setDefinicion(definicion);

        if (node.getParams() != null)
            for (Expression child : node.getParams())
                child.accept(this, param);

        return null;
    }

    //	class InvocaSent { String name;  List<Expression> params; }
    public Object visit(InvocaSent node, Object param) {

        FuncDefinition definicion = funciones.get(node.getName());
        predicado(definicion != null, "Funcion no definida "+node.getName(),node);
        node.setDefinicion(definicion);

        if (node.getParams() != null)
            for (Expression child : node.getParams())
                child.accept(this, param);

        return null;
    }

    //	class Var { String name; }
    public Object visit(Var node, Object param) {
        VarDefinition definicion = variables.getFromAny(node.getName());
        predicado(definicion != null, "Variable no definida: " + node.getName(), node);
        node.setDefinicion(definicion); // Enlazar referencia con definición
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

        if (node.getName() != null)
            node.getName().accept(this, param);

        if (node.getIndex() != null)
            node.getIndex().accept(this, param);

        return null;
    }

    //	class StructField { Expression name;  String field; }
    public Object visit(StructField node, Object param) {

        if (node.getName() != null)
            node.getName().accept(this, param);

        return null;
    }

    //	class Ifelse { Expression condition;  List<Sentence> sentence;  List<Sentence> els; }
    public Object visit(Ifelse node, Object param) {

        if(param != null){
            node.setDefinicion((FuncDefinition) param);
        }

        super.visit(node, param);

        return null;
    }

    //	class While { Expression condition;  List<Sentence> body; }
    public Object visit(While node, Object param) {

        if(param != null){
            node.setDefinicion((FuncDefinition) param);
        }

        super.visit(node, param);

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
        super.visit(node, null);

        if(param != null){
            node.setDefinicion((FuncDefinition) param);
        }

        return null;
    }

    //	class ReturnVoidExpression {  }
    public Object visit(ReturnVoidExpression node, Object param) {
        return null;
    }

    //	class VarDefinition { String name;  Type tipo; }
    public Object visit(VarDefinition node, Object param) {

        node.getTipo().accept(this, param);

        predicado(variables.getFromTop(node.getName()) == null, "Variable duplicada:"+ node.getName(), node);
        variables.put(node.getName(), node);

        return null;
    }

    //	class StructFieldDefinition { String name;  Type tipo; }
    public Object visit(StructFieldDefinition node, Object param) {

        if(param instanceof StructDefinition){
            node.setStructDefinition((StructDefinition) param);
        }

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        return null;
    }

    //	class FuncDefinition { String name;  List<VarDefinition> params;  Type retType;  List<VarDefinition> vars;  List<Sentence> body; }
    public Object visit(FuncDefinition node, Object param) {
        predicado(funciones.get(node.getName()) == null, "Funcion repetida "+node.getName(),node);
        funciones.put(node.getName(), node);
        variables.set();

        visitChildren(node.getParams(), null);
        visitChildren(node.getVars(), null);
        visitChildren(node.getBody(), node);

        variables.reset();

        if (node.getRetType() != null)
            node.getRetType().accept(this, param);

        return null;
    }

    //	class StructDefinition { String name;  List<StructFieldDefinition> fields; }
    public Object visit(StructDefinition node, Object param) {
        predicado(strucs.get(node.getName()) == null, "Struct repetido " +node.getName(), node);
        visitChildren(node.getFields(), node);
        strucs.put(node.getName(), node);
        return null;
    }

    private void predicado(boolean condition, String errorMessage, Position position) {
        if (!condition)
            errorManager.notify("Identification", errorMessage, position);
    }

    private void predicado(boolean condition, String errorMessage, AST node) {
        predicado(condition, errorMessage, node.getStart());
    }

    private void predicado(boolean condition, String errorMessage) {
        predicado(condition, errorMessage, (Position) null);
    }
}
