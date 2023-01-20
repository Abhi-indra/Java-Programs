//Bubble Sort
package com.Abhishek;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 3 ,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
//        run this steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            for each step max element will come at last index
            for (int j = 1; j <= arr.length - i - 1; j++) {
//      swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
//            if you don swap particular value of a i, it means that the array is sorted stop the program

            if (!swapped) break;
        }
    }
}
