package com.plasticlove.tree;

/**
 * @author luka-seu
 * @description 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @create 2019/4/3-18:08
 */
public class TreeHasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1!=null&&root2!=null){
            if(root1.data==root2.data){
                result = subTree(root1,root2);
            }
            if(!result){
                result = HasSubtree(root1.left,root2);
            }
            if(!result){
                result = HasSubtree(root1.right,root2);
            }
        }
        return result;
    }
    public boolean subTree(TreeNode node1,TreeNode node2){
        if(node2==null){
            return true;
        }
        if(node1==null){
            return false;
        }
        if(node1.data!=node2.data){
            return false;
        }

        return subTree(node1.left,node2.left)&&subTree(node1.right,node2.right);
    }
}
