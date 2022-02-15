package com.itcast.sort.CockTailSort;

import org.springframework.util.StopWatch;

import java.util.Arrays;

/**
 * 鸡尾酒排序
 *
 * @Author wendongchao
 * @Date 2021/4/23 0:11
 */

public class CockTailSort01 {
    public static void main(String[] args) {
        int arr[] = {3, 9, -1, 10, 20, 4, 9, 20, 199, 34};

        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        //###################################################
        StopWatch sw = new StopWatch();
        sw.start("鸡尾酒排序消耗时间");
        bubbleSort(arr);
        sw.stop();
        System.out.println(sw.prettyPrint());
        //###################################################
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    // 鸡尾酒排序 的时间复杂度 O(n^2)
    public static void bubbleSort(int[] arr) {
        // 临时变量
        int temp = 0;
        for (int i = 0; i < arr.length / 2-1; i++) {
            //有序标记，初始标志为true
            boolean isSorted = true;
            //奇数，从左向右比较和交换
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                    //有元素交换，所以不是有序，变更标记false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            //重新标记
            isSorted = true;
            temp = 0;
            //偶数，从右向左比较和交换
            for (int j = arr.length - i - 2; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    //有元素交换，所以不是有序，变更标记false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
