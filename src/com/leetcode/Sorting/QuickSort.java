package com.leetcode.Sorting;

public class QuickSort {
    int low,high;
    public QuickSort(int[] nums){
        low=0;
        high=nums.length-1;
    }

    public int[] quickSortImplementation(int[] nums, int low ,int high){
        int i=low;
        int j=high;
        int pivot =nums[low+((high-low)/2)];

        while(i<=j){
            {
                while(nums[i]<=pivot){
                    i++;
                }

                while(nums[j]> pivot){
                    j--;
                }
                if(i<j){
                    swap(nums,i,j);
                    i++;
                    j--;
                }
                if(low<j){
                    quickSortImplementation(nums,low,j);
                }
                if(i<high){
                    quickSortImplementation(nums,i,high);
                }
            }

        }
        return nums;
    }

    public void swap(int[] nums , int i , int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}
