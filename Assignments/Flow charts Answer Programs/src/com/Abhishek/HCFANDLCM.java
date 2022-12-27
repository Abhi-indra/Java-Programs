//Take 2 numbers as inputs and find their HCF and LCM.
package com.Abhishek;
import java.util.*;
public class HCFANDLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp1, temp2, num1, num2, temp, hcf, lcm;

        System.out.println("Enter the two numbers: ");
         num1 = input.nextInt();
         num2 = input.nextInt();

         temp1 = num1;
         temp2 = num2;

         while (temp2 != 0){
             temp = temp2;
             temp2 = temp1 % temp2;
             temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.println("HCF of input numbers: "+hcf);
        System.out.println("LCM of input numbers: "+lcm);
    }
}
