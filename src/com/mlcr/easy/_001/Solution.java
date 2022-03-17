package com.mlcr.easy._001;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/two-sum/
 * @author: fynch3r
 **/


public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
