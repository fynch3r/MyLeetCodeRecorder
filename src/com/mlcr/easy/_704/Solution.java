package com.mlcr.easy._704;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/binary-search/
 * @author: 0range
 * @create: 2021-07-13 17:02
 **/


public class Solution {
    public int search(int[] nums, int target) {
        // 二分查找
        int pivot, left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            pivot = (right + left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else if (target > nums[pivot]) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return -1;
    }
}
