//Take name as input and print a greeting message for that particular name.
package com.Abhishek;
import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Good name: ");
        String name = in.next();

        System.out.println("Hii " + name + ",You are best person in the world, Always Remember you are the reason for someone's smile :).");
    }
}
