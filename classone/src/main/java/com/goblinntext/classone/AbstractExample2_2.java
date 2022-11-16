package com.goblinntext.classone;
public class AbstractExample2_2 extends AbstractExample2{    
    @Override
    float rateOfInterest(){
        return 5.5f;
    }
    public static void main(String[] args) {
        AbstractExample2_2 ae2_2 = new AbstractExample2_2();
        System.out.println("Rate of interest "+ae2_2.rateOfInterest());
        
    }
}
