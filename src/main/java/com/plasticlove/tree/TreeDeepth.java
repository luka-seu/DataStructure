package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 返回树的深度
 * @create 2019/4/3-17:45
 */
public class TreeDeepth {
    //返回二叉树的深度
    public static int getDeepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int left = getDeepth(root.left);
        int right = getDeepth(root.right);
        return (left>right)?(left+1):(right+1);
    }
}
