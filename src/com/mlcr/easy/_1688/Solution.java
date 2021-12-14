package com.mlcr.easy._1688;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/count-of-matches-in-tournament/
 * @author: 0range
 * @create: 2021-06-12 18:32
 **/


public class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        int times = 0;
        while (n > 1) {
            //奇数
            if (n % 2 > 0) {
                times = n / 2 + 1;
            } else {
                //偶数
                times = n / 2;
            }
            count += n / 2;
            n = times;
        }
        return count;
    }
}
