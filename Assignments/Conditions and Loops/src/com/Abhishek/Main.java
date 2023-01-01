//Area Of Circle Java Program
package com.Abhishek;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = in.nextFloat();
        float PI  = 3.14f;
        float area = PI * radius*radius;

        System.out.println("Area of the Circle is: "+area);
    }
}
