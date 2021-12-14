package com.mlcr.easy._832;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/flipping-an-image/
 * @author: 0range
 * @create: 2021-06-12 15:40
 **/


public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row : A) {
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }
        }

        return A;
    }
}
