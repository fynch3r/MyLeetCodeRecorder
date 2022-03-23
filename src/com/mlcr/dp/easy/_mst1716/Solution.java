package com.mlcr.dp.easy._mst1716;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/the-masseuse-lcci/
 * @author: fynch3r
 * @create: 2022-03-23 09:45
 **/


public class Solution {
    /**
     * dp[i][0] 表示当前i节点不服务的总时长，dp[i][0] = Math.max(dp[i-1][0], dp[i-1][i])
     * dp[i][1] 表示当前i节点服务的总时长，那么他前面的节点就不能服务，dp[i][1] = dp[i-1][0] + nums[i]
     */
    public int massage(int[] nums) {
        int len = nums.length;
        if(len ==0){
            return 0;
        }
        int dp0 = 0, dp1 = nums[0];
        for (int i  = 1;i<nums.length;i++) {
            int chooseGap = Math.max(dp0,dp1); // 当前节点不接单，前面节点接不接都行，选一个最大的；
            int chooseOffer = dp0+nums[i]; // 当前节点接单，前面节点不能接单，需要加上当前节点的值；
            dp0 = chooseGap;
            dp1 = chooseOffer;
        }
        return Math.max(dp0,dp1);
    }
}
