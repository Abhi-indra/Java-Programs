// Input a year and find whether it is a leap year or not.
package com.Abhishek;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number in Year format YYYY : ");
        int year = input.nextInt();
        if(year % 4 == 0){
            System.out.println("The given Year is a Leap Year : " + year + ",because It is divisible by 4.");
        }else{
            System.out.println("The given Year is not a Leap Year : " + year + ",beacause it is not divisible by 4.");
        }
    }
}
