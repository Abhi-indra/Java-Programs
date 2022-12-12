package com.Abhishek;
import java.util.*;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = input.nextInt();
        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;
        }
        System.out.println("The reverse of the given number is = "+ans);

    }
}
