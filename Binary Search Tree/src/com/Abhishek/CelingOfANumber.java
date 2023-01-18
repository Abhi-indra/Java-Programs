package com.Abhishek;

public class CelingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println("The element found at index: "+celing(arr, target) );
    }

//    return the smallest number >= target
    static int celing(int[] arr, int target){
//        but what if the target is greater than the greatest number in array
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
//            find the middle element
//            int mid = ((start + end)/2);might be possible (start + end) exceed the range of in in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
//                  ans found
                return mid;
            }
        }
        return start;
    }
}