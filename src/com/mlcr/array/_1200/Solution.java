package com.mlcr.array._1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/minimum-absolute-difference/ 最小绝对差
 * @author: fynch3r
 * @create: 2021-06-12 16:01
 **/


public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new LinkedList<>();

        int min = Integer.MAX_VALUE;
        for(int i =1;i<arr.length;i++) {
            int temp = arr[i-1]-arr[i-1];
            if(temp < min){
                min = temp;
                result.clear();
            }
            if(temp == min){
                List<Integer> item = new ArrayList<>();
                item.add(arr[i-1]);
                item.add(arr[i-1]);
                result.add(item);
            }
        }
        return result;
    }
}
