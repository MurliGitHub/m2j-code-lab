package com.m2j.codelab.algorithms.arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* @See https://leetcode.com/problems/two-sum/
* */
public class _1TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.get(target- nums[i]) == null){
                map.put(nums[i],i);
            }else {
                result[0] = map.get(target- nums[i]);
                result[1] = i;
                break;
            }
        }

    return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    public int[] twoSumcopied(int[] nums, int target) {
        for(int i =1;i<nums.length;i++){
            for(int j =i;j<nums.length;j++){
                if(nums[j] + nums[j-i] == target){
                    return new int[] {j,j-i};
                }
            }
        }
        return null;

    }
}
