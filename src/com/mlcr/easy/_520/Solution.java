package com.mlcr.easy._520;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/detect-capital/
 * @author: fynch3r
 * @create: 2021-06-12 13:33
 **/


public class Solution {
    public static boolean detectCapitalUse(String word) {
        // 全部大写 / 全部小写
        if (word.toUpperCase() == word || word.toLowerCase() == word) {
            return true;
        }

        boolean flag = false;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (((int) letter >= 65 && (int) letter <= 90) && i == 0) {
                flag = true;
            } else if (((int) letter >= 65 && (int) letter <= 90) && i > 0) {
                flag = false;
            }
        }
        return flag;

    }
}
