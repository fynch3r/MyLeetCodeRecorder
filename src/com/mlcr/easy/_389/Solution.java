package com.mlcr.easy._389;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/find-the-difference/
 * @author: 0range
 * @create: 2021-06-11 16:16
 **/


public class Solution {
    public char findTheDifference(String s, String t) {
        int ss = 0, tt = 0;
        for (int i = 0; i < s.length(); i++) {
            ss += s.charAt(i);
        }
        for (int j = 0; j < t.length(); j++) {
            tt += t.charAt(j);
        }
        return (char) (tt - ss);
    }
}
