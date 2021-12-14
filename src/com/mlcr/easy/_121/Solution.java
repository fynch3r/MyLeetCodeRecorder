package com.mlcr.easy._121;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * @author: 0range
 * @create: 2021-06-10 20:06
 **/


public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
