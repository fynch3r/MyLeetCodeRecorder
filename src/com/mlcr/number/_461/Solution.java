package com.mlcr.number._461;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/hamming-distance/
 * @author: fynch3r
 * @create: 2021-06-11 17:44
 **/


public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
