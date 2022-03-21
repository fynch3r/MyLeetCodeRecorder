package com.mlcr.string._409;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/longest-palindrome/ 最长回文串
 * @author: fynch3r
 * @create: 2021-06-11 16:25
 **/


public class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;//奇偶得到的结果不同
            //第一次发现奇数次数 只用它一次
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;

    }
}
