package com.Abhishek;
import java.util.*;
public class Main {



    public static void main(String[] args) {
	// take input of two numbers and print the sum
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        num2 = input.nextInt();

        num3 = num1 + num2;

        System.out.print("The sum of the given Number is: ");
    }

}
