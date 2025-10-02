package com.m2j.codelab.algorithms.arrays;

import java.util.Arrays;

public class _4ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        result[0] = 1;

        for (int i=1; i<n; i++){
            result[i] = nums[i-1]*result[i-1];
        }


        int mult =1;
        for (int i=n-1; i>=0; i--){
            result[i] = result[i]*mult;
            mult *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       // Output: {24,12,8,6};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
