package com.leetcode.Tree;

public class MaxDepthOfBST {
    public  MaxDepthOfBST(){

    }
    public int findMaxDepthOfBST(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null)
            return findMaxDepthOfBST(root.right)+1;
        if(root.right == null)
            return findMaxDepthOfBST(root.left)+1;
        return Math.max(findMaxDepthOfBST(root.left),findMaxDepthOfBST(root.right))+1;
    }
}
