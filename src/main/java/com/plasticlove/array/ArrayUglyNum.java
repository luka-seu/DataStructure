package com.plasticlove.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luka-seu
 * @description 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @create 2019-04 04-00:27
 **/

public class ArrayUglyNum {

    public int GetUglyNumber(int index) {
        if(index==0){
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        while(list.size()<index){
            int r2 = list.get(i2)*2;
            int r3 = list.get(i3)*3;
            int r5 = list.get(i5)*5;
            int min = Math.min(r2,Math.min(r3,r5));
            list.add(min);
            if (min==r2){
                i2++;
            }
            if (min==r3){
                i3++;
            }
            if (min==r5){
                i5++;
            }
        }
        return list.get(list.size()-1);
    }
}
