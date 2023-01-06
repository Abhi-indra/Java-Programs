//Linear Search
package com.Abhishek;
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 8 , 78, 96 , 524, 785, 78, -22};
        int target = -22;
        int ans = linearSearch(nums, target);
        System.out.println("The element status: "+ans);
    }

    //search in trh array: return the index if index is found
    //otherwise if the item is not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //otherwise we run for loop
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element == target) return index;
        }
        //this is execute when none of the above statement is execute
        return -1;
    }
}
