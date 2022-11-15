package com.goblinntext.classone;

import java.util.Scanner;

public class StringExample {
    public void ComparingStrings(){
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "java";
        System.out.println("Noraml comparision "+s1.equals(s3));
        System.out.println("Comparing by ignoring case "+s1.equalsIgnoreCase(s3));
        
    }
    public static void main(String[] args) {
        StringExample se = new StringExample();
        se.ComparingStrings();
    }
}
