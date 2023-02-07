package com.Abhishek;

public class Main {

    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }
//    Program of Fibonacci Series using Golden Ratio
    static int fiboFormula(int n){
        // just for demo, use long instead
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

}
