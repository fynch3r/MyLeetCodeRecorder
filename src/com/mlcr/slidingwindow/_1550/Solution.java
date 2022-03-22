package com.mlcr.slidingwindow._1550;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/three-consecutive-odds/
 * @author: fynch3r
 * @create: 2021-06-12 17:44
 **/


public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 3; ++i) {
            if ((arr[i] % 2) != 0 && (arr[i + 1] % 2) != 0 && (arr[i + 2] % 2) != 0) {
                return true;
            }
        }
        return false;
    }
}
