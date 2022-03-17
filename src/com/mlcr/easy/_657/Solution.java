package com.mlcr.easy._657;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/robot-return-to-origin/
 * @author: fynch3r
 * @create: 2021-06-12 15:24
 **/


public class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        int length = moves.length();
        for (int i = 0; i < length; i++) {
            char move = moves.charAt(i);
            if (move == 'U') {
                y--;
            } else if (move == 'D') {
                y++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}
