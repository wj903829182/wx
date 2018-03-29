package com.jack.controller;

import java.util.Arrays;

/**
 * Created by jack on 2018/3/27.
 */
public class QuickSortTest {


    private static int c = 1;
    /**
     * 快速排序
     * @param a
     * @param low
     * @param hight
     */
    public static void sort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        System.out.println("第 "+(c++)+"次"+Arrays.toString(a));
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = index;// 将基准数值替换回 a[i]
        sort(a, low, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, hight); // 对高子表进行递归排序

    }

    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int a[] = { 49, 38, 65, 97, 76, 13, 27, 49 };
        System.out.println("排序前的结果为："+Arrays.toString(a));
        quickSort(a);
        System.out.println("快速排序的结果为："+Arrays.toString(a));
    }
}
