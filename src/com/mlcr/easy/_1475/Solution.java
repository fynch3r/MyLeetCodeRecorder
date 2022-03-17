package com.mlcr.easy._1475;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop/
 * @author: fynch3r
 * @create: 2021-06-12 17:22
 **/


public class Solution {
    public int[] finalPrices(int[] prices) {
        int[] target = Arrays.copyOf(prices, prices.length);
        int rightMin = prices[prices.length - 1];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    target[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return target;
    }
}
