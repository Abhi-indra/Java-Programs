package com.Abhishek;
public class Pattern_5 {
    public static void main(String[] args) {
        pattern(8);
    }
    static void pattern(int n){
        for (int i = 0; i <= 2 * n; i++) {
//            for every row run the coloumn
            int totalColoumnsInRow = i > n ? 2*n-i-1 : i;
            for (int j = 0; j <= totalColoumnsInRow; j++) {
                System.out.print("* ");
            }
//            when one row is printed, we need to print the new line
            System.out.println();
        }
    }
}
