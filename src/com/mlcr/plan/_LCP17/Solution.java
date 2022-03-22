package com.mlcr.plan._LCP17;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/nGK0Fy/
 * @author: fynch3r
 * @create: 2021-06-12 18:48
 **/


public class Solution {
    public int calculate(String s) {
        int x = 1;
        int y = 0;
        char[] ss = s.toCharArray();
        for (char c : ss) {
            if (c == 'A') {
                x = 2 * x + y;
            } else if (c == 'B') {
                y = 2 * y + x;
            } else {
                continue;
            }
        }

        return x + y;
    }
}
