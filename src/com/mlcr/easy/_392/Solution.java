package com.mlcr.easy._392;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/is-subsequence/
 * @author: fynch3r
 * @create: 2021-06-11 16:21
 **/


public class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
