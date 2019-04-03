package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @create 2019/4/3-18:13
 */
public class TreeVerifySequenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        if(sequence.length==1){
            return true;
        }
        return judge(sequence,0,sequence.length-1);



    }
    public boolean judge(int[] arr,int start,int end){
        if(start>=end){
            return true;
        }
        int i = start;
        while(arr[i]<arr[end]){
            ++i;
        }
        for(int j = i;j<end;j++){
            if(arr[j]<arr[end]){
                return false;
            }
        }
        return judge(arr,start,i-1)&&judge(arr,i,end-1);

    }

}
