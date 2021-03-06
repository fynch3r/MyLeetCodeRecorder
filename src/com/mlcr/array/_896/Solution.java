package com.mlcr.array._896;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/monotonic-array/ 单调数列
 * @author: fynch3r
 * @create: 2021-07-14 20:06
 **/


public class Solution {
    public boolean isMonotonic(int[] nums) {
        return isSorted(nums, true) || isSorted(nums, false);
    }

    private boolean isSorted(int[] nums, boolean increasing) {
        int len = nums.length;
        if (increasing) {
            for (int i = 0; i < len - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < len - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        return true; // 满足一种就行
    }
}
