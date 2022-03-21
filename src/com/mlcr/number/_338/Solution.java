package com.mlcr.number._338;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/counting-bits/
 * @author: fynch3r
 * @create: 2021-07-09 15:36
 **/


public class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            // 奇数
            if (i % 2 == 1) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = result[i / 2];
            }
        }
        return result;
    }
}
