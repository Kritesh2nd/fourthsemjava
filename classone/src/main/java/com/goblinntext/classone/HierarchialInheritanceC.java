package com.goblinntext.classone;
public class HierarchialInheritanceC extends HierarchialInheritanceA{
    public void HiInheritanceC(){
       System.out.println("HierarchialInheritanceC");
    }
    public static void main(String[] args) {
        HierarchialInheritanceC hic = new HierarchialInheritanceC();
        hic.HiInheritanceA();
        hic.HiInheritanceC();
    }
}