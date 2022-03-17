package com.mlcr.easy._434;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 * @author: fynch3r
 * @create: 2021-06-11 16:46
 **/


public class Solution {
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }
}
