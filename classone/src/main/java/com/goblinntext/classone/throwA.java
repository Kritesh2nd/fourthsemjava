
package com.goblinntext.classone;


public class throwA {
    static void throwA(int age, int height) throws ArithmeticException{
        if(age<5 && height <5){
            throw new ArithmeticException("Is not eligible ");
        }
        else{
            System.out.println("Eligible");
        }
        
    }
    
    public static void main(String[] args) {
        throwA.throwA(4,4);
    }
   
}
