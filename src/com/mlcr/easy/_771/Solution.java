package com.mlcr.easy._771;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/jewels-and-stones/
 * @author: fynch3r
 * @create: 2021-06-12 15:38
 **/


public class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] cc = J.toCharArray();
        char[] ss = S.toCharArray();
        int sum = 0;

        for (int i = 0; i < cc.length; i++) {
            for (int j = 0; j < ss.length; j++) {
                if (cc[i] == ss[j]) {
                    sum++;
                }
            }
        }


        return sum;
    }
}
