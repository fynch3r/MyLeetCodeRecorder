package com.mlcr.easy._598;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/range-addition-ii/
 * @author: 0range
 * @create: 2021-06-12 14:32
 **/


public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for (int i = 0; i < ops.length; i++) {
            m = Math.min(m, ops[i][0]);
            n = Math.min(n, ops[i][1]);
        }
        return m * n;
    }
}
