package com.Abhishek;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 8, 9},
                {12, 13, 18, 20, 24},
                {74, 88, 99, 100, 520, 54},
                {18, 12} 
        };
        int target = 99;
        int[] ans = search(arr, target);// format of return in row and col.
        System.out.println(Arrays.toString(ans));
    }
        static int[] search(int[][] arr, int target){
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                        if(arr[row][col] == target){
                            return new int[] {row,col};
                        }
                }
            }
            return new int[] {-1,-1};
        }
}
