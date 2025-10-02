package com.m2j.codelab.algorithms.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _3ContainsDuplicate {

    public static boolean containsDuplicateMap(int[] nums) {

        Map<Integer, Boolean> map = new HashMap<>();

        for (int num:nums){
            if(map.get(num) == null)
                map.put(num, true);
            else
                return true;

        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num:nums){
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }
}
