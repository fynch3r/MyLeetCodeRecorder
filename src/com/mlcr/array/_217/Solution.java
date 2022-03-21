package com.mlcr.array._217;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/contains-duplicate/
 * @author: fynch3r
 * @create: 2021-06-11 14:10
 **/


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet 自动去重，检查最终长度
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
