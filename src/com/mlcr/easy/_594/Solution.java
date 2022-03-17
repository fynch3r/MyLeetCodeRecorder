package com.mlcr.easy._594;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/longest-harmonious-subsequence/
 * @author: fynch3r
 * @create: 2021-06-12 14:19
 **/


public class Solution {
    public int findLHS(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                } else if (nums[j] + 1 == max) {
                    count++;
                    flag = true;
                }
            }
            if (flag) {
                result = Math.max(result, count);
            }
        }
        return result;
    }
}
