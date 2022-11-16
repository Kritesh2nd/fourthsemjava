package com.goblinntext.classone;
public class HybridInheritanceD extends HybridInheritanceC{
    public void HInheritanceD(){
       System.out.println("HybridInheritanceD");
    }
    public static void main(String[] args) {
        HybridInheritanceD hd = new HybridInheritanceD();
        hd.HInheritanceA();
        hd.HInheritanceC();
        hd.HInheritanceD();
    }
}