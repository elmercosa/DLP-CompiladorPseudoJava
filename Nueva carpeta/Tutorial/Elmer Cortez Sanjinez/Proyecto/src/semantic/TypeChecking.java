/**
 * Tutorial de Diseño de Lenguajes de Programación
 *
 * @author Raúl Izquierdo
 */

package semantic;

import ast.*;
import main.ErrorManager;
import visitor.DefaultVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class TypeChecking extends DefaultVisitor {

    private Type[] tiposSimples = {new Entero(), new Real(), new Caracter()};

    public TypeChecking(ErrorManager errorManager) {
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

    ///////  VARIABLES  ///////

    //	class VarDefinition { String name;  Type tipo; }
    public Object visit(VarDefinition node, Object param) {

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        return null;
    }

    //	class Var { String name; }
    public Object visit(Var node, Object param) {
        node.setType(node.getDefinicion().getTipo());
        node.setModificable(true);
        return null;
    }

    ///////  FUNCIONES  ///////

    //	class FuncDefinition { String name;  List<VarDefinition> params;  Type retType;  List<VarDefinition> vars;  List<Sentence> body; }
    public Object visit(FuncDefinition node, Object param) {

        // super.visit(node, param);

        visitChildren(node.getParams(), param);

        node.getParams().forEach(x -> predicado(!tipoSimple(x.getTipo()), "Los parámetros deben de ser tipos primitivos", node));

        if (node.getRetType() != null)
            node.getRetType().accept(this, param);

        predicado(!tipoSimple(node.getRetType()), "Error: retorno de tipo no simple", node);

        visitChildren(node.getVars(), param);
        visitChildren(node.getBody(), param);

        List<Sentence> rets = node.getBody().stream().filter(x -> x.getClass() == Return.class).collect(Collectors.toList());

        List<Sentence> ifElses = node.getBody().stream().filter(x -> x.getClass() == Ifelse.class).collect(Collectors.toList());

        for (Sentence ifelse: ifElses) {
            Ifelse ifelse1 = (Ifelse)ifelse;
            if(ifelse1.getSentence() != null){
                rets.addAll(((Ifelse)ifelse).getSentence().stream().filter(x -> x.getClass() == Return.class).collect(Collectors.toList()));
            }
            if(ifelse1.getEls() != null){
                rets.addAll(((Ifelse)ifelse).getEls().stream().filter(x -> x.getClass() == Return.class).collect(Collectors.toList()));
            }
        }

        List<Sentence> whiles = node.getBody().stream().filter(x -> x.getClass() == While.class).collect(Collectors.toList());
        for (Sentence aWhile : whiles) {
            While aWhile1 = ((While)aWhile);
            if(aWhile1.getBody() != null){
                rets.addAll(((While)aWhile).getBody().stream().filter(x -> x.getClass() == Return.class).collect(Collectors.toList()));
            }
        }
        predicado(node.getRetType().getClass() != VoidType.class || rets.size() == 0, "El return no debe tener expresión en funciones void", node);
        rets.forEach(x -> predicado(x.getClass() == node.getRetType().getClass(), "Tipo de retorno no coincide", x));
        return null;
    }

    //	class InvocaExpr { String name;  List<Expression> params; }
    public Object visit(InvocaExpr node, Object param) {
        super.visit(node, param);
        predicado(node.getDefinicion().getParams().size() == node.getParams().size(), "Número de argumentos no coincide", node);
        predicado(node.getDefinicion().getRetType().getClass() != VoidType.class, "No tiene tipo de retorno", node);
        node.setType(node.getDefinicion().getRetType());
        if (node.getDefinicion().getParams().size() == node.getParams().size()) {
            for (int i = 0; i < node.getDefinicion().getParams().size(); i++) {
                predicado(mismoTipo(node.getDefinicion().getParams().get(i).getTipo(), node.getParams().get(i).getType()), "Tipo de los parámetros no coincide", node);
            }
        }
        return null;
    }

    //	class InvocaSent { String name;  List<Expression> params; }
    public Object visit(InvocaSent node, Object param) {

        super.visit(node, param);
        predicado(node.getDefinicion().getParams().size() == node.getParams().size(), "Número de argumentos no coincide", node);
        node.setType(node.getDefinicion().getRetType());
        if (node.getDefinicion().getParams().size() == node.getParams().size()) {
            for (int i = 0; i < node.getDefinicion().getParams().size(); i++) {
                predicado(mismoTipo(node.getDefinicion().getParams().get(i).getTipo(), node.getParams().get(i).getType()), "Tipo de los parámetros no coincide", node);
            }
        }
        return null;
    }

    ///////  STRUCT  ///////

    //	class StructDefinition { String name;  List<StructFieldDefinition> fields; }
    public Object visit(StructDefinition node, Object param) {

        if (node.getFields() != null)
            for (StructFieldDefinition child : node.getFields())
                child.accept(this, param);

        return null;
    }

    //	class StructFieldDefinition { String name;  Type tipo; }
    public Object visit(StructFieldDefinition node, Object param) {

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        return null;
    }

    //	class StructField { Expression name;  String field; }
    public Object visit(StructField node, Object param) {
        super.visit(node, param);

        predicado(node.getName().getType().getClass() == Clase.class, "Debe ser tipo struct", node);
        predicado(node.getDefinicion() != null, "Campo no definido", node);

        if (node.getDefinicion() != null) {
            node.setType(node.getDefinicion().getTipo());
        }
        node.setModificable(true);
        return null;

    }

    ///////  ARRAY  ///////

    //	class Array { Type tipo;  String dimension; }
    public Object visit(Array node, Object param) {

        if (node.getTipo() != null)
            node.getTipo().accept(this, param);

        return null;
    }

    //	class Iarray { Expression name;  Expression index; }
    public Object visit(Iarray node, Object param) {

        super.visit(node, param);
        predicado(node.getName().getType().getClass() == ast.Array.class, "Debe ser tipo array", node);
        predicado(node.getIndex().getType().getClass() == ast.Entero.class, "Debe ser indice entero", node);
        if (node.getName().getType() instanceof Array) {
            Array array = (Array) node.getName().getType();
            node.setType(array.getTipo());
            node.setModificable(true);
        } else {
            node.setType(node.getName().getType());
            node.setModificable(true);
        }
        return null;
    }

    ///////  READ  ///////

    //	class Read { Expression expr; }
    public Object visit(Read node, Object param) {

        super.visit(node, param);
        predicado(!tipoSimple(node.getExpr().getType()), "Debe ser un tipo simple", node);
        predicado(node.getExpr().isModificable(), "Se requiere expresión modificable", node.getExpr());

        return null;
    }

    ///////  PRINT  ///////

    //	class Print { Expression expression; }
    public Object visit(Print node, Object param) {

        // super.visit(node, param);

        if (node.getExpression() != null)
            node.getExpression().accept(this, param);

        predicado(node.getExpression().getType() != null && !tipoSimple(node.getExpression().getType()), "Debe ser un tipo simple", node);
        return null;
    }

    //	class Printsp { Expression expression; }
    public Object visit(Printsp node, Object param) {

        // super.visit(node, param);

        if (node.getExpression() != null)
            node.getExpression().accept(this, param);

        predicado(node.getExpression().getType() != null && !tipoSimple(node.getExpression().getType()), "Debe ser un tipo simple", node);
        return null;
    }

    //	class Println { Expression expression; }
    public Object visit(Println node, Object param) {

        // super.visit(node, param);

        if (node.getExpression() != null)
            node.getExpression().accept(this, param);

        predicado(node.getExpression().getType() != null && !tipoSimple(node.getExpression().getType()), "Debe ser un tipo simple", node);
        return null;
    }

    ///////  ASSIGNMENT  ///////

    //	class Assignment { Expression var;  Expression value; }
    public Object visit(Assignment node, Object param) {
        super.visit(node, param);
        predicado(mismoTipo(node.getVar(), node.getValue()), "Los operandos deben ser del mismo tipo", node);
        predicado(!tipoSimple(node.getVar().getType()), "Valor de la izquierda debe ser simple", node);
        predicado(node.getVar().isModificable(), "Se requiere expresión modificable", node.getVar());
        return null;
    }

    ///////  IFELSE  ///////

    //	class Ifelse { Expression condition;  List<Sentence> sentence;  List<Sentence> els; }
    public Object visit(Ifelse node, Object param) {
        super.visit(node, param);
        predicado(mismoTipo(node.getCondition().getType(), new Entero()), "La condicion debe ser de tipo entero", node);
        return null;
    }

    ///////  WHILE  ///////

    //	class While { Expression condition;  List<Sentence> body; }
    public Object visit(While node, Object param) {
        super.visit(node, param);
        predicado(mismoTipo(node.getCondition().getType(), new Entero()), "La condicion debe ser de tipo entero", node);
        return null;
    }

    ///////  CAST  ///////

    //	class Cast { Type to;  Expression from; }
    public Object visit(Cast node, Object param) {
        super.visit(node, param);
        predicado(!mismoTipo(node.getTo(), node.getFrom().getType()), "Deben ser distintos tipo", node);
        predicado(!tipoSimple(node.getTo()), "No se puede convertir a un tipo no simple", node);
        predicado(!tipoSimple(node.getFrom().getType()), "Solo se pueden convertir expresiones de tipos simples", node);
        node.setType(node.getTo());
        node.setModificable(false);
        return null;
    }

    ///////  NEGACION  ///////

    //	class Negacion { Expression expr; }
    public Object visit(Negacion node, Object param) {

        // super.visit(node, param);

        if (node.getExpr() != null)
            node.getExpr().accept(this, param);

        return null;
    }

    ///////  EXPRESIONES BINARIAS  ///////

    //	class Aritmetica { Expression left;  String operator;  Expression right; }
    public Object visit(Aritmetica node, Object param) {


        super.visit(node, param);
        predicado(mismoTipo(node.getLeft(), node.getRight()), "Los operandos deben ser del mismo tipo", node);
        predicado(!tipoSimple(node.getLeft().getType()) || !tipoSimple(node.getRight().getType()), "Deben ser tipos simples", node);
        if (!tipoSimple(node.getLeft().getType()) && !tipoSimple(node.getRight().getType())) {
            predicado(tiposComparacion(node.getLeft().getType(), node.getRight().getType()), "Los operandos deben ser de tipo real o entero", node);
        }
        node.setType(node.getLeft().getType());
        node.setModificable(false);

        return null;
    }

    //	class Comparacion { Expression left;  String operator;  Expression right; }
    public Object visit(Comparacion node, Object param) {

        super.visit(node, param);
        predicado(mismoTipo(node.getLeft().getType(), node.getRight().getType()), "Los operandos deben ser del mismo tipo", node);
        predicado(!tipoSimple(node.getLeft().getType()) || !tipoSimple(node.getRight().getType()), "Deben ser tipos simples", node);
        if (!tipoSimple(node.getLeft().getType()) && !tipoSimple(node.getRight().getType())) {
            predicado(tiposComparacion(node.getLeft().getType(), node.getRight().getType()), "Los operandos deben ser de tipo real o entero", node);
        }
        node.setType(node.getLeft().getType());
        node.setModificable(false);
        return null;
    }

    //	class Logica { Expression left;  String operator;  Expression right; }
    public Object visit(Logica node, Object param) {

        super.visit(node, param);
        predicado(mismoTipo(node.getLeft(), node.getRight()), "Los operandos deben ser del mismo tipo", node);
        predicado(mismoTipo(node.getLeft().getType(), new Entero()), "Debe de ser tipo entero", node);
        node.setType(node.getLeft().getType());
        node.setModificable(false);


        return null;
    }

    ///////  CONSTANTES  ///////

    //	class LitEnt { String value; }
    public Object visit(LitEnt node, Object param) {
        node.setType(new Entero());
        node.setModificable(false);
        return null;
    }

    //	class LitReal { String value; }
    public Object visit(LitReal node, Object param) {
        node.setType(new Real());
        node.setModificable(false);
        return null;
    }

    //	class LitChar { String value; }
    public Object visit(LitChar node, Object param) {
        node.setType(new Caracter());
        node.setModificable(false);
        return null;
    }

    //	class ReturnVoidExpression {  }
    public Object visit(ReturnVoidExpression node, Object param) {
        node.setType(new VoidType());
        node.setModificable(false);
        return null;
    }

    // --------------------------------------------------------
    // Funciones auxiliares

    private void predicado(boolean condition, String errorMessage, Position position) {
        if (!condition)
            errorManager.notify("Type Checking", errorMessage, position);
    }

    private void predicado(boolean condition, String errorMessage, AST node) {
        predicado(condition, errorMessage, node.getStart());
    }

    private void predicado(boolean condition, String errorMessage) {
        predicado(condition, errorMessage, (Position) null);
    }

    private ErrorManager errorManager;


    private boolean mismoTipo(Expression a, Expression b) {
        return (a.getType().getClass() == b.getType().getClass());
    }

    private boolean mismoTipo(Type a, Type b) {
        return (a.getClass() == b.getClass());
    }

    private boolean tipoSimple(Type a) {
        return (a.getClass() == Clase.class || a.getClass() == Array.class);
    }

    private boolean tiposComparacion(Type a, Type b) {
        return (a.getClass() == Entero.class || b.getClass() == Entero.class) || (a.getClass() == Real.class || b.getClass() == Real.class);
    }
}
