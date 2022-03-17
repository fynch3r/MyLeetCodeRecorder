package com.mlcr.easy._441;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/arranging-coins/
 * @author: fynch3r
 * @create: 2021-06-11 16:47
 **/


public class Solution {
    public int arrangeCoins(int n) {
        int i = 0;
        while (n > 0) {
            i++;
            n -= i;
        }
        if (n < 0) {
            return i - 1;
        }
        // n==0
        return i;
    }
}
