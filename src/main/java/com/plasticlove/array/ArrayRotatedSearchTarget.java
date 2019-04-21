package com.plasticlove.array;

import org.junit.Test;

/**
 * @author luka-seu
 * @description 旋转数组寻找目标数
 * <p>
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * <p>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>
 * You may assume no duplicate exists in the array.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * @create 2019/4/21-22:00
 */
public class ArrayRotatedSearchTarget {


    public int getTarget(int[] arr, int target) {


        return helper(arr, 0, arr.length - 1, target);
    }

    public int helper(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if (arr[mid] == target) {
            return mid;
        }
        //左边排好序的
        if (arr[start] < arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                for (int i = start; i < mid; i++) {
                    if (arr[i] == target) {
                        return i;
                    }
                }
            } else {
                return helper(arr, mid + 1, end, target);
            }
        } else if (arr[mid] < arr[end]) {
            if (target > arr[mid] && target <= arr[end]) {
                for (int i = mid + 1; i < end; i++) {
                    if (arr[i] == target) {
                        return i;
                    }
                }
            } else {
                return helper(arr, start, mid-1, target);
            }



        }
        return -1;
    }

        @Test
        public void test () {
            int[] arr = {4, 5, 6, 7, 0, 1, 2};
            System.out.println(getTarget(arr, 2));
        }
    }
