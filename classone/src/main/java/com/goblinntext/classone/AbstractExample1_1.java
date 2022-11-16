package com.goblinntext.classone;
public class AbstractExample1_1 extends AbstractExample1{    
    @Override
    void displayColor(){
        System.out.println("Display red: ");
    }
    public static void main(String[] args) {
        AbstractExample1_1 ae1_1 = new AbstractExample1_1();
        ae1_1.displayColor();
        ae1_1.displayName();
    }
}
