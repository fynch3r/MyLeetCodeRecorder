package com.mlcr.sort;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: fynch3r
 * @create: 2021-06-17 16:11
 **/


public class QuickSort {
    public static void main(String[] args) {
        int[] array = {34, 2324, 543, 53, 43, 53, 42, 0, -32};
        System.out.println("before QuickSort array = " + Arrays.toString(array));
        System.out.println("after QuickSort array = " + Arrays.toString(quickSort(array, 0, array.length - 1)));
    }

    public static int[] quickSort(int[] array, int start, int end) {
        if (start < 0 || end >= array.length || start > end) {
            return null;
        }
        int index = partition(array, start, end);
        if (index > start) {
            quickSort(array, start, index - 1);
        }
        if (index < end) {
            quickSort(array, index + 1, end);
        }
        return array;
    }


    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int devideIndex = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot) {
                devideIndex++;
                if (i > devideIndex) {
                    swap(array, i, devideIndex);
                }
            }
        }
        //返回分界位
        return devideIndex;
    }

    private static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
