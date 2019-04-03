package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @create 2019/4/3-18:09
 */
public class TreeMirror {
    public void Mirror(TreeNode root) {
        TreeNode temp = null;
        if(root!=null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left!=null){
                Mirror(root.left);
            }
            if(root.right!=null){
                Mirror(root.right);
            }
        }
    }
}
