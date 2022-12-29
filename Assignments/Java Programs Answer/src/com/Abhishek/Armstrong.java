//To find Armstrong Number between two given number.
package com.Abhishek;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int original = num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem*rem*rem;

        }
        if(sum == original){
            System.out.println("The number is Armstrong number");
        }else{
            System.out.println("The number is not an Armstrong number: ");
        }
    }
}
