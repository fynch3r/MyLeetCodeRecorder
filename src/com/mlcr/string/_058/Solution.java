package com.mlcr.string._058;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/length-of-last-word/
 * @author: fynch3r
 * @create: 2021-06-10 16:13
 **/


public class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if (str.length < 1) {
            return 0;
        }
        return str[str.length - 1].length();
    }
}
