package com.mlcr.easy._492;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/construct-the-rectangle/
 * @author: 0range
 * @create: 2021-06-12 11:24
 **/


public class Solution {
    public int[] constructRectangle(int area) {
        int sqrt = (int)Math.sqrt(area);
        while(area % sqrt != 0){
            sqrt--;
        }
        return new int[]{area/sqrt,sqrt};
    }
}
