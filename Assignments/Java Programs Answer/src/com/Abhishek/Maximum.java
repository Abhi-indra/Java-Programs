//Take 2 numbers as input and print the largest number.
package com.Abhishek;
import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();

        System.out.println("The maximum number is: "+Math.max(num1,num2));
    }
}
