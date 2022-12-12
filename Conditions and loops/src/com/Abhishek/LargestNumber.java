package com.Abhishek;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the three number:- ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        System.out.println("The first number is = "+firstNumber);
        System.out.println("The second number is = "+secondNumber);
        System.out.println("The third number is = "+thirdNumber);

        if(firstNumber > secondNumber){
            System.out.println("The largest number is First Number = "+firstNumber);
        }else if(secondNumber > thirdNumber){
            System.out.println("The largest number is Second Number = "+secondNumber);
        }else{
            System.out.println("The largest number is Third Number = "+thirdNumber);
        }

    }
}
