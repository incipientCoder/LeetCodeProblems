package com.leetcode.Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public InOrderTraversal(){

    }

    public List<Integer> inOrderTraversalRecursion(TreeNode root){
        List<Integer> list = new ArrayList<>();
        return helper(list,root);
    }
    public List<Integer> helper(List<Integer> list , TreeNode root){
        if (root != null) {
            if(root.left!=null){
                helper(list,root.left);
            }
            list.add(root.val);
            if(root.right !=null){
                helper(list,root.right);
            }
        }
        return list;
    }

    public List<Integer> inOrderTraversalIteration(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while(temp != null ||  !stack.isEmpty()){
            while(temp !=null){
                stack.push(temp);
                temp=temp.left;
            }
            temp = stack.pop();
            list.add(temp.val);
            temp=temp.right;
        }

        return list;
    }

}
