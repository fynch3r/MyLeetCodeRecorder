package com.mlcr.string._557;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * @author: fynch3r
 * @create: 2021-06-12 14:11
 **/


public class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        //System.out.println(Arrays.toString(temp));
        StringBuffer sb = new StringBuffer();
        for (String s1 : temp) {
            sb.append(new StringBuffer(s1).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }
}
