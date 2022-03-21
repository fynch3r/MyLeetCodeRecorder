package com.mlcr.number._263;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/ugly-number/
 * @author: fynch3r
 * @create: 2021-06-11 14:39
 **/


public class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        int[] factor = new int[]{2, 3, 5};
        for (int i : factor) {
            while (num % i == 0) {
                num /= i;
            }
        }
        return num == 1;
    }
}
