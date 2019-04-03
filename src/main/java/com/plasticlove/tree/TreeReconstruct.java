package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 重建二叉树
 * @create 2019/4/3-17:49
 */
public class TreeReconstruct {
    //重建二叉树，根据前序和中序遍历结果重建二叉树
    public static TreeNode reconstructTree(int[] frontArr,int frontStart,int frontEnd,int[] middleArr,int middleStart,int middleEnd){

        if (frontStart>frontEnd||middleStart>middleEnd){
            return null;
        }
        TreeNode root = new TreeNode(frontArr[frontStart]);
        //在中序遍历中找到根节点
        for (int i = middleStart;i<=middleEnd;i++){
            if (frontArr[frontStart]==middleArr[i]){
                //递归调用
                root.left = reconstructTree(frontArr,frontStart+1,frontStart+(i-middleStart),middleArr,middleStart,i-1);
                root.right = reconstructTree(frontArr,frontStart+(i-middleStart)+1,frontEnd,middleArr,i+1,middleEnd);
            }

        }

        return root;
    }
}
