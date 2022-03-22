package com.mlcr.array._661;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/image-smoother/
 * @author: fynch3r
 * @create: 2021-06-12 15:24
 **/


public class Solution {
    public int[][] imageSmoother(int[][] M) {
        int R = M.length;
        int C = M[0].length;
        int[][] ans = new int[R][C];

        for (int r = 0; r < R; ++r){
            for (int c = 0; c < C; ++c) {
                int count = 0;
                for (int nr = r-1; nr <= r+1; ++nr) {
                    for (int nc = c-1; nc <= c+1; ++nc) {
                        if (0 <= nr && nr < R && 0 <= nc && nc < C) {
                            ans[r][c] += M[nr][nc];
                            count++;
                        }
                    }
                }
                ans[r][c] /= count;
            }
        }
        return ans;

    }
}
