package com.leetcode.Tree;

import com.sun.source.tree.Tree;


public class ValidateBinarySearchTree {
//    private Integer prev;
//
//    public boolean  isValidBST(Tree root){
//        prev= null;
//        return inorder(root);
//    }
//
//
//    public boolean inorder(Tree root){
//        if(root == null)
//            return  true;
//        if( ! (inorder(root.left)){
//            return false;
//
//            if(prev != null && root.val <= prev)
//                return false;
//            prev= root.val;
//            return inorder(root.right)
//        }
//    }
//
//

        public boolean isValidBST(TreeNode root) {
            return validate(root, null, null);
        }
        public boolean validate(TreeNode root, Integer min, Integer max){
            if (root == null)
                return true;
            if (min != null && root.val <= min)
                return false;
            if (max != null && root.val >= max)
                return false;
            return validate(root.left, min, root.val) && validate(root.right, root.val, max);
        }

}
