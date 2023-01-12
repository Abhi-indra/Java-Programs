package com.Abhishek;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 18, 35, 60, 19, 81, 65, 89, 99, 5, 18, 20, 30, 50, 80};
        int target = 89;
        System.out.println("The element found at index: "+orderAgnosticBS(arr, target) );
    }
    static  int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//  find weather the order is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
//            find the middle element
//            int mid = ((start + end)/2);might be possible (start + end) exceed the range of in in java
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else
            if(target > arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }
        return -1;

    }
}
