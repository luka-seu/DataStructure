package com.plasticlove.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author luka-seu
 * @description
 * @create 2019-09 07-01:19
 **/

//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
// candidates 中的数字可以无限制重复被选取。
//
// 说明：
//
//
// 所有数字（包括 target）都是正整数。
// 解集不能包含重复的组合。
//
//
// 示例 1:
//
// 输入: candidates = [2,3,6,7], target = 7,
//所求解集为:
//[
//  [7],
//  [2,2,3]
//]
//
//
// 示例 2:
//
// 输入: candidates = [2,3,5], target = 8,
//所求解集为:
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//]
// Related Topics 数组 回溯算法



public class Combination_Sum_39 {

    @Test
    public void test(){
        int[] candidates = {2,5,1,3,4};
        int target = 9;
        //TODO 为什么要先排序？
        Arrays.sort(candidates);
        List<List<Integer>> lists = this.combinationSum(candidates, target);
        System.out.println(lists);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //递归/回溯
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        this.helper(lists,list,candidates,target,0);
        return lists;

    }
    //递归
    public void helper(List<List<Integer>> listALL,List<Integer> list,int[] candidates,int target,int index){
        if (target==0){
            listALL.add(list);
            return;
        }
        if (target<0){
            return;
        }
        //i从index开始，防止重复；找和为target,相当于找数组的的和为target-candidates[i]
        for (int i = index;i<candidates.length&&candidates[i]<=target;i++){
            list.add(candidates[i]);
            //这个地方必须要新建list进入下次迭代，因为这个下面数组其他的数需要用到这个list
            helper(listALL,new ArrayList<>(list),candidates,target-candidates[i],i);
            //当target<0时，说明listd的数之和大于target，移除最后一个数，再取匹配
            list.remove(list.size()-1);
        }
    }
}
