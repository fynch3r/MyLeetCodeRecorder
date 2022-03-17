package com.mlcr.easy._506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/relative-ranks/
 * @author: fynch3r
 * @create: 2021-06-12 11:44
 **/


public class Solution {

    public String[] findRelativeRanks(int[] score) {
        int length = score.length;

        // 成绩 序号
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            map.put(score[i], i);
        }
        Arrays.sort(score);
        String[] result = new String[length];

        for (int j = length - 1; j > 0; j--) {
            if (j == length - 1) {
                result[map.get(score[j])] = "Gold Metal";
            } else if (j == length - 2) {
                result[map.get(score[j])] = "Silver Metal";
            } else if (j == length - 3) {
                result[map.get(score[j])] = "Bronze Metal";
            } else {
                result[map.get(score[j])] = String.valueOf(length - j);
            }
        }
        return result;
    }


}
