
package com.goblinntext.classone;

import java.util.Scanner;


public class ExceptionExmaple {
    public void displayB(int a, int b){
        
        
        try{
           
        
            int c = a/b;
        System.out.println("Result is : " +c);
        }catch(ArithmeticException e){
            System.out.println("canot divide by Zero "+e);
        }
        
        finally{
            System.out.println("It will always execute");
        }
        
    }
    public static void main(String[] args) {
        ExceptionExmaple ExceptionExmaple = new ExceptionExmaple();
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        ExceptionExmaple.displayB(a,b);
        
    }
}
