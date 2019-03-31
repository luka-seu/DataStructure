package com.com.plasticlove.test;

import com.plasticlove.tree.BinarySearchTree;
import com.plasticlove.tree.BinaryTreeUtils;
import com.plasticlove.tree.TreeNode;
import org.junit.Test;



public class BinaryTreeUtilsTest {

    @Test
    public void reconstructTreeTest() {
        int[] arr1 = {1,2,4,7,3,5,6,8};
        int[] arr2 = {4,7,2,1,5,3,8,6};
        TreeNode tree = BinaryTreeUtils.reconstructTree(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);
        System.out.println(tree);
    }

    @Test
    public void testGetKthNode(){
        int[] arr1 = {1,2,4,7,3,5,6,8};
        int[] arr2 = {4,7,2,1,5,3,8,6};
        TreeNode tree = BinaryTreeUtils.reconstructTree(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);
        TreeNode kthNode = BinaryTreeUtils.getKthNode(tree, 2);
        BinaryTreeUtils.middleOrder(tree);
        // System.out.println(kthNode);

    }

    @Test
    public void testBinarySearch(){
        TreeNode node = null;
        TreeNode node1 = BinaryTreeUtils.binarySearchTree(node, 23);
        TreeNode node2 = BinaryTreeUtils.binarySearchTree(node1,45);
        TreeNode node3 = BinaryTreeUtils.binarySearchTree(node2,34);
        TreeNode node4 = BinaryTreeUtils.binarySearchTree(node3,67);
        TreeNode node5 = BinaryTreeUtils.binarySearchTree(node4,12);
        TreeNode node6 = BinaryTreeUtils.binarySearchTree(node5,78);
        TreeNode node7 = BinaryTreeUtils.binarySearchTree(node6,24);

        TreeNode kthNode = BinaryTreeUtils.getKthNode(node7, 2);
        System.out.println(kthNode);


    }

    @Test
    public void testGetDeepth(){
        int[] arr1 = {1,2,4,7,3,5,6,8};
        int[] arr2 = {4,7,2,1,5,3,8,6};
        TreeNode tree = BinaryTreeUtils.reconstructTree(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);

        int deepth = BinaryTreeUtils.getDeepth(tree);
        System.out.println(deepth);
    }

    @Test
    public void layerPrint(){
        int[] arr1 = {8,6,5,7,10,9,11};
        int[] arr2 = {5,6,7,8,9,10,11};
        TreeNode tree = BinaryTreeUtils.reconstructTree(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);
        BinaryTreeUtils.layerPrint(tree);
    }

    @Test
    public void testMid(){
        int[] arr1 = {8,6,5,7,10,9,11};
        int[] arr2 = {5,6,7,8,9,10,11};
        TreeNode tree = BinaryTreeUtils.reconstructTree(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);
        BinaryTreeUtils.middleOrder(tree);
    }
}