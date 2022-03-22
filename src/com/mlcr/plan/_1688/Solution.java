package com.mlcr.plan._1688;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/count-of-matches-in-tournament/
 * @author: fynch3r
 * @create: 2021-06-12 18:32
 **/


public class Solution {
    public int numberOfMatches(int n) {
        int count = 0;//配对次数
        int remain = 0; // 每轮剩余队伍
        while(n>1){
            if(n%2 == 1){
                remain = n/2+1;
            }else{
                remain = n/2;
            }
            count += n/2;
            n = remain;
        }
        return count;
    }
}
