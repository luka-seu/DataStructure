package com.plasticlove.tree.test;


import com.plasticlove.tree.BinaryTree;
import com.plasticlove.tree.TreeNode;
import org.junit.Test;


public class TreeTest {
    @Test
    public void testTree(){
        BinaryTree binaryTree = new BinaryTree();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode10 = new TreeNode(10);

        TreeNode[] treeNodes = {treeNode5,treeNode2,treeNode1,treeNode4,treeNode7,treeNode9,treeNode6,treeNode10,treeNode3,treeNode8};
        binaryTree.buildBinaryTree(treeNodes);

        System.out.println("中序遍历");
        binaryTree.inOrder();
        System.out.println("前序遍历");
        binaryTree.preOrder();
        System.out.println("后序遍历");
        binaryTree.postOrder();
        System.out.println("层序遍历");
        binaryTree.layerPrint(binaryTree.getRoot());
    }



   /* BinaryTree binaryTree = new BinaryTree();
    TreeNode treeNode1 = new TreeNode(1);
    TreeNode treeNode2 = new TreeNode(2);
    TreeNode treeNode3 = new TreeNode(3);
    TreeNode treeNode4 = new TreeNode(4);
    TreeNode treeNode5 = new TreeNode(5);
    TreeNode treeNode6 = new TreeNode(6);
    binaryTree.*/

}
