package com.mlcr.easy._053;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-subarray/
 * @author: fynch3r
 * @create: 2021-06-10 15:54
 **/


public class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxSum = nums[0];

        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxSum = Math.max(pre, maxSum);
        }
        return maxSum;
    }
}
