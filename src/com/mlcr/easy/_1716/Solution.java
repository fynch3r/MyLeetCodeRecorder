package com.mlcr.easy._1716;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/calculate-money-in-leetcode-bank/
 * @author: 0range
 * @create: 2021-06-12 18:38
 **/


public class Solution {
    /**
     * 1.每一个完整的7天，一定会存下28元，因为：1+2+3+4+5+6+7=28，所以当有r个完整7天时，会存下 28 * n 元；
     * 2.第二个7天，会多存下7元，因为：2+3+4+5+6+7+8 = 7 + 1+2+3+4+5+6+7；
     * 3.第r个7天，会多存下 7*(1+2+3+..+r-1)元。根据等差数列的求和公式，可推导出：7*r*(r - 1)/2 元；
     * 4.余数也是利用相同的思想，可以拆分为 1+2+...mod 和 r * mod。
     */
    public int totalMoney(int n) {
        int round = n / 7;
        int residue = n % 7; //余数
        return (28 * round)
                + (7 * round * (round - 1) / 2)
                + (round * residue)
                + (residue * (residue + 1) / 2);
    }
}
