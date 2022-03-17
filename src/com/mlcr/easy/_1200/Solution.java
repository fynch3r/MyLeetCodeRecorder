package com.mlcr.easy._1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/minimum-absolute-difference/
 * @author: fynch3r
 * @create: 2021-06-12 16:01
 **/


public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new LinkedList<>();

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i] - arr[i - 1];
            // 找到新的最小差，清空原有结果
            if (temp < min) {
                min = temp;
                result.clear();
            }
            // 如果是最小差 记录下来
            if (temp == min) {
                List<Integer> item = new ArrayList<>(2);
                item.add(arr[i - 1]);
                item.add(arr[i]);
                result.add(item);
            }
        }
        return result;
    }
}
