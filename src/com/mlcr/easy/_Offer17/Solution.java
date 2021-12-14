package com.mlcr.easy._Offer17;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * @author: 0range
 * @create: 2021-06-12 18:49
 **/


public class Solution {
    public int[] printNumbers(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            count = count * 10;
        }
        int[] result = new int[count - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
