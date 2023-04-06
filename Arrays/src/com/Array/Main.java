package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num = new int[size];


//    input
        for (int i = 0; i < num.length ; i++) {
            num[i] = in.nextInt();
        }
//       output
        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]);
        }
    }
}
