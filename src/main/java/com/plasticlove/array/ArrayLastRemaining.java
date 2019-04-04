package com.plasticlove.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author luka-seu
 * @description 圆圈中最后剩下的数
 * @create 2019/4/4-14:57
 */
public class ArrayLastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0 || m <= 0) {
            return -1;
        }
        //还是要有数组来做
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = -1;
        while (list.size() > 1) {
            index = (index + m) % list.size();
            list.remove(index);
            index--;
        }
        return list.get(0);
    }
}
