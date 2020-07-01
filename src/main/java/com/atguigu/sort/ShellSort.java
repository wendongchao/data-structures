package com.atguigu.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    //希尔排序交换法
    public static void shellSort(int[] arr) {

        int temp = 0;
        int count = 0;
        // 根据前面的逐步分析，使用循环处理
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                // 遍历各组中所有的元素(共gap组，每组有个元素), 步长gap
                for (int j = i - gap; j >= 0; j -= gap) {
                    // 如果当前元素大于加上步长后的那个元素，说明交换
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }

       /* //第1轮的排序的步长是arr/2=5
        for (int i = 5; i < arr.length; i++) {
            for (int j = i - 5; j >= 0; j -= 5) {
                //如果当前元素arr[j]大于加上步长后的元素arr[i]，交换
                if (arr[j + 5] < arr[j]) {
                    int temp = arr[j + 5];
                    arr[j + 5] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("第1轮" + Arrays.toString(arr));

        //第2轮的排序的步长是5/2=2
        for (int i = 2; i < arr.length; i++) {
            for (int j = i - 2; j >= 0; j -= 2) {
                //如果当前元素arr[j]大于加上步长后的元素arr[i]，交换
                if (arr[j + 2] < arr[j]) {
                    int temp = arr[j + 2];
                    arr[j + 2] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("第2轮" + Arrays.toString(arr));

        //第3轮的排序的步长是2/2=1
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j -= 1) {
                //如果当前元素arr[j]大于加上步长后的元素arr[j+2]，交换
                //arr[j + 2]元素当j比较大时可以让j从后往前以步长进行比较
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("第3轮" + Arrays.toString(arr));

        */
    }
    //希尔排序移位法
    public static void shellSort2(int[] arr) {
        //增量gap, 并逐步的缩小增量(步长)
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //步长分组（5,2,1），进行插入排序
            for (int i = gap; i < arr.length; i++) {
                //把i位置的数值保存，便于移位时赋值
                int j = i;
                int temp = arr[j];
                //判断j与j-gap大小（以步长为间隔进行数值比较）
                if (arr[j] < arr[j - gap]) {
                    //以步长为间隔进行数值比较，从右往左（右大，左小），节点大于0
                    //符合要求，节点赋值，并且左移
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    //循环之后的j是arr[i]要交换的值
                    arr[j] = temp;
                }
            }
        }
    }


}
