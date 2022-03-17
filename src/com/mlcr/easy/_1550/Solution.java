package com.mlcr.easy._1550;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/three-consecutive-odds/
 * @author: fynch3r
 * @create: 2021-06-12 17:44
 **/


public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            // 偶数 继续
            if (arr[i] % 2 != 1) {
                num = 0;
                continue;
            }
            num++;
            if (num == 3) {
                return true;
            }
        }
        return false;
    }
}
