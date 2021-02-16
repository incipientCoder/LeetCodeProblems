package com.leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    /***
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     *
     * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,2,1]
     * Output: 1
     *
     * Example 2:
     *
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     *
     * Example 3:
     *
     * Input: nums = [1]
     * Output: 1
     */

    public SingleNumber(){
    }

    /***
     * By Bit Manipulation
     * a exor 0 = a; a exor a =0; so if a array contains every element twice and only one element once , we can get te element by exor operation of all the elements in the array.
     */

    public int findSingleNumberByBitManipulation(int[] nums){
        int number =0;
        for(int num : nums){
            number ^= num; // number =number ^ num;
        }
        return number;
    }


    /***
     * Iterate through the element of the array
     * if the element is not already present in the list, then add it to the list
     *If already present , then remove the element from the list. This way only the element which is present once will be part of the list.
     */

    public int findSingleNumberUsingList(int[] nums){
        List<Integer> list = new ArrayList<Integer>();
        for( int num : nums){
            if(!list.contains(num)){
                list.add(num);
            }
            else{
                list.remove(new Integer(num));
            }
        }
        return list.get(0);
    }



}
