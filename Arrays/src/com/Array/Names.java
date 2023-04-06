package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = in.nextInt();
        String[] name = new String[size];

        for (int i = 0; i < name.length ; i++) {
            name[i] = in.next();
        }
        for (int i = 0; i < name.length ; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
