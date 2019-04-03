package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 跳台阶
 * @create 2019/4/3-17:58
 */
public class ArrayJumpFloor {
    public int JumpFloor(int target) {
        if(target==0){
            return 0;
        }
        else if(target==1){
            return 1;
        }
        else if(target==2){
            return 2;

        }
        else if(target>2){
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
        else{
            return 0;
        }
    }
}
