package com.goblinntext.classone;
public class HierarchialInheritanceB extends HierarchialInheritanceA{
    public void HiInheritanceB(){
       System.out.println("HierarchialInheritanceB");
    }
    public static void main(String[] args) {
        HierarchialInheritanceB hib = new HierarchialInheritanceB();
        hib.HiInheritanceA();
        hib.HiInheritanceB();
    }
}