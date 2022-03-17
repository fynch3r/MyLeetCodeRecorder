package com.mlcr.easy._1486;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/xor-operation-in-an-array/
 * @author: fynch3r
 * @create: 2021-06-12 17:26
 **/


public class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans ^= (start + i * 2);
        }
        return ans;
    }
}
