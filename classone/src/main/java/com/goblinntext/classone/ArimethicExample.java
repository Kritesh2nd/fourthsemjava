package com.goblinntext.classone;

import java.util.Scanner;

public class ArimethicExample {
    public void arithmeticEx(){
        int a=5;
        int b=5;
        int c=a+b;
        System.out.println("Sum is: "+(a+b));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition is "+(a+b));
    }
    public static void main(String[] args) {
        ArimethicExample ae = new ArimethicExample();
        ae.arithmeticEx();
    }
}
