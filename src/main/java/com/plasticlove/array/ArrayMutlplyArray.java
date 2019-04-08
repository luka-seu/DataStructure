package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 构建乘积数组
 * @create 2019/4/8-13:46
 */
public class ArrayMutlplyArray {
    public int[] multiply(int[] A) {
        if(A.length==0){
            return A;
        }
        int len = A.length;
        int[] forward = new int[len];
        int[] backend = new int[len];
        int[] B = new int[len];
        forward[0] = 1;
        backend[0] = 1;
        for (int i = 1;i<len;i++){
            forward[i] = forward[i-1]*A[i-1];
            backend[i] = A[len-i]*backend[i-1];
        }

        for (int i = 0;i<len;i++){
            B[i] = forward[i]*backend[len-i-1];
        }
        return B;

    }
}
