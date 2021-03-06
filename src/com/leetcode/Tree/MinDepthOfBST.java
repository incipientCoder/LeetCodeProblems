package com.leetcode.Tree;

import com.leetcode.list.LinkedList;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class MinDepthOfBST {
    public MinDepthOfBST(){

    }

    public int findMinDepthOfBST( TreeNode root){
        if(root == null)
            return 0;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int step =1;
        TreeNode temp = root;
        while(!list.isEmpty()){
            int size = list.size();

            for(int i=0;i<size;i++){
                temp = list.remove(0);

                if(temp.left == null  && temp.right == null){
                    return step;
                }
                if(temp.left != null){
                    list.add(temp.left);
                }
                if(temp.right != null){
                    list.add(temp.right);
                }
            }
            step++;
        }

        return step;
    }

    public static int minDepth(TreeNode root) {
        if (root == null)	return 0;
        if (root.left == null)	return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
    }
}
