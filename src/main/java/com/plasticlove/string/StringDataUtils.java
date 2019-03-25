package com.plasticlove.string;

/**
 * @author luka-seu
 * @description 字符串相关算法
 * @create 2019/3/25-16:40
 */
public class StringDataUtils {


    /**
     * 字符串最长不重复子串
     * 动态规划 f(i)表示以第i个字符结尾的最大不重复子串，当判断到第i个字符时判断i在之前有没有出现过。出现过算两次出现之间的差，没有出现直接加1
     * @param s
     * @return
     */
    public static int getLongestSubStrWithoutDup(String s) {
        int cur = 0;
        int max = 0;
        int[] pos = new int[26];
        for (int i = 0; i < pos.length; i++) {
            pos[i] = -1;
        }
        for (int k = 0; k < s.length(); k++) {
            int index = pos[s.charAt(k) - 'a'];
            if (index < 0 || k - index > cur) {
                cur++;
            }else {
                if (cur > max) {
                    max = cur;
                }
                cur = k - index;
            }


            pos[s.charAt(k) - 'a'] = k;
        }
        if (cur>max){
            max=cur;
        }
        return max;
    }
}
