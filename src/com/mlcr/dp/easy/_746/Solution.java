package com.mlcr.dp.easy._746;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 * @author: fynch3r
 * @create: 2022-03-22 19:05
 **/


public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
