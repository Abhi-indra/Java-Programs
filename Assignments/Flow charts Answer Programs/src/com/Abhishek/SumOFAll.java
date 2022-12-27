//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package com.Abhishek;
import java.util.*;
public class SumOFAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        while (num != 'x'){
             int sum = 0;
            sum = sum + num;
            System.out.println(sum);
        }
    }
}
