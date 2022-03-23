package com.mlcr.dp.easy._LCS01;

/**
 * @program: MyLeetCodeRecorder
 * @description:  https://leetcode-cn.com/problems/Ju9Xwi/ 下载插件
 * @author: fynch3r
 * @create: 2022-03-22 19:41
 **/


public class Solution {
    public int leastMinutes(int n) {
        int speed = 1;
        int answer = 0;
        while(speed<n){//当前网速不足下载任务
            speed = speed *2;//提速
            answer++;//当前这一分钟消耗掉
        }
        return answer+1;//最后一分钟下好
    }
}
