package com.mlcr.twopointer._383;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/ransom-note/
 * @author: fynch3r
 * @create: 2021-06-11 16:08
 **/


public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        Arrays.sort(r);
        Arrays.sort(m);
        int i = 0, j = 0;
        while (i < r.length && j < m.length) {
            if (r[i] < m[j]) {
                return false;
            } else if (r[i] > m[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        return i == r.length;
    }
}
