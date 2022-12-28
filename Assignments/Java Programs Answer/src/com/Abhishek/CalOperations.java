//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.Abhishek;
import java.util.*;
public class CalOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter the operator(+,-,*,/): ");
        char op = in.next().trim().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/'){
            System.out.print("Enter the first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = in.nextInt();
            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '/') {
                ans = num1 / num2;
            }
            System.out.println("The result is: "+ans);
        }
    }
}
