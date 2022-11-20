package com.goblinntext.classone;
public class staticKeywordExample {
    static int a=5;
    int b=10;
    public void display(){
        System.out.println("non static");
        
        
    }
    
    public static void displayA(){
        a=7;
        System.out.println("It is satic method");
    }
    public static void main(String[] args) {
        staticKeywordExample ske = new staticKeywordExample();
        
        ske.display();
        displayA();
        System.out.println(a+" "+ske.b);
        
    }
}
