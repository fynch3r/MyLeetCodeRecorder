package com.mlcr.dp.midium._62;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/unique-paths/ 不同路径
 * @author: fynch3r
 * @create: 2022-03-22 18:22
 **/


public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m+1][n+1];
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(i ==1 || j ==1){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        return arr[m][n];
    }
}
