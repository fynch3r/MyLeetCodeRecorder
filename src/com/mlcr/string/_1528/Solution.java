package com.mlcr.string._1528;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/shuffle-string/
 * @author: fynch3r
 * @create: 2021-06-12 17:41
 **/


public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] target = new char[indices.length];
        char[] c = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            target[indices[i]] = c[i];
        }
        return String.valueOf(target);
    }
}
