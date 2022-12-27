//Take a number as input and print the multiplication table for it.
package com.Abhishek;
import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println("The Multiplication of the given Number is: ");
        for (int i = 1; i <= 10; i++) {
            int multiplication = num * i;
            System.out.println(+num+ " * " +i+ " = "+multiplication);
        }
    }
}
