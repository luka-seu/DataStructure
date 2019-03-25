package com.plasticlove.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author luka-seu
 * @description 二叉树相关操作
 * @create 2019/3/19-20:23
 */
public class BinaryTreeUtils {
    //新建二叉搜索树
    public static TreeNode binarySearchTree(TreeNode root,int data){
        TreeNode node = new TreeNode(data);

        if (root==null){
            return node;
        }else{
            TreeNode curNode = root;
            TreeNode parNode = null;
            while (true){
                parNode = curNode;//保存当前的节点
                if (curNode.getData()>data){       //每次用当前节点进行比较
                    curNode = curNode.getLeftTree();
                    if (curNode==null){
                       parNode.setLeftTree(node);
                        return root;
                    }
                }else{
                    curNode=curNode.getRightTree();
                    if (curNode==null){
                        parNode.setRightTree(node);
                        return root;
                    }
                }
            }

        }




    }

    //中序遍历

    public static void middleOrder(TreeNode root){
        if (root==null){
            return ;
        }
        List<Integer> middleList = new ArrayList<>();
        middleOrder(root.getLeftTree());
        System.out.println(root.getData());
        middleOrder(root.getRightTree());
    }

    //返回二叉树的深度
    public static int getDeepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int left = getDeepth(root.getLeftTree());
        int right = getDeepth(root.getRightTree());
        return (left>right)?(left+1):(right+1);
    }
    //层序遍历二叉树（队列）
    public static void layerPrint(TreeNode root){
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        ((LinkedList<TreeNode>) treeNodeQueue).add(root);
        while(treeNodeQueue.size()>0){
            TreeNode node = ((LinkedList<TreeNode>) treeNodeQueue).getFirst();
            ((LinkedList<TreeNode>) treeNodeQueue).pop();
            System.out.println(node);
            if (node.getLeftTree()!=null){
                ((LinkedList<TreeNode>) treeNodeQueue).add(node.getLeftTree());
            }

            if (node.getRightTree()!=null){
                ((LinkedList<TreeNode>) treeNodeQueue).add(node.getRightTree());
            }
        }
    }


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
                root.setLeftTree(reconstructTree(frontArr,frontStart+1,frontStart+(i-middleStart),middleArr,middleStart,i-1));
                root.setRightTree(reconstructTree(frontArr,frontStart+(i-middleStart)+1,frontEnd,middleArr,i+1,middleEnd));
            }

        }

        return root;
    }


    //找出二叉树中的第k大的节点

    public static TreeNode getKthNode(TreeNode root,int k){
        if (root==null||k==0){
            return null;
        }
        TreeNode target = null;
        if (root.getLeftTree()!=null){
            target = getKthNode(root.getLeftTree(),k);
        }
        if (target==null){
            if (k==1){
                target=root;
            }
            k--;
        }
        if (target==null&&root.getRightTree()!=null){
            target = getKthNode(root.getRightTree(),k);
        }
        return target;
    }












}
