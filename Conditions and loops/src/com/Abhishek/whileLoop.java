//Syntax:-
            /*
            while(condition){
                 //body
              }
             */
package com.Abhishek;
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = input.nextInt();

        int i = 1;
        while(i <= num) {
            System.out.print(i + " ");
            i++;
        }
    }
}
