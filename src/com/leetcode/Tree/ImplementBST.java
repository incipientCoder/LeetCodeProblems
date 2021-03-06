package com.leetcode.Tree;

public class ImplementBST {

    public ImplementBST(){

    }

    public TreeNode sortedArraytoBST(int[] array){
        return converter(array,0 ,array.length-1);
    }
    public TreeNode converter(int[] array , int start, int end){
        if(start>end)
            return null;
        int mid = start+(end-start)/2;
        System.out.println(" the  mid value is "+ mid);
        TreeNode temp = new TreeNode(array[mid]);
        temp.left= converter(array,0,mid-1);
        temp.right = converter(array,mid+1,end);

        return temp;
    }
}
