package com.mlcr.easy._1266;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/minimum-time-visiting-all-points/
 * @author: 0range
 **/


public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int weight_one = points[i][0];
            int height_one = points[i][1];
            int weight_two = points[i + 1][0];
            int height_two = points[i + 1][1];
            int stant_x = Math.abs(weight_one - weight_two);
            int stant_y = Math.abs(height_one - height_two);
            if (stant_x == stant_y) {
                result += stant_x;
            } else {
                result = stant_x > stant_y ? result + stant_x : result + stant_y;
            }
        }

        return result;
    }
}
