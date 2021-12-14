package com.mlcr.medium._38;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/count-and-say/
 * @author: 0range
 * @create: 2021-06-12 19:01
 **/


public class Solution {
    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }

        StringBuilder sb = new StringBuilder();
        String prevStr = countAndSay(n-1);

        int start =0;
        for(int j = 1;j < prevStr.length();j++){
            // 如果和第一位不一样 需要分界
            if(prevStr.charAt(start) != prevStr.charAt(j)){
                sb.append(j-start).append(prevStr.charAt(start));
                start = j;
            }
        }
        // 分析剩下相同的
        sb.append(prevStr.length()-start).append(prevStr.charAt(prevStr.length()-1));
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println("countAndSay(4) = " + countAndSay(4));
    }

}
