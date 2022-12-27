//Take two numbers and print the sum of both.
package com.Abhishek;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Two number for sum: ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        System.out.println("First number: " +firstNum);
        System.out.println("Second number: "+secondNum);

        int sum = firstNum + secondNum;

        System.out.print("The sum of the both number is: "+sum);

    }
}
