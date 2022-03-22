package com.mlcr.greedy._1710;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-units-on-a-truck/
 * @author: fynch3r
 * @create: 2021-06-12 18:35
 **/


public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int result = 0;
        Arrays.sort(boxTypes, (o1, o2) -> (o2[1] - o1[1]));
        for (int i = 0; i < boxTypes.length && truckSize >= 0; i++) {
            int num = Math.min(truckSize, boxTypes[i][0]);
            truckSize -= num;
            result += num * boxTypes[i][1];
        }
        return result;
    }
}
