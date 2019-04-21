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
            //连续整数序列的求和公式
            //(首项+末项)*项数/2
            int cur = (low+high)*(high-low+1)/2;
            if(cur==sum){
                //获取当前序列的所有值
                ArrayList<Integer> list = new ArrayList();
                for(int i = low;i<=high;i++){
                    list.add(i);
                }
                result.add(list);
                //遍历其他序列
                low++;
            }else if(cur>sum){
                low++;
            }else{
                high++;
            }
        }
        return result;
    }
}
