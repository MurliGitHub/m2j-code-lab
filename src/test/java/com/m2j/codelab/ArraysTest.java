package com.m2j.codelab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.m2j.codelab.algorithms.arrays._1TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class ArraysTest {

    @Test
    public  void testTwoSum1(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        int[] expected = {0,1};

        assertArrayEquals(expected, result);
    }
    @Test
    public  void testTwoSum2(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);

        int[] expected = {1,2};

        assertArrayEquals(expected, result);
    }

    @Test
    public  void testTwoSum3(){
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum(nums, target);

        int[] expected = {0,1};

        assertArrayEquals(expected, result);
    }

}
