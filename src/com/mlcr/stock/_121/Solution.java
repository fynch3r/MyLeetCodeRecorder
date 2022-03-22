package com.mlcr.stock._121;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/ 买卖股票的最佳时机
 * @author: fynch3r
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

    // 最大连续子序列版本
    public int maxProfitPro(int[] prices) {
        int length = prices.length;
        int[] dp = new int[length];
        dp[0] = 0;
        int maxProfit = 0;
        for(int i =1;i<length;i++){
            int diff = prices[i]-prices[i-1];
            dp[i] = Math.max(dp[i-1]+diff,0);
            maxProfit = Math.max(maxProfit,dp[i]);
        }
        return maxProfit;
    }

}
