package com.Abhishek;
import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int[] arr = new int[5];
        arr[0] = 45;
        arr[1] = 47;
        arr[2] = 48;
        arr[3] = 49;
        arr[4] = 50;
       //[45, 46, 47, 48, 49]
        System.out.println(arr[3]);

        //input using for loop
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));// Array.toString is a method
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]);
//        }
//        for (int num : arr) { // for every element in array, print the element
//            System.out.print(num + " ");// here num represent the element of array
//        }
    }
}
