package com.mlcr.easy._942;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/di-string-match/
 * @author: fynch3r
 * @create: 2021-06-12 15:43
 **/


public class Solution {
    public int[] diStringMatch(String S) {
        int length = S.length();
        int[] result = new int[length + 1];
        int left = 0, right = length;

        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'I') {
                result[i] = left++;
            } else if (S.charAt(i) == 'D') {
                result[i] = right--;
            }
        }
        result[length] = left;
        return result;
    }
}
