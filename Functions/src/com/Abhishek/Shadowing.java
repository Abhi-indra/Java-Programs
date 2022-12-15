package com.Abhishek;

public class Shadowing {
    static  int x = 90; // it will shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x);// print 90
        shad();

        int x; // print 40 ("The class variable at line 4 is shadowed by this )
        //System.out.println(x); scope will begin when the value is initialized

        x = 40;
        System.out.println(x);
    }

    static void shad(){
        System.out.println(x);
    }
}
