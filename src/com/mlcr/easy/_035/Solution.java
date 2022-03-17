package com.mlcr.easy._035;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/search-insert-position/
 * @author: fynch3r
 * @create: 2021-06-10 15:54
 **/


public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length < 1) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target) {
                result = i + 1;
            }
        }
        return result;
    }
}
