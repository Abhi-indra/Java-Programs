// Pattern Question
/*
*
* *
* * *
* * * *
*/
package com.Abhishek;
public class Main {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
//            for every row run the coloumn
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
//            when one row is printed, we need to print the new line
            System.out.println();
        }
    }
}