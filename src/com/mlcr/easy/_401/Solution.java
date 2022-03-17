package com.mlcr.easy._401;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/binary-watch/
 * @author: fynch3r
 * @create: 2021-06-11 16:24
 **/


public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num)
                    times.add(String.format("%d:%02d", h, m));
            }
        }
        return times;
    }
}
