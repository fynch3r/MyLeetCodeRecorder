package com.mlcr.easy._643;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-average-subarray-i/
 * @author: 0range
 * @create: 2021-06-12 15:20
 **/


public class Solution {
    /**
     * 思路 滑动窗口
     */
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < len; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }
        return 1.0 * max / k;

    }
}
