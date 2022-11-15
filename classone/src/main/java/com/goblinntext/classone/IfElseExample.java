package com.goblinntext.classone;

import java.util.Scanner;

public class IfElseExample {
    
    public void IfElseEx(){
        int a = 5;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        if(b>a){System.out.println("More than 5");}
        else if(b==a){System.out.println("Equal number");}
        else{System.out.println("Less than 5");}
    }
    public static void main(String[] args) {
        IfElseExample ife = new IfElseExample();
        ife.IfElseEx();
    }
}
