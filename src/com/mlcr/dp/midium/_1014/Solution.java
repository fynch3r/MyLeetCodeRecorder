package com.mlcr.dp.midium._1014;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/best-sightseeing-pair/ 最佳观光组合
 * @author: fynch3r
 * @create: 2022-03-29 10:01
 **/


public class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int preMax = values[0]+0;
        int answer = 0;
        int len =values.length;
        for(int j =1;j<len;j++){
            answer = Math.max(answer,preMax+values[j]-j);
            // 维护，这里的j就是下一轮的i
            preMax = Math.max(preMax,values[j]+j);
        }
        return answer;
    }
}
