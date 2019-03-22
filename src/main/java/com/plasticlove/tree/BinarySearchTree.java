package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 二叉搜索树
 * @create 2019/3/22-17:26
 */
public class BinarySearchTree {
    public TreeNode root;
    public BinarySearchTree(){
        this.root  = null;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
