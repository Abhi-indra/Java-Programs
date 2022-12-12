package com.Abhishek;
import java.util.*;
public class NumberOccurenceCounting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : -");
        int number = input.nextInt();
        System.out.print("Enter the Number to be count: -");
        int countnumber = input.nextInt();

        int count = 0;
        while(number > 0){
            int rem = number % 10;
            if(rem ==countnumber){
                count++;
            }
                number = number/10;
        }
        System.out.println("The existence of  count number is = "+count);

    }
}
