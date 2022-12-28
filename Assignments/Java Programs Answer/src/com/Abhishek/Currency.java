//Input currency in rupees and output in USD.
package com.Abhishek;
import java.util.*;
public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the currency in Rupees: ");
        int rupee = in.nextInt();
        double usd = (rupee * 0.012);

        System.out.print("The result after converting in USD is: "+usd);

    }
}
