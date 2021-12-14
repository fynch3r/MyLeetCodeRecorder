package com.mlcr.easy._1389;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 * @author: 0range
 * @create: 2021-06-12 17:09
 **/


public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}
