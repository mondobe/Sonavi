import java.util.*;
public class Main {
public static List<String> varnames = new ArrayList<String>();
public static List<Object> varvals = new ArrayList<Object>();
public static void main(String[] args){
varnames.add("count");
varvals.add(0f);
varnames.add("show");
varvals.add(0f);
varnames.add("fizz");
varvals.add(new Thread( 
new Runnable() { 
public void run() {
 varvals.set(varnames.indexOf("show"), "fizz");
}}));
varnames.add("buzz");
varvals.add(new Thread( 
new Runnable() { 
public void run() {
 varvals.set(varnames.indexOf("show"), "buzz");
if (((Float)varvals.get(varnames.indexOf("count"))%(Float)3f) == 0f){
Thread l = (Thread)new Thread( 
new Runnable() { 
public void run() {
 varvals.set(varnames.indexOf("show"), "fizzbuzz");
}});
l.run();
while(l.isAlive());
}
}}));
varnames.add("r");
varvals.add(new Thread( 
new Runnable() { 
public void run() {
 varvals.set(varnames.indexOf("count"), ((Float)varvals.get(varnames.indexOf("count"))+(Float)1f));
varvals.set(varnames.indexOf("show"), varvals.get(varnames.indexOf("count")));
if (((Float)varvals.get(varnames.indexOf("count"))%(Float)3f) == 0f){
Thread l = (Thread)varvals.get(varnames.indexOf("fizz"));
l.run();
while(l.isAlive());
}
if (((Float)varvals.get(varnames.indexOf("count"))%(Float)5f) == 0f){
Thread l = (Thread)varvals.get(varnames.indexOf("buzz"));
l.run();
while(l.isAlive());
}
System.out.println(varvals.get(varnames.indexOf("show")));
}}));
for(int o = 0; o < (Float)50f; o++){
Thread l = (Thread)varvals.get(varnames.indexOf("r"));
l.run();
while(l.isAlive());
}
}}
