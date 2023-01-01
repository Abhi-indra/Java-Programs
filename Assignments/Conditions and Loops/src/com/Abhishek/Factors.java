//Factors of the Number
package com.Abhishek;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = in.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
