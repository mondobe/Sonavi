package com.aidmax.antlr4test3;
// Generated from arthur.g4 by ANTLR 4.7
import static java.lang.Integer.parseInt;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * This class provides an empty implementation of {@link arthurVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class arthurBaseVisitor extends AbstractParseTreeVisitor implements arthurVisitor {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
        @Override public Object visitStart(arthurParser.StartContext ctx) {  
            return visitChildren(ctx);
        }
    
	@Override public Object visitBoolOp(arthurParser.BoolOpContext ctx) {  
            if(Factory.toFile) return (visit(ctx.left) + " == " + visit(ctx.right)); else return visit(ctx.left).equals(visit(ctx.right));
        }

        @Override public Object visitGetVar(arthurParser.GetVarContext ctx){ 
            if(Factory.toFile) return "varvals.get(varnames.indexOf(\"" + ctx.name.getText() + "\"))"; else return Factory.varvals.get(Factory.varnames.indexOf(ctx.name.getText()));
        }
        
        @Override public Boolean visitSetVar(arthurParser.SetVarContext ctx){ 
            if(Factory.varnames.contains(ctx.name.getText())){
                if(Factory.toFile) Factory.compiled.add("varvals.set(varnames.indexOf(\"" + ctx.name.getText() + "\"), " + visit(ctx.exp) + ");");
                else Factory.varvals.set(Factory.varnames.indexOf(ctx.name.getText()), visit(ctx.exp));
            }else{
                if(Factory.toFile){
                    Factory.compiled.add("varnames.add(\"" + ctx.name.getText() + "\");");
                    Factory.compiled.add("varvals.add(" + visit(ctx.exp) + ");");
                }else{
                Factory.varvals.add(visit(ctx.exp));
                }
                Factory.varnames.add(ctx.name.getText());
            }
            return true;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitParen(arthurParser.ParenContext ctx) { 
            return visit(ctx.exp); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitString(arthurParser.StringContext ctx) {
            return ctx.exp.getText(); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBasicNum(arthurParser.BasicNumContext ctx) {
            if(Factory.toFile) return ctx.getText() + "f"; else return Float.valueOf(ctx.getText()); 
        }
        @Override public Object visitBlock(arthurParser.BlockContext ctx) {
            return visit(ctx.arg);
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitCompOp(arthurParser.CompOpContext ctx) { 
            if(Factory.toFile){
                switch(ctx.oper.getText()){
                case "+": return "((Float)" + visit(ctx.left) + "+" + "(Float)" + visit(ctx.right) + ")";
                case "-": return "((Float)" + visit(ctx.left) + "-" + "(Float)" + visit(ctx.right) + ")";
                case "/": return "((Float)" + visit(ctx.left) + "/" + "(Float)" + visit(ctx.right) + ")";
                case "*": return "((Float)" + visit(ctx.left) + "*" + "(Float)" + visit(ctx.right) + ")";
                case "%": return "((Float)" + visit(ctx.left) + "%" + "(Float)" + visit(ctx.right) + ")";
                case "^": {
                    return "(float)Math.pow(new Double((float)" + visit(ctx.left) + "), new Double((float)" + visit(ctx.right) + "))";
                }
                default: return 0f;}
            }else{
            switch(ctx.oper.getText()){
                case "+": return (Float)visit(ctx.left) + (Float)visit(ctx.right);
                case "-": return (Float)visit(ctx.left) - (Float)visit(ctx.right);
                case "/": return (Float)visit(ctx.left) / (Float)visit(ctx.right);
                case "*": return (Float)visit(ctx.left) * (Float)visit(ctx.right);
                case "%": return (Float)visit(ctx.left) %(Float)visit(ctx.right);
                case "^": {
                    Double lft = (double)(float)visit(ctx.left);
                    Double rgt = (double)(float)visit(ctx.right);
                    return (float)Math.pow(lft, rgt);
                }
                default: return 0f;}
        }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitPrint(arthurParser.PrintContext ctx){ 
            if(Factory.toFile) Factory.compiled.add("System.out.println(" + visit(ctx.arg) + ");"); else System.out.println(visit(ctx.arg));
            return true; }
        
        @Override public Boolean visitStop(arthurParser.StopContext ctx){ 
            Factory.going = false;
            return true; }
        
        @Override public Boolean visitRun(arthurParser.RunContext ctx){ 
            if(Factory.toFile){
                Factory.compiled.add("Thread l" + Factory.numVoids + " = (Thread)" + visit(ctx.exp) + ";"); 
                Factory.compiled.add("l" + Factory.numVoids + ".run();"); 
                Factory.compiled.add("while(l" + Factory.numVoids + ".isAlive());"); 
            } else {
                List<arthurParser.StartContext> stList = (List<arthurParser.StartContext>) visit(ctx.exp);
                for(int i = 0; i < stList.size(); i++){
                    visit(stList.get(i));
                }
            }
            return true;
        }
        
        @Override public Boolean visitIf(arthurParser.IfContext ctx){ 
            if(Factory.toFile){
                Factory.compiled.add("if (" + visit(ctx.con) + "){"); 
                Factory.compiled.add("Thread l = (Thread)" + visit(ctx.exp) + ";"); 
                Factory.compiled.add("l.run();"); 
                Factory.compiled.add("while(l.isAlive());"); 
                Factory.compiled.add("}");
            } else {
                if((Boolean)visit(ctx.con)){
                List<arthurParser.StartContext> stList = (List<arthurParser.StartContext>) visit(ctx.exp);
                for(int i = 0; i < stList.size(); i++){
                    visit(stList.get(i));
                }
            }
            }
            return true;
        }
        
        @Override public Boolean visitRepeat(arthurParser.RepeatContext ctx){ 
            if(Factory.toFile){
            Factory.compiled.add("for(int o = 0; o < (Float)" + visit(ctx.num) + "; o++){");
            Factory.compiled.add("Thread l = (Thread)" + visit(ctx.exp) + ";"); 
            Factory.compiled.add("l.run();"); 
            Factory.compiled.add("while(l.isAlive());"); 
            Factory.compiled.add("}");
            } else {
            List<arthurParser.StartContext> stList = (List<arthurParser.StartContext>) visit(ctx.exp);
            for(int o = 0; o < (Float)visit(ctx.num); o++){
                for(int i = 0; i < stList.size(); i++){
                    visit(stList.get(i));
                }
            }
            }
            return true;
        }
        
        @Override public Object visitCodeBlock(arthurParser.CodeBlockContext ctx){ 
            if(Factory.toFile){
                int current = Factory.compiled.size();
                List<arthurParser.StartContext> stList = (List<arthurParser.StartContext>) ctx.start();
                for(int i = 0; i < stList.size(); i++){
                    visit(stList.get(i));
                }
                List<String> nonCurrent = Factory.compiled.subList(current, Factory.compiled.size());
                String tempString = new String("");
                for(String i : nonCurrent){
                    tempString += i + "\r\n";
                }
                System.out.println(nonCurrent.toString());
                List<String> lCur = Factory.compiled;
                lCur.removeIf(nonCurrent::contains);
                Factory.compiled = lCur;
                return "new Thread( \r\nnew Runnable() { \r\npublic void run() {\r\n " + tempString + "}})";
                //return "new Thread( new Runnable() { public void run() { " + "}})";
            }
            else return ctx.start();
        }
        
        
        }