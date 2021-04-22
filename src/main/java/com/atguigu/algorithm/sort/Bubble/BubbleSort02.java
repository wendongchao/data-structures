package com.atguigu.algorithm.sort.Bubble;

import org.springframework.util.StopWatch;

import java.util.Arrays;

/**
 * 冒泡排序-优化
 */
public class BubbleSort02 {
    public static void main(String[] args) {
		int arr[] = {3, 9, -1, 10, 20,4,9,20,199,34};

        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        //###################################################
        StopWatch sw = new StopWatch();
        sw.start("冒泡排序消耗时间");
        bubbleSort(arr);
        sw.stop();
        System.out.println(sw.prettyPrint());
        //###################################################
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    // 冒泡排序 的时间复杂度 O(n^2)
    public static void bubbleSort(int[] arr) {
        // 临时变量
        int temp = 0;
        // 记录最后一次交换的位置
        int lastExchangeIndex = 0;
        // 无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = arr.length -1;
        for (int i = 0; i < arr.length - 1; i++) {
            // 标识变量，表示是否进行过交换
            boolean flag = false;
            for (int j = 0; j < sortBorder; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //有元素交换，所以就不是有序，
                    flag = true;
                    //把无序数列的边界更新为最后一次交换元素的位置
                    //释义：j与j+1已经比较完成，那么j+1就不用比较，j就可以作为边界
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            // 在一趟排序中，一次交换都没有发生过，那么跳出循环，执行下个循环
            if (!flag) {
                break;
            }
        }
    }
}
