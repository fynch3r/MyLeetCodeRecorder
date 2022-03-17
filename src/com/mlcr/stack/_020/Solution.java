package com.mlcr.stack._020;

import java.util.*;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/valid-parentheses/
 * @author: fynch3r
 * @create: 2021-06-10 15:48
 **/


public class Solution {
    public boolean isValid(String s) {
        //int n = s.length();
        //if (n % 2 == 1) {
        //    return false;
        //}
        //
        //Map<Character, Character> pairs = new HashMap<Character, Character>() {{
        //    put(')', '(');
        //    put(']', '[');
        //    put('}', '{');
        //}};
        //Deque<Character> stack = new LinkedList<>();
        //for (int i = 0; i < n; i++) {
        //    char ch = s.charAt(i);
        //    if (pairs.containsKey(ch)) {
        //        if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
        //            return false;
        //        }
        //        stack.pop();
        //    } else {
        //        stack.push(ch);
        //    }
        //}
        //return stack.isEmpty();

        int len = s.length();
        if (len % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (pairs.containsKey(c)) {
                if (pairs.get(c).equals(stack.peek())) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(])"));
    }
}
