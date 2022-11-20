package com.goblinntext.classone;
public class EncapsulationExample2 {
    private int id;
    private String name;
    public EncapsulationExample2(String name, int id){
        this.name=name;
        this.id=id;
    }
    public static void main(String[] args) {
        EncapsulationExample2 ee2 = new EncapsulationExample2("Red",120);
        System.out.println("Name is "+ee2.name);
        System.out.println("Id is "+ee2.id);
    }
}
