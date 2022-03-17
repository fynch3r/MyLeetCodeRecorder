package com.mlcr.easy._LCP06;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/na-ying-bi/
 * @author: fynch3r
 * @create: 2021-06-12 18:46
 **/


public class Solution {
    public int minCount(int[] coins) {
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] % 2 != 0) {
                sum += coins[i] / 2 + 1;
            } else {
                sum += coins[i] / 2;
            }
        }
        return sum;
    }
}
