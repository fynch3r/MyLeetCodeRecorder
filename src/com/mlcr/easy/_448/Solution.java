package com.mlcr.easy._448;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * @author: fynch3r
 * @create: 2021-06-11 16:49
 **/


public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] ant = new boolean[nums.length + 1];
        for (int num : nums) {
            ant[num] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!ant[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
