package com.Abhishek;
public class Pattern_3 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
//            for every row run the coloumn
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
//            when one row is printed, we need to print the new line
            System.out.println();
        }
    }
}
