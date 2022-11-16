package com.goblinntext.classone;
public class MultilevelInheritanceC extends MultilevelInheritanceB{
    public void MInheritanceC(){
        System.out.println("MultilevelInheritanceC");
    }
    public static void main(String[] args) {
        MultilevelInheritanceC mic = new MultilevelInheritanceC();
        mic.MInheritanceA();
        mic.MInheritanceB();
        mic.MInheritanceC();
    }
}
