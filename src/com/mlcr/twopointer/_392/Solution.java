package com.mlcr.twopointer._392;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/is-subsequence/ 判断子序列
 * @author: fynch3r
 * @create: 2021-06-11 16:21
 **/


public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0, j =0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
