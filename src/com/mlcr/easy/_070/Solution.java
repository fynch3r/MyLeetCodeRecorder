package com.mlcr.easy._070;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/climbing-stairs/
 * @author: fynch3r
 * @create: 2021-06-10 16:35
 **/


public class Solution {
    public int climbStairs(int n) {
        //f(x) = f(x-1)+f(x-2);
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
