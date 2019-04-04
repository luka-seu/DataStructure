package com.plasticlove.string;

/**
 * @author luka-seu
 * @description 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @create 2019/4/4-15:27
 */
public class StringSumWithout {

    public int Sum_Solution(int n) {
        int sum = n;
        //利用&&短路的性质
        boolean b = (n >0) && ((sum += Sum_Solution(--n))>0);
        return sum;
    }
}
