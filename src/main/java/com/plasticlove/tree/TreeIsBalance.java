package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * @create 2019/4/3-18:18
 */
public class TreeIsBalance {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null) return true;
        int leftDeepth = 1+getDeepth(root.left);
        int rightDeepth = 1+getDeepth(root.right);
        if (Math.abs(leftDeepth - rightDeepth) > 1) return false;
        return (IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right));
    }
    //先求解树的高度
    public int getDeepth(TreeNode root){
        if (root==null) return 0;
        int leftDeepth = 1+getDeepth(root.left);
        int rightDeepth = 1+getDeepth(root.right);

        return leftDeepth>rightDeepth?leftDeepth:rightDeepth;
    }
}
