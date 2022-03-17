package com.mlcr.easy._1221;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * @author: fynch3r
 * @create: 2021-06-12 16:05
 **/


public class Solution {
    public int balancedStringSplit(String s) {
        int L = 0, R = 0, result = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                R++;
            } else if (c == 'L') {
                L++;
            }
            if (L > 0 && L == R) {
                result++;
                L = R = 0;
            }
        }
        return result;
    }
}
