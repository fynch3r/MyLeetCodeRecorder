package com.mlcr.number._1323;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-69-number/
 * @author: fynch3r
 * @create: 2021-06-12 17:04
 **/


public class Solution {
    public int maximum69Number (int num) {
        String temp = String.valueOf(num);
        char[] cc = temp.toCharArray();

        for (int i = 0; i < cc.length; i++) {
            if(cc[i]!='9'){
                cc[i] = '9';
                break;
            }
        }
        int result = Integer.parseInt(String.valueOf(cc));
        return result;
    }
}
