package com.Abhishek;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
                1 2 3
                4 5 6
                7 8 9

                Syntax:-
                data_type[][] variable_name = new data_type[row][column]
                            or
                data_type[][] variable_name;
                variable_name = new data_type[row][coloumn] // numbers of rows is mandatory

                int[][] arr = new int[3][3];

                int[][] arr = {
                        {1,2,3}, // 0th index
                        {4,5,6}, // 1st index
                        {7,8,9} //  2nd index arr[2] = {7, 8, 9}
                };
         */

        // input
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
    // Output
//        for (int row = 0; row < arr.length; row++) {
//            //for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
