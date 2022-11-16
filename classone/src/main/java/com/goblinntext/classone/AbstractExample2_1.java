package com.goblinntext.classone;
public class AbstractExample2_1 extends AbstractExample2{    
    @Override
    float rateOfInterest(){
        return 5.6f;
    }
    public static void main(String[] args) {
        AbstractExample2_1 ae2_1 = new AbstractExample2_1();
        AbstractExample2_2 ae2_2 = new AbstractExample2_2();
        System.out.println("Rate of interest of Nic "+ae2_1.rateOfInterest());
        System.out.println("Rate of interest of Nmb "+ae2_2.rateOfInterest());
        
    }
}
