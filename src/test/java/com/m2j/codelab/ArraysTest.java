package com.m2j.codelab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.m2j.codelab.algorithms.arrays._1TwoSum.twoSum;
import static com.m2j.codelab.algorithms.arrays._2MaxProfit.maxProfit;
import static com.m2j.codelab.algorithms.arrays._3ContainsDuplicate.containsDuplicate;
import static com.m2j.codelab.algorithms.arrays._4ProductExceptSelf.productExceptSelf;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public  void testMaxProfits1(){
        int[] prices = {7,1,5,3,6,4};

        int result =  maxProfit(prices);

        int expected = 5;

        assertEquals(expected, result);
    }

    @Test
    public  void testMaxProfits2(){
        int[] prices = {7,6,4,3,1};

        int result =  maxProfit(prices);

        int expected = 0;

        assertEquals(expected, result);
    }

    @Test
    public  void testContainsDuplicate1(){
        int[] nums = {1,2,3,1};

        assertTrue(containsDuplicate(nums));
    }

    @Test
    public  void testContainsDuplicate2(){
        int[] nums = {1,2,3,4};

        assertFalse(containsDuplicate(nums));
    }

    @Test
    public  void testProductExceptSelf(){
        int[] nums = {1,2,3,4};
        int[] resp = productExceptSelf(nums);
        int[] output= {24,12,8,6};

       assertArrayEquals(output,resp);
    }

    @Test
    public  void testProductExceptSelf2(){
        int[] nums = {-1,1,0,-3,3};
        int[] resp = productExceptSelf(nums);
        int[] output= {0,0,9,0,0};

        assertArrayEquals(output,resp);
    }


}
