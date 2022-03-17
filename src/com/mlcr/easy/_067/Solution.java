package com.mlcr.easy._067;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/add-binary/
 * @author: fynch3r
 * @create: 2021-06-10 16:14
 **/


public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            //append方法是都追加在字符串的后面了，所以最后需要反转
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }
}
