package com.goblinntext.classone;
public class MultilevelInheritanceB extends MultilevelInheritanceA{
    public void MInheritanceB(){
        System.out.println("MultilevelInheritanceB");
    }
    public static void main(String[] args) {
        MultilevelInheritanceB mib = new MultilevelInheritanceB();
        mib.MInheritanceA();
        mib.MInheritanceB();
    }
}
