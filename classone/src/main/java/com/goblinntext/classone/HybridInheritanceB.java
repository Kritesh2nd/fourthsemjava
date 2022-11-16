package com.goblinntext.classone;
public class HybridInheritanceB extends HybridInheritanceA{
    public void HInheritanceB(){
       System.out.println("HybridInheritanceB");
    }
    public static void main(String[] args) {
        HybridInheritanceB hb = new HybridInheritanceB();
        hb.HInheritanceA();
        hb.HInheritanceB();
    }
}