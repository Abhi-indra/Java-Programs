package com.Array;
import java.util.*;
public class MaxAndMinInAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array:-");
        int size = in.nextInt();

        int[] arr = new int[size];
//        input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Value:= "+max);
        System.out.print("Minimum Value:= "+min);

    }
}
