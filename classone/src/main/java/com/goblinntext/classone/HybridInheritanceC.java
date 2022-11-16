package com.goblinntext.classone;
public class HybridInheritanceC extends HybridInheritanceA{
    public void HInheritanceC(){
       System.out.println("HybridInheritanceC");
    }
    public static void main(String[] args) {
        HybridInheritanceC hc = new HybridInheritanceC();
        hc.HInheritanceA();
        hc.HInheritanceC();
    }
}