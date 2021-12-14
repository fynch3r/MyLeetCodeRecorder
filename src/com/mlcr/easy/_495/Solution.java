package com.mlcr.easy._495;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/teemo-attacking/
 * @author: 0range
 * @create: 2021-07-09 16:19
 **/


public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int length = timeSeries.length;
        int total = 0;
        for (int i = 0; i < length-1; i++) {
            total += Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        return total+duration;
    }
}
