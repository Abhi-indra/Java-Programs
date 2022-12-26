package com.Abhishek;
import java.util.Scanner;
public class MaximumValueInArray {
    public static void main(String[] args) {
        int[] arr = {7,8,52,96,65,45};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
