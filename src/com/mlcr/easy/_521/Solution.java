package com.mlcr.easy._521;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/longest-uncommon-subsequence-i/
 * @author: 0range
 * @create: 2021-06-12 14:05
 **/


public class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
