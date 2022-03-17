package com.mlcr.easy._122;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * @author: fynch3r
 * @create: 2021-06-10 23:32
 **/


public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int tempProfit = prices[i] - prices[i - 1];
            //收获所有的利润
            if (tempProfit > 0) {
                profit += tempProfit;
            }
        }
        return profit;
    }
}
