package com.mlcr.easy._566;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/reshape-the-matrix/
 * @author: fynch3r
 * @create: 2021-06-12 14:13
 **/


public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int line = nums.length;
        int row = nums[0].length;

        if ((line * row) != (r * c)) {
            return nums;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int[] num : nums) {
            for (int j = 0; j < row; j++) {
                list.add(num[j]);
            }
        }

        int[][] res = new int[r][c];
        for (int k = 0; k < r; k++) {
            List<Integer> templist = list.subList(k * c, (k + 1) * c);
            for (int m = 0; m < c; m++) {
                res[k][m] = templist.get(m);
            }
        }

        return res;

        /**
         int m = nums.length;
         int n = nums[0].length;
         if (m * n != r * c) {
         return nums;
         }

         int[][] ans = new int[r][c];
         for (int x = 0; x < m * n; ++x) {
         ans[x / c][x % c] = nums[x / n][x % n];
         }
         return ans;
         */
    }
}
