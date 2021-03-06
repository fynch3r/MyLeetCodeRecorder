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
        if(len == 0){
            return 0;
        }else if(len ==1){
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[0],nums[1]);
        for(int i = 2;i<len;i++){
            int temp = second;
            second = Math.max(first+nums[i],second);
            first = temp;
        }
        return second;
    }
}
