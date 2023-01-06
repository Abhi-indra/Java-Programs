//Search In Range
package com.Abhishek;
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 14, -17, 3, 5, 8, 19, 42};
        int target = 5;
        System.out.println("The result is: "+linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        //otherwise we run for loop
        for (int index = start; index <= end ; index++) {
            int element = arr[index];
            if(element == target) return index;
        }
        //this is execute when none of the above statement is execute
        return -1;
    }
}
