package com.Abhishek;

public class NumberExampleRecurrsion {
    public static void main(String[] args) {
    print(1);
    }
    static void print(int n){
//        base condition
        if(n == 5){
            System.out.println(5);
            return;
        }
//        recursive call
//        if base condition is not present then after computer memory full it give stack overflow error
        System.out.println(n);
        print(n + 1);
    }
}
