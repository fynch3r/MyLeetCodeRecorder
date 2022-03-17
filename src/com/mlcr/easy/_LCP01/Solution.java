package com.mlcr.easy._LCP01;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/guess-numbers/
 * @author: fynch3r
 * @create: 2021-06-12 18:45
 **/


public class Solution {
    public int game(int[] guess, int[] answer) {
        int sum = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                sum++;
            }
        }
        return sum;
    }

}
