package com.mlcr.sort;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: 0range
 * @create: 2021-06-17 16:07
 **/


public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {34, 2324, 543, 53, 43, 53, 42, 0, -32};
        System.out.println("before bubblesort array = " + Arrays.toString(array));
        System.out.println("after bubblesort array = " + Arrays.toString(bubbleSort(array)));
    }

    /**
     * 不断的两两比较
     * 第一层循环是遍历 每轮都能得到一个最大的 放在最后
     * 第二层是循环边界，不用比较最大的那个了
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
