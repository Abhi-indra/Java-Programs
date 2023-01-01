//Fibonacci
package com.Abhishek;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= num){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The factorial of the number is: "+b);
    }
}
