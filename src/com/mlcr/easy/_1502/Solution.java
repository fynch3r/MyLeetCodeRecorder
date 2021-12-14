package com.mlcr.easy._1502;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 * @author: 0range
 * @create: 2021-06-12 17:27
 **/


public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int gap = arr[1] - arr[0];
        boolean flag = true;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == gap) {
                continue;
            } else {
                flag = false;
                break;
            }

        }
        return flag;
    }
}
