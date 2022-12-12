package com.Abhishek;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num = input.nextInt();

        int previous = 0;
        int currentIndex = 1;
        int count = 2;

        while(count <= num){
            int temp = currentIndex;
            currentIndex = currentIndex + previous;
            previous = temp;
            count++;
        }
        System.out.println("The fibonacci of given number is : "+currentIndex);
    }
}
