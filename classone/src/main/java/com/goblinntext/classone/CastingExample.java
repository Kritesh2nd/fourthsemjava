package com.goblinntext.classone;
 public class CastingExample {
    public void WideningCasting(){
        int a=5;
        System.out.println("Before casting "+a);
        double d=a;
        System.out.println("After casting "+d);
    }
    public void NarrowCasting(){
        float myFloat = 5.3f;
        System.out.println("Before casting "+myFloat);
        int myInt = (int) myFloat;
        System.out.println("After casting "+myInt);
    }
    public static void main(String[] args) {
        CastingExample ce= new CastingExample();
        ce.WideningCasting();
        ce.NarrowCasting();
    }
}
