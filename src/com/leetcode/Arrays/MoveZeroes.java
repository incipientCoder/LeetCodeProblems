package com.leetcode.Arrays;

/***
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Note:
 *
 *     You must do this in-place without making a copy of the array.
 *     Minimize the total number of operations.
 */
public class MoveZeroes {

    public MoveZeroes(){

    }

    /***
     * keep a tracker for the nonzeroIndex;
     * traverse through the number array and if the current number is non zero , then assign the element to the lastNonZeroIndex
     * then increment the nonZeroCounter by 1;
     * then assign the remaining element to zero from lastNonZeroIndex to the length of the array
     * @param nums
     */
    public void moveZeroes(int[] nums){
        int lastNonZeroIndex = 0;
        for(int i =0;i<nums.length ;i++){
            if(nums[i] != 0 ){
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        for(int i=lastNonZeroIndex; i< nums.length ;i++){
            nums[i] = 0;
        }
    }
}

