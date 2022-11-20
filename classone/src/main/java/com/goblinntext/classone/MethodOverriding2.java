package com.goblinntext.classone;
public class MethodOverriding2 extends MethodOverriding1{
    public void sameMethod(int n){
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        MethodOverriding2 mo2 = new MethodOverriding2();
        mo2.sameMethod();
        mo2.sameMethod(1);
    }
}
