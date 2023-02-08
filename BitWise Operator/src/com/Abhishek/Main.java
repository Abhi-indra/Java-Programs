package com.Abhishek;

public class Main {

    public static void main(String[] args) {
        int n = 44;
        System.out.println(isOdd(n));

    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
