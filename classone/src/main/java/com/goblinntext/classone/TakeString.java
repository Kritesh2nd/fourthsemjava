package com.goblinntext.classone;

import java.util.Scanner;

public class TakeString {
    public void InputStringEx(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of week ");
        String week = sc.nextLine();
        switch (week){
            case "sunday" -> System.out.println("It is sunday");
            case "monday" -> System.out.println("It is monday");
            case "tuesday" -> System.out.println("It is tuesday");
            case "wednesday" -> System.out.println("It is wednesday");
            case "thrusday" -> System.out.println("It is thrusday");
            case "friday" -> System.out.println("It is friday");
            case "saturday" -> System.out.println("It is saturday");
            default -> System.out.println("No option is selected");
        }
    }
    public static void main(String[] args) {
        TakeString ts = new TakeString();
        ts.InputStringEx();
    }
}
