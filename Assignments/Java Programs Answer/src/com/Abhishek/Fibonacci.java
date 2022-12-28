//>To calculate Fibonacci Series up to n numbers.
package com.Abhishek;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = in.nextInt();

        int previous = 0;
        int currentIndex = 1;

        for (int i = 0; i <= num; i++) {
            int temp = currentIndex;
            currentIndex = currentIndex + previous;
            previous = temp;
        }
        System.out.println("The fibonacci of given number is : " + currentIndex);
    }
}
