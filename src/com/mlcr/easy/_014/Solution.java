package com.mlcr.easy._014;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/longest-common-prefix/
 * @author: fynch3r
 * @create: 2021-06-10 15:47
 **/


public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String node = strs[0];
        for (String str : strs) {
            while(!str.startsWith(node)){
                node = node.substring(0,node.length()-1);
            }
        }
        return node;
    }
}
