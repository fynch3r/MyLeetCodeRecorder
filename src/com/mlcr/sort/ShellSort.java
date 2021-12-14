package com.mlcr.sort;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: 0range
 * @create: 2021-06-17 16:11
 **/


public class ShellSort {
    public static void main(String[] args) {
        int[] array = {34, 2324, 543, 53, 43, 53, 42, 0, -32};
        System.out.println("before bubblesort array = " + Arrays.toString(array));
        System.out.println("after bubblesort array = " + Arrays.toString(shellSort(array)));
    }

    /**
     * 每一个都在希尔增量小范围内插入排序
     *
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array) {
        int len = array.length;
        int current;
        int gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                current = array[i];
                int preindex = i - gap;
                while (preindex >= 0 && array[preindex] > current) {
                    array[preindex + gap] = array[preindex];
                    preindex -= gap;
                }
                array[preindex + gap] = current;
            }
            gap /= 2;
        }
        return array;
    }
}
