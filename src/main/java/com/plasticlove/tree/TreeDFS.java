package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 树的深度优先遍历
 * @create 2019/4/3-17:43
 */
public class TreeDFS {
    public static void middleOrder(TreeNode root){
        if (root==null){
            return ;
        }
        middleOrder(root.left);
        System.out.println(root.data);
        middleOrder(root.right);
    }
}
