package com.mlcr.array._1450;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/number-of-students-doing-homework-at-a-given-time/
 * @author: fynch3r
 * @create: 2021-06-12 17:15
 **/


public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }
}
