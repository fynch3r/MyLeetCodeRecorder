package com.mlcr.easy._482;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/license-key-formatting/
 * @author: fynch3r
 * @create: 2021-06-11 17:51
 **/


public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.replace("-", "");
        S = S.toUpperCase();
        // 来找插入位 奇偶讨论
        int stLen = S.length() % K == 0 ? K : S.length() - S.length() / K * K;
        StringBuffer str = new StringBuffer(S);
        for (int i = stLen; i < str.length(); i = i + K + 1) {
            str = str.insert(i, "-");
        }
        return str.toString();
    }
}
