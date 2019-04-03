package com.plasticlove.array;

/**
 * @author luka-seu
 * @description 变态跳台阶
 * @create 2019/4/3-17:59
 */
public class ArrrayJumpFloorII {
    public int JumpFloorII(int target) {
        if(target<=0){
            return 0;
        }
        else if(target==1){
            return 1;
        }
        else{
            return 2*JumpFloorII(target-1);
        }
    }

}
