package com.leetcode.Arrays;

import java.util.Arrays;

/***
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Follow up:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */

public class RotateArray {

    public RotateArray(){

    }
    public RotateArray(int[] inputArray , int k){
        int[] array = inputArray;
        int steps = k ;

    }


    /***
     * Original List                   : 1 2 3 4 5 6 7
     * so length of array n=7 and Shift by Positions k=3
     * First Reverse the complete Array : 7 6 5 4 3 2 1
     * Then Reverse the first k elements ( position 0 to 2) : 5 6 7 4 3 2 1
     * Then Reverse the k to n-1 elements  ( position 3 to 6) : 5 6 7 1 2 3 4
     */

    public void rotate (int[] nums, int k){
        k= k % nums.length;
        reversenum(nums,0,nums.length-1);
        reversenum(nums, 0 , k-1);
        reversenum(nums, k , nums.length-1);
        System.out.println("The Rotated array is " + Arrays.toString(nums));
    }

    public void reversenum(int[] nums, int start , int end){
        while(start <end){
            int temp= nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}
