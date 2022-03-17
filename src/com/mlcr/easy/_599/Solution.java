package com.mlcr.easy._599;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 * @author: fynch3r
 * @create: 2021-06-12 14:41
 **/


public class Solution {
    //思路：首先遍历list1将元素和索引存为map
    //接下来遍历list2，如果存在同样list1的元素进行数组的存放
    //如果存在比当前最小值还小的情况，那么放在结果数组第一个。更新最小值。
    //如果存在相同，那么就顺序放。
    //最后返回Arrays.copyofRange（res,0,t）
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int t = 0;
        int min = Integer.MAX_VALUE;
        String[] res = new String[10000];
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]);
                if (sum < min) {
                    t = 0;
                    min = sum;
                    res[t] = list2[j];
                    t++;
                } else if (sum == min) {
                    res[t] = list2[j];
                    t++;
                }
            }
        }
        return Arrays.copyOfRange(res, 0, t);
    }
}
