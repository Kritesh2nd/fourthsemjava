package com.goblinntext.classone;
public class VariableExampleA {
    int a=1;
    static int b=1;
    public void sum(){
        int a=5;
        System.out.println("Calling form local "+a+" ");
    }
    public static void main(String[] args) {
        VariableExampleA v = new VariableExampleA();
        v.sum();
        System.out.println("Calling form instance "+v.a);
        System.out.println("Calling form static "+b);
    }
}
