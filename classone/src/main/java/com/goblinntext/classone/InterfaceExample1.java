package com.goblinntext.classone;
public class InterfaceExample1 implements InterfaceExample1A{
    public int getRateOfInterest(){
        return 5;
    }
    public static void main(String[] args) {
        InterfaceExample1 ie1 = new InterfaceExample1();
        System.out.println("Interest rate interface "+ie1.getRateOfInterest());
        
    }
}
