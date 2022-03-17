package com.mlcr.easy._191;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/number-of-1-bits/
 * @author: fynch3r
 * @create: 2021-06-11 13:24
 **/


public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}
