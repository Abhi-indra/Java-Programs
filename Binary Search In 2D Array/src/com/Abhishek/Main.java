package com.Abhishek;

//Binary Search in 2D arrays
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	    int[][] matrix= {
	            {12, 13, 14, 16},
                {45, 46, 47, 48},
                {78, 79, 81, 92}
        };
	    int target  = 47;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while (row<matrix.length && col >= 0){
            if(matrix[row][col] == target ){
                return new int[] {row, col};
            }
            if(matrix[row][col] < target){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
