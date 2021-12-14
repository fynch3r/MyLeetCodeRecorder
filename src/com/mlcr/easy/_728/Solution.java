package com.mlcr.easy._728;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/self-dividing-numbers/
 * @author: 0range
 * @create: 2021-06-12 15:33
 **/


public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        boolean flag = true;
        for (int i = left; i < right; i++) {
            String s = String.valueOf(i);
            if (!s.contains("0")) {
                flag = true;
                char[] charArray = s.toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    int temp = Character.getNumericValue(charArray[j]);
                    if (i % temp != 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}