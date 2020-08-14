/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aidmax.antlr4test3;
import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import static org.antlr.v4.runtime.CharStreams.fromString;
import org.antlr.v4.runtime.tree.*;

/**
 *
 * @author Aiden
 */
public class Factory {
        public static Boolean going = true;
        public static List<String> varnames = new ArrayList<String>();
        public static List<Object> varvals = new ArrayList<Object>();
        public static Boolean toFile;
        public static List<String> compiled = new ArrayList<String>();
        public static Integer numVoids = 0;
        public static List<List<arthurParser.StartContext>> voids = new ArrayList<List<arthurParser.StartContext>>();
        
    public static void main(String[] args) throws IOException{
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Compile to file?");
        toFile = scan.nextLine().contains("y");
        //beginning compile
        if(toFile){
            compiled.add("import java.util.*;");
            compiled.add("public class Main {");
            compiled.add("public static List<String> varnames = new ArrayList<String>();");
            compiled.add("public static List<Object> varvals = new ArrayList<Object>();");
            compiled.add("public static void main(String[] args){");
        }
        System.out.println("Read from input?");
        if(scan.nextLine().contains("y")){
            //reading from user input
        while(going){
            System.out.println("Enter statement below: ");
            arthurLexer l = new arthurLexer(fromString(scan.nextLine()));
            TokenStream ts = new CommonTokenStream(l);
            arthurParser p = new arthurParser(ts);
            ParseTree tree = p.start();
            ParseTreeWalker w = new ParseTreeWalker();
            arthurVisitor visitor = new arthurBaseVisitor();
            System.out.println();
            visitor.visit(tree);
            System.out.println();
        }
        }else{
            //reading from file
            System.out.println("Enter filename: ");
            String fileN = scan.nextLine() + ".svi";
            BufferedReader toRead = new BufferedReader(new FileReader(fileN));
        while(going){
            String read = toRead.readLine();
            arthurLexer l = new arthurLexer(fromString(read));
            TokenStream ts = new CommonTokenStream(l);
            arthurParser p = new arthurParser(ts);
            ParseTree tree = p.start();
            ParseTreeWalker w = new ParseTreeWalker();
            arthurVisitor visitor = new arthurBaseVisitor();
            System.out.println();
            visitor.visit(tree);
            System.out.println();
        }
        }
        //end compile
        
        if(toFile){
            compiled.add("}}");
            new File("Main.java").delete();
            File comFile = new File("Main.java");
            FileWriter wrt = new FileWriter(comFile);
            for(int i = 0; i < compiled.size(); i++){
                System.out.println(compiled.get(i));
                wrt.append(compiled.get(i));
                wrt.append("\r\n");
            }
            wrt.close();
        }
    }
}
