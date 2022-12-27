//Keep taking numbers as inputs till the user enters ‘0’, after that print sum of all.
package com.Abhishek;
import java.util.*;
public class SumOFAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter the number: ");
             int num = input.nextInt();
             if(num > 0 ){
                 sum = sum + num;
             }else {
                 System.out.println("User is entered the value 0");
             }
            System.out.println("The sum after the entered number is: " +sum);
        }
    }
}
