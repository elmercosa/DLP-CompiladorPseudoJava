/**
 * Tutorial de Diseño de Lenguajes de Programación
 *
 * @author Raúl Izquierdo
 */

package codegeneration;

import ast.*;
import visitor.DefaultVisitor;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        instruccion.put(">", "gt");
        instruccion.put(">=", "ge");
        instruccion.put("<", "lt");
        instruccion.put("<=", "le");
        instruccion.put("==", "eq");
        instruccion.put("!=", "ne");
        instruccion.put("&&", "and");
        instruccion.put("||", "or");
        instruccion.put("!", "not");
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
        return null;
    }

    //	class VoidType {  }
    public Object visit(VoidType node, Object param) {
        return null;
    }

    //	class Aritmetica { Expression left;  String operator;  Expression right; }
    public Object visit(Aritmetica node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getLeft().accept(this, CodeFunction.VALUE);
        node.getRight().accept(this, CodeFunction.VALUE);
        out(instruccion.get(node.getOperator()), node.getType());

        return null;
    }

    //	class Comparacion { Expression left;  String operator;  Expression right; }
    public Object visit(Comparacion node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getLeft().accept(this, CodeFunction.VALUE);
        node.getLeft().accept(this, CodeFunction.VALUE);
        out(instruccion.get(node.getOperator()), node.getType());

        return null;
    }

    //	class Logica { Expression left;  String operator;  Expression right; }
    public Object visit(Logica node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getLeft().accept(this, CodeFunction.VALUE);
        node.getLeft().accept(this, CodeFunction.VALUE);
        out(instruccion.get(node.getOperator()));

        return null;
    }

    //	class InvocaExpr { String name;  List<Expression> params; }
    public Object visit(InvocaExpr node, Object param) {
        visitChildren(node.getParams(), CodeFunction.VALUE);

        out("call " + node.getName());

        return null;
    }

    //	class InvocaSent { String name;  List<Expression> params; }
    public Object visit(InvocaSent node, Object param) {

        visitChildren(node.getParams(), CodeFunction.VALUE);

        out("call " + node.getName());

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
        out("pushi " + node.getValue());
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
        assert (param == CodeFunction.VALUE);
        out("pushb " + node.getValue());
        return null;
    }

    //	class Negacion { Expression expr; }
    public Object visit(Negacion node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getExpr().accept(this, CodeFunction.VALUE);
        out(instruccion.get("!"));

        return null;
    }

    //	class Cast { Type to;  Expression from; }
    public Object visit(Cast node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getFrom().accept(this, CodeFunction.VALUE);
        out(node.getFrom().getType().getSuffix() + "2" + node.getTo().getSuffix());

        return null;
    }

    //	class Iarray { Expression name;  Expression index; }
    public Object visit(Iarray node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getName().accept(this, CodeFunction.ADDRESS);
        node.getIndex().accept(this, CodeFunction.VALUE);
        out(size(node.getName().getType()));
        out("mul");
        out("add");
        if (((CodeFunction) param) == CodeFunction.VALUE) {
            out("load", node.getName().getType());
        }

        return null;
    }

    //	class StructFieldDefinition { String name;  Type tipo; }
    public Object visit(StructFieldDefinition node, Object param) {
        if (((CodeFunction) param) == CodeFunction.VALUE) {
            visit(node, CodeFunction.ADDRESS);
        } else if (((CodeFunction) param) == CodeFunction.ADDRESS) {
            out("pusha " + node.getAddress());
        } else {
            out("\t" + node.getName() + ":" + node.getTipo().getMAPLName());
        }
        return null;
    }

    //	class StructField { Expression name;  String field; }
    public Object visit(StructField node, Object param) {
        node.getName().accept(this, CodeFunction.ADDRESS);
        if (((CodeFunction) param) == CodeFunction.VALUE) {
            out("load", node.getName().getType());
        }
        return null;
    }

    //	class Ifelse { Expression condition;  List<Sentence> sentence;  List<Sentence> els; }
    public Object visit(Ifelse node, Object param) {

        if (node.getCondition() != null)
            node.getCondition().accept(this, CodeFunction.VALUE);

        out("jz else");

        visitChildren(node.getSentence(), param);

        out("else:");

        visitChildren(node.getEls(), param);

        return null;
    }

    //	class While { Expression condition;  List<Sentence> body; }
    public Object visit(While node, Object param) {

        // super.visit(node, param);

        out("while_inicio:");

        if (node.getCondition() != null)
            node.getCondition().accept(this, CodeFunction.VALUE);

        out("jnz while_fin");

        if (node.getBody() != null)
            for (Sentence child : node.getBody())
                child.accept(this, param);

        out("while_fin:");

        return null;
    }

    //	class Print { Expression expression; }
    public Object visit(Print node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getExpression().accept(this, CodeFunction.VALUE);
        out("out", node.getExpression().getType());

        return null;
    }

    //	class Printsp { Expression expression; }
    public Object visit(Printsp node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getExpression().accept(this, CodeFunction.VALUE);
        out("out", node.getExpression().getType());

        out("push 32");
        out("outb");

        return null;
    }

    //	class Println { Expression expression; }
    public Object visit(Println node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getExpression().accept(this, CodeFunction.VALUE);
        out("out", node.getExpression().getType());
        out("push 10");
        out("outb");

        return null;
    }

    //	class Read { Expression expr; }
    public Object visit(Read node, Object param) {

        out("#line " + node.getEnd().getLine());
        node.getExpr().accept(this, CodeFunction.ADDRESS);
        out("in", node.getExpr().getType());
        out("store", node.getExpr().getType());

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
        out("#"+node.getScope()+ " " + node.getName() + ":" + node.getTipo().getMAPLName());
        return null;
    }



    //	class FuncDefinition { String name;  List<VarDefinition> params;  Type retType;  List<VarDefinition> vars;  List<Sentence> body; }
    public Object visit(FuncDefinition node, Object param) {

        out(node.getName()+":");
        out("#func "+ node.getName());

        visitChildren(node.getParams(), param);

        out("#ret " + node.getRetType().getMAPLName());

        visitChildren(node.getVars(), param);

        node.getRetType().accept(this, param);
        int tamañoVars = node.getVars().stream().mapToInt(nodeParam -> nodeParam.getTipo().getSize()).sum();
        out("enter " + tamañoVars);

        visitChildren(node.getBody(), param);

        int tamañoParams = node.getParams().stream().mapToInt(nodeParam -> nodeParam.getTipo().getSize()).sum();


        out("ret " + node.getRetType().getSize()+ ", " + tamañoVars +  ", " + tamañoParams );

        return null;
    }

    //	class StructDefinition { String name;  List<StructFieldDefinition> fields; }
    public Object visit(StructDefinition node, Object param) {

        out("#type " + node.getName() + ": {");
        visitChildren(node.getFields(), param);
        out("}");
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

    private String size(Type type) {
        return "push " + type.getSize();
    }

    private String direccionVar(VarDefinition var) {
        return "pusha " + var.getAddress();
    }

    private String direccionStructDef(StructFieldDefinition field) {
        return "pusha " + field.getAddress();
    }

    private void line(AST node) {
        line(node.getEnd());
    }


    private PrintWriter writer;
    private String sourceFile;
}
