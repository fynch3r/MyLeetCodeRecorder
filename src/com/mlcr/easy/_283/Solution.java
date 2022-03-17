package com.mlcr.easy._283;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/move-zeroes/
 * @author: fynch3r
 * @create: 2021-06-11 14:54
 **/


public class Solution {
    public void moveZeroes(int[] nums) {
        // left记录0的位置 right扫描
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
