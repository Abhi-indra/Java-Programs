//Area Of Triangle
package com.Abhishek;
import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Height: ");
        float height = in.nextFloat();
        System.out.print("Enter the base: ");
        float base = in.nextFloat();

        float area = ((height*base)/2);

        System.out.println("Area of Triangle is: "+area);
    }
}
