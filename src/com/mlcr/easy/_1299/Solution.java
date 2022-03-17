package com.mlcr.easy._1299;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 * @author: fynch3r
 * @create: 2021-06-12 16:23
 **/


public class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            // 先上来交换
            int temp = arr[i];
            arr[i] = rightMax;
            // 更新rightMax
            if (temp > rightMax) {
                rightMax = temp;
            }
        }
        return arr;
    }
}
