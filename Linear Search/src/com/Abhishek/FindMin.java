package com.Abhishek;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 14, -17, 3, 5, 8, 19, 42};
        System.out.println("The minimum number is: "+min(arr));
    }
//    assume that arr.length != 0
//    return the minimum value
    static int min(int[] arr){
         int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
