package com.plasticlove.math;

import org.junit.Test;

/**
 * 获取最大公约数
 */
public class ZuiDaGongYueShu {

    public int getZDGYS(int num1,int num2){
        //确保num1>num2
        if (num2>num1){
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }
        //如果能整除，就是num2
        if (num1 % num2 == 0){
            return num2;
        }
        while(num1 % num2 != 0){
            //取余，不是除法
            num1 = num1 % num2;
            //确保num1>num2
            if (num2>num1){
                num1 = num1 + num2;
                num2 = num1 - num2;
                num1 = num1 - num2;
            }
            if (num1 % num2 == 0){
                return num2;
            }

        }
        return 1;
    }


    @Test
    public void test(){
        System.out.println(this.getZDGYS(84,56));
    }
}
