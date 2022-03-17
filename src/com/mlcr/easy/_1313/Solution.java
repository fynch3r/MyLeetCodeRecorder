package com.mlcr.easy._1313;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 * @author: fynch3r
 * @create: 2021-06-12 17:03
 **/


public class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int len =0;
        for (int i = 0; i < nums.length/2; i++) {
            int count = nums[2*i];
            int goal = nums[2*i+1];
            for (int j = 0; j < count; j++) {
                list.add(goal);
            }
            len+= nums[2*i];
        }

        int[] target = new int[len];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}
