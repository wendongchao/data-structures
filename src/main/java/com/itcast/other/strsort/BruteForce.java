package com.itcast.other.strsort;

/**
 * 字符串排序：BF算法
 * @Author wendongchao
 * @Date 2021-12-13 8:01
 */
public class BruteForce {
    public static void main(String[] args) {
        String haystack="hello",needle="ll";
        int i = strSort(haystack, needle);
        System.out.println(i);
    }

    public static int strSort(String haystack, String needle) {
        int haylen = haystack.length();
        int needlen = needle.length();
        //特殊情况
        if (haylen < needlen) {
            return -1;
        }
        if (needlen == 0) {
            return 0;
        }
        //主串
        for (int i = 0; i < haylen - needlen + 1; ++i) {
            int j;
            //模式串
            for (j = 0; j < needlen; j++) {
                //不符合的情况，直接跳出，主串指针后移一位
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }
            //匹配成功
            if (j == needlen) {
                return i;
            }

        }
        return -1;
    }
}

