package com.mlcr.number._1295;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 * @author: fynch3r
 * @create: 2021-06-12 16:23
 **/


public class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i : nums) {
            if (String.valueOf(i).length() % 2 == 0) {
                res++;
            }
        }
        return res;

    }
}
