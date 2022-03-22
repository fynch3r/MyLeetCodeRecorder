package com.mlcr.array._1260;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/shift-2d-grid/
 * @author: fynch3r
 * @create: 2021-06-12 16:09
 **/


public class Solution {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int line = grid.length;
        int col = grid[0].length;
        List<Integer> list = new LinkedList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int[] ints : grid) {
            for (int j = 0; j < col; j++) {
                list.add(ints[j]);
            }
        }

        int cd = list.size() - k % list.size();
        while (!list.isEmpty()) {
            List<Integer> integers = new ArrayList<Integer>();
            for (int i = 0; i < col; i++) {
                if (cd >= list.size() || cd < 0) {
                    cd = 0;
                }
                integers.add(list.get(cd));
                list.remove(cd);
            }
            res.add(integers);
        }
        return res;
    }
}
