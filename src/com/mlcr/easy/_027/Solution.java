package com.mlcr.easy._027;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/remove-element/
 * @author: 0range
 * @create: 2021-06-10 15:52
 **/


public class Solution {

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
