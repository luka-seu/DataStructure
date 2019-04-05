package com.plasticlove.tencent;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author luka-seu
 * @description 硬币最少
 * @create 2019/4/5-19:56
 */
public class TencentCoins {
    ArrayList<Integer> coins = new ArrayList<>();

    //
    // public int leastCoins(int[] arr, int target) {
    //     Arrays.sort(arr);
    //     if (arr[0] != 1) {
    //         return -1;
    //     }
    //     ArrayList<Integer> list = new ArrayList<>();
    //
    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         if (arr[i] <= target) {
    //             list.add(arr[i]);
    //         }
    //     }
    //
    //
    //     for (int k = 1; k <= target; k++) {
    //         if (list.contains(k)) {
    //             resultArr[k] = 1;
    //             continue;
    //         } else {
    //             int temp = Integer.MAX_VALUE;
    //             for (int m = 0; m < list.size(); m++) {
    //
    //                 if (list.get(m) <= k) {
    //                     int temp1 = resultArr[k - list.get(m)] + 1;
    //                     if (temp1 < temp) {
    //                         temp = temp1;
    //                     }
    //                 }
    //             }
    //             resultArr[k] = temp;
    //         }
    //
    //
    //     }
    //     int count = 0;
    //     for (int m = 0; m < resultArr.length; m++) {
    //         count = count + resultArr[m];
    //     }
    //     return count;
    // }

    public int getCoins2(int[] arr, int target) {
        int[] nums = new int[target + 1];
        nums[0] = 0;
        for (int k = 1; k <=target; k++) {
            nums[k] = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (k >= arr[i] && nums[k] > nums[k - arr[i]] + 1) {
                    nums[k] = nums[k -arr[i]] + 1;
                }
            }
        }
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            count+=nums[i];
        }
        return nums[target];


    }
    @Test
    public void test(){
        int[] arr = {1,2,3,5,10};
        int coins2 = this.getCoins2(arr, 20);
        System.out.println(coins2);
    }



    public int remove01(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        Stack<Character> cStack = new Stack<>();
        cStack.push(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            int temp1 = str.charAt(i) - 48;

            if (!cStack.isEmpty()) {
                int temp2 = cStack.peek() - 48;
                if (temp1 + temp2 == 1) {
                    cStack.push(str.charAt(i));
                    cStack.pop();
                    cStack.pop();
                } else {
                    cStack.push(str.charAt(i));
                }
            } else {
                cStack.push(str.charAt(i));
            }
        }
        return cStack.size();
    }

    @Test
    public void test1() {
        int i = this.remove01("010101010101010101011");
        System.out.println(i);
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int strLen = sc.nextInt();
    //     String str = sc.next();
    //     System.out.println(remove01(str));
    // }
}
