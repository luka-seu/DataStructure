package com.plasticlove.array;

import java.util.ArrayList;

/**
 * @author luka-seu
 * @description 和为S的连续正数序列
 * @create 2019/4/3-18:19
 */
public class ArrayContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int low = 1;
        int high = 2;
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        while(low<high){
            int cur = (low+high)*(high-low+1)/2;
            if(cur==sum){
                ArrayList<Integer> list = new ArrayList();
                for(int i = low;i<=high;i++){
                    list.add(i);
                }
                result.add(list);
                low++;//遍历其他序列
            }else if(cur>sum){
                low++;
            }else{
                high++;
            }
        }
        return result;
    }
}
