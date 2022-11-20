package com.goblinntext.classone;
public class EncapsulationExample1 {
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public static void main(String[] args) {
        EncapsulationExample1 ee1 = new EncapsulationExample1();
        System.out.println("Setting name & id");
        ee1.setName("Blue");
        ee1.setId(121);
        System.out.println("Getting name & id");
        System.out.println("Name is "+ee1.getName());
        System.out.println("Id is "+ee1.getId());
    }
}
