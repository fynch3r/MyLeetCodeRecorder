package com.mlcr.string._1684;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 * @author: fynch3r
 * @create: 2021-06-12 18:31
 **/


public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
