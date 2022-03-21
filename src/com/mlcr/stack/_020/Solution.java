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
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(pairs.containsKey(c)){
                if(stack.isEmpty()|| !pairs.get(c).equals(stack.peek())){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(])"));
    }
}
