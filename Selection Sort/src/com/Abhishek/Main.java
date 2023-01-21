//Selection Sort
package com.Abhishek;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	    int[] arr = {5, 4, 6, 8, 1, 9};
	    selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
//            find the max item in the array & swap with correct Index
            int last_Index = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last_Index);
            swap(arr, maxIndex, last_Index);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
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
