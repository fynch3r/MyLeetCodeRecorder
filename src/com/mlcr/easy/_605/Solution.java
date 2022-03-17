package com.mlcr.easy._605;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/can-place-flowers/
 * @author: fynch3r
 * @create: 2021-06-12 14:50
 **/


public class Solution {
    /**
     * 思路：小贪心
     * 能种花的条件就是：
     * 当前位置为0；
     * 当前位置为最左 或 右边为0
     * 当前位置为最右 或 左边为0
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (
                    flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)
            ) {
                n--;
                if (n <= 0) {
                    return true;
                }
                flowerbed[i] = 1;
            }
        }
        return n <= 0;
    }
}
