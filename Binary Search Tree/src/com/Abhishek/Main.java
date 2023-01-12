package com.Abhishek;

public class Main {

    public static void main(String[] args) {
	int[] arr = {2, 3, 4, 15, 18, 20, 30, 50, 80};
	int target = 20;
        System.out.println("The element found at index: "+binarySearch(arr, target) );
    }
//    return the index
//    return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}
