//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.Abhishek;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        long principal = in.nextLong();
        System.out.print("Enter the time as considered as in year : ");
        int time  = in.nextInt();
        System.out.print("Enter the rate in interest: ");
        int rate = in.nextInt();

        long simple_interest = (principal * rate * time);

        System.out.println("The simple interest of the given amount is: "+simple_interest);

    }
}
