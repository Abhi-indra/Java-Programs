package com.Abhishek;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // int a = 30; already initialized the value outside the block cannot initialized again but reassign the value
            // a = 40;
            int c= 40; //value initialized in this block, remains in this block
        }
        // System.out.println(c); // cannot use outside the block

        //scoping in loops

        for (int i = 0; i < 4; i++) {
            System.out.println(i);

        }
        //System.out.println(i); // cannot access
    }
    static void main(int marks){
        int num = 67;

        System.out.println(num);
        System.out.println(marks);
    }
}
