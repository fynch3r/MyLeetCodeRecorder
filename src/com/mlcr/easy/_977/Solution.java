package com.mlcr.easy._977;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * @author: 0range
 * @create: 2021-06-12 15:51
 **/


public class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = Arrays.copyOf(A, A.length);
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i] * A[i];
        }
        Arrays.sort(result);
        return result;
    }
}
