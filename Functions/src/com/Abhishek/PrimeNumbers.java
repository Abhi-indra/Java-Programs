package com.Abhishek;
import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean ans  = primeNumber(num);
        System.out.println(ans);
    }
    static boolean primeNumber(int num){
        if(num < 1){
            return false;
        }
        int c = 2;
        while(c* c <= num){
            if(num % 2 == 0){
                return false;
            }
            c++;
        }
        if(c*c > num){
            return true;
        }
        return false;
    }
}
