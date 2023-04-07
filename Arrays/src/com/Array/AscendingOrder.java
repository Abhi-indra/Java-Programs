package com.Array;
import java.util.*;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an Array:- ");
        int size = in.nextInt();
        int[] number = new int[size];
//        input
        for (int i = 0; i < number.length; i++) {
            number[i] = in.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < number.length-1; i++) {
            if (number[i] > number[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if(isAscending){
            System.out.println("Array is sorted.");
        }else{
            System.out.println("Array is not Sorted.");
        }

    }
}
