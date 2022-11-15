package com.goblinntext.classone;
public class ConstructorExample {
    public ConstructorExample(){
        int c=54;
        System.out.println("helo ");
    }
    public void add(){
        System.out.println("Addition");
    }
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        ce.add();
    }
}
