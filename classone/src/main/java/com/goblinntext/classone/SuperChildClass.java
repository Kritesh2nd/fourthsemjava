package com.goblinntext.classone;
public class SuperChildClass extends SuperParentClass{
    public SuperChildClass(){
        super();
        System.out.println("calling from child class");
    }
    public void sChildMiniClass(){
        
        System.out.println("\nCalling from child class & method");
        super.sParentMiniClass();
        System.out.println("Calling from child");
    }
    public static void main(String[] args) {
        SuperChildClass scc = new SuperChildClass();
        scc.sChildMiniClass();
    }
}
