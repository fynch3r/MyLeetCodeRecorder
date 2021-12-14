package com.mlcr.easy._026;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @author: 0range
 * @create: 2021-06-10 15:51
 **/


public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
