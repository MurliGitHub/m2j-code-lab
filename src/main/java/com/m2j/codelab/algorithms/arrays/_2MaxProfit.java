package com.m2j.codelab.algorithms.arrays;

import java.util.Arrays;

/*
* @See https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
* */
public class _2MaxProfit {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price-min);
            min = Math.min(min, price);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
