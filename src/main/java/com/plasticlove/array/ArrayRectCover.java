package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 矩形覆盖
 * @create 2019/4/3-18:00
 */
public class ArrayRectCover {
    public int RectCover(int target) {
        if(target<1){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        if(target>2){
            return RectCover(target-1)+RectCover(target-2);
        }
        return 0;
    }
}
