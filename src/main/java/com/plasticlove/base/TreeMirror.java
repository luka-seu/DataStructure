package com.plasticlove.base;

import com.plasticlove.tree.TreeNode;

/**
 * @author luka-seu
 * @description 树变为镜像
 * @create 2019-09 10-21:49
 **/

public class TreeMirror {

    public void mirror(TreeNode node){
       TreeNode temp = null;
       while(node!=null){
           temp = node.left;
           node.left=node.right;
           node.right=temp;
           if (node.left!=null){
               mirror(node.left);
           }
           if (node.right!=null){
               mirror(node.right);
           }
       }
    }
}
