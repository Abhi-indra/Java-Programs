package com.Abhishek;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        int ans = sum2();
        System.out.println(ans);

    }

    //return value

    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;

       return sum;

        //System.out.println("This will never execute");
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        num2 = input.nextInt();

        num3 = num1 + num2;

        System.out.print("The sum of the given Number is: " +num3);
    }
}
