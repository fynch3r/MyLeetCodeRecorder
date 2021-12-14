package com.mlcr.sort;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: 0range
 * @create: 2021-06-17 16:10
 **/


public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {34, 2324, 543, 53, 43, 53, 42, 0, -32};
        System.out.println("before bubblesort array = " + Arrays.toString(array));
        System.out.println("after bubblesort array = " + Arrays.toString(insertionSort(array)));
    }

    /**
     * 从第一个元素开始，该元素可以认为已经被排序；
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
     * 将新元素插入到该位置后；
     * 重复步骤2~5。
     *
     * @param array
     * @return
     */

    public static int[] insertionSort(int[] array) {
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            int preindex = i;
            current = array[i + 1];
            while (preindex >= 0 && current < array[preindex]) {
                array[preindex + 1] = array[preindex];
                preindex--;
            }
            array[preindex + 1] = current;
        }
        return array;
    }
}
