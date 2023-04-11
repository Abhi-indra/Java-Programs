package com.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {4,5,8,10,18};
        int target = 13;
        int[] ans = twoSum(num,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
