package com.mlcr.easy._219;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/contains-duplicate-ii/
 * @author: fynch3r
 * @create: 2021-06-11 14:12
 **/


public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

}
