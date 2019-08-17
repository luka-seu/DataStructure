package com.plasticlove.sorts;

import org.junit.Test;

/**
 * 小和问题：将数组中的每个数左边比它小的数加起来的和
 * 归并排序的应用
 *
 * @author Luka
 */
public class LittleSum {
    @Test
    public void test() {
        int[] arr = {23, 34, 2, 54, 678, 23, 12, 35};
        System.out.println(this.mergeSort(arr, 0, arr.length - 1));

    }


    public int mergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return 0;
        }
        int mid = (right + left) / 2;
        //递归是左侧的小和和右侧的小和，最后加上合并的小和
        return mergeSort(arr, left, mid)
                + mergeSort(arr, mid + 1, right)
                + merge(arr, left, mid, right);

    }

    public int merge(int[] arr, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int l = left;
        int r = mid + 1;
        int res = 0;
        int i = 0;
        while (l <= mid && r <= right) {
            if (arr[l] < arr[r]) {
                res = res + (right - r + 1) * arr[l];
                help[i++] = arr[l++];
            } else {
                help[i++] = arr[r++];
            }

        }
        while (l <= mid) {
            help[i++] = arr[l++];
        }
        while (r <= right) {
            help[i++] = arr[r++];
        }
        for (int k = 0; k < help.length; k++) {
            arr[k] = help[k];
        }
        return res;

    }
}
