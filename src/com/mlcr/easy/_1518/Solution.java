package com.mlcr.easy._1518;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/water-bottles/
 * @author: fynch3r
 * @create: 2021-06-12 17:32
 **/


public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        while(numBottles >= numExchange){
            // 可以换到的新酒
            int numRedeem = numBottles / numExchange;
            // 余数 不够换酒的会剩下来
            int numResidual = numBottles % numExchange;
            // 每一轮喝到的酒
            count += numBottles - numResidual;
            // 给下一轮的新酒 = 换到的新酒+上一轮剩的酒
            numBottles = numRedeem + numResidual;
        }
        // 需要加上不够换的酒(最后一轮/一开始就不够换的)
        count += numBottles;
        return count;
    }
}
