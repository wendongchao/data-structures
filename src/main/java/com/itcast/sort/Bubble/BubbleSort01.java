package com.itcast.sort.Bubble;

import org.springframework.util.StopWatch;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 冒泡排序-简单冒泡排序
 */
public class BubbleSort01 {
    public static void main(String[] args) {
		int arr[] = {3, 9, -1, 10, 20};

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
        int temp = 0; // 临时变量
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false; // 标识变量，表示是否进行过交换
            //把比较大的数据放到后面，数组长度减少
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) { // 在一趟排序中，一次交换都没有发生过，那么跳出循环，执行下个循环
                break;
            }
        }
    }
}
