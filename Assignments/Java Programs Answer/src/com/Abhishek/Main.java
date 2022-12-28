//Write a program to print whether a number is even or odd, also take input from the user.
package com.Abhishek;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.print("The number is even: "+num);
        }else{
            System.out.print("The number is odd: "+num);
        }
    }
}
