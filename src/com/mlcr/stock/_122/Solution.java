package com.mlcr.stock._122;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/ 买卖股票的最佳时机 II
 * @author: fynch3r
 * @create: 2021-06-10 23:32
 **/


public class Solution {
    public int maxProfit(int[] prices) {
        //int profit = 0;
        //for (int i = 1; i < prices.length; i++) {
        //    int tempProfit = prices[i] - prices[i - 1];
        //    //收获所有的利润
        //    if (tempProfit > 0) {
        //        profit += tempProfit;
        //    }
        //}
        //return profit;

        /**
         * dp:
         * 每天结束，当前手里没有股票：
         *  前一天就没有 / 前一天有，但是今天卖了，获得收益
         *  dpi0 = Math.max(dp[i-1]0,dp[i-1]1+prices[i])
         * 每天结束，当前手里有股票：
         *  前一天就有 / 前一天没有，但是今天买了，损失收益
         *  dpi1 = Math.max(dp[i-1]1,dp[i-1]0-prices[i])
         *
         *  由于全部交易结束后，持有股票的收益一定低于不持有股票的收益，因此这时候dp[n−1][0]的收益必然是大于dp[n−1][1]的，最后的答案即为dp[n−1][0]。
         */

        int len = prices.length;
        int dp0 = 0;
        int dp1 = -prices[0];
        for(int i =1;i<len;i++){
            int todaydp0 = Math.max(dp0,dp1+prices[i]);
            int todaydp1 = Math.max(dp1,dp0-prices[i]);
            dp0 = todaydp0;
            dp1 = todaydp1;
        }
        return dp0;
    }
}
