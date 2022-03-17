package com.mlcr.easy._709;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/to-lower-case/
 * @author: fynch3r
 * @create: 2021-06-12 15:31
 **/


public class Solution {
    public String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c1 : charArray) {
            int ascii = (int) c1;
            if (ascii <= 'Z' && ascii >= 'A') {
                ascii += 32;
            }
            sb.append((char) ascii);
        }
        return sb.toString();
    }
}
