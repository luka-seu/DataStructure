package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 斐波那契数列
 * @create 2019/4/3-17:57
 */
public class ArrayFibonacci {
    public static int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int prePreNum = 0;
        int preNum = 1;
        if(n>=2){
            int result = Fibonacci(n-1)+Fibonacci(n-2);
            return result;
        }
        return 0;


    }

}
