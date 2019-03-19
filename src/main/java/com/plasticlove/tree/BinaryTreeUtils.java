package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 二叉树相关操作
 * @create 2019/3/19-20:23
 */
public class BinaryTreeUtils {

    //重建二叉树，根据前序和中序遍历结果重建二叉树
    public static TreeNode reconstructTree(int[] frontArr,int frontStart,int frontEnd,int[] middleArr,int middleStart,int middleEnd){

        if (frontStart>frontEnd||middleStart>middleEnd){
            return null;
        }
        TreeNode root = new TreeNode(frontArr[frontStart]);
        //在中序遍历中找到根节点
        for (int i = middleStart;i<=middleEnd;i++){
            if (frontArr[frontStart]==middleArr[i]){
                root.setLeftTree(reconstructTree(frontArr,frontStart+1,frontStart+(i-middleStart),middleArr,middleStart,i-1));
                root.setRightTree(reconstructTree(frontArr,frontStart+(i-middleStart)+1,frontEnd,middleArr,i+1,middleEnd));
            }

        }

        return root;
    }
}
