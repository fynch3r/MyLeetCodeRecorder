package com.mlcr.easy._682;

import java.util.Stack;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/baseball-game/
 * @author: fynch3r
 * @create: 2021-06-12 15:25
 **/


public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        int sum = Integer.parseInt(ops[0]);
        s.push(sum);
        for (int i = 1; i < ops.length; i++) {
            if ("C".equals(ops[i])) {
                sum -= s.pop();
            } else if ("D".equals(ops[i])) {
                int rush = 2 * s.peek();
                sum += rush;
                s.push(rush);
            } else if ("+".equals(ops[i])) {
                int temp = s.peek();
                int num = 0;
                s.pop();
                num += temp + s.peek();
                s.push(temp);
                s.push(num);
                sum += num;
            } else {
                int num = Integer.parseInt(ops[i]);
                sum += num;
                s.push(num);
            }
        }
        return sum;
    }
}
