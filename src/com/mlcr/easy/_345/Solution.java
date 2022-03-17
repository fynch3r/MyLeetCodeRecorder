package com.mlcr.easy._345;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 * @author: fynch3r
 * @create: 2021-06-11 15:49
 **/


public class Solution {
    public String reverseVowels(String s) {
        Character[] ch = new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> chlist = new ArrayList<Character>(Arrays.asList(ch));
        char[] cahrarray = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (start < s.length() && !chlist.contains(cahrarray[start])) {
                start++;
            }
            while (end >= 0 && !chlist.contains(cahrarray[end])) {
                end--;
            }
            if (start >= end) {
                break;
            }
            char temp = cahrarray[start];
            cahrarray[start] = cahrarray[end];
            cahrarray[end] = temp;
            start++;
            end--;
        }
        // return String.valueOf(cahrarray);
        return new String(cahrarray);
    }
}
