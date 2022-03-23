package com.mlcr.dp.easy._455;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/assign-cookies/ 分发饼干
 * @author: fynch3r
 * @create: 2021-06-11 17:14
 **/


public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;

        // g是小孩子
        // s是饼干
        for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++) {
            while (j<s.length && g[i] > s[j]) {
                j++;
            }
            if(j<s.length){
                //可以满足一个
                count++;
            }
        }
        return count;
    }
}
