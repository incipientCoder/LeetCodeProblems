package com.leetcode.Sorting;

public class BubbleSort {
    public BubbleSort(){

    }


    public int[] bubbleSortingImplementation(int[] nums){
        int length = nums.length;
        boolean swapped;
        int count=0;
        for(int i=0;i<length-1;i++){
             swapped=false;
            for(int j=0;j<length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums, j ,(j+1));
                    swapped=true;
                }

                count++;

            }
            if(swapped == false)
                break;
            count++;
        }
        System.out.println("Count : "+count);
       return nums;
    }


    public void swap(int[] nums,int i , int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
