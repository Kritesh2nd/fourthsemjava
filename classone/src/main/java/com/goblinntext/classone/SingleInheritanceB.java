package com.goblinntext.classone;
public class SingleInheritanceB extends SingleInheritanceA{
    public void SInheritanceB(){
        System.out.println("SingleInheritanceB");
    }
    public static void main(String[] args) {
        SingleInheritanceB sib = new SingleInheritanceB();
        sib.SInheritanceA();
        sib.SInheritanceB();
    }
}
