//New Syntax of switch statement
            /*
                    case 1 -> System.out.println();
             */

package com.Abhishek;
import java.util.*;
public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7");
        int days = input.nextInt();

        switch (days){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }


    }
}
