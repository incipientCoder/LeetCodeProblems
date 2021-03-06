package com.leetcode.Sorting;

public class MergeSort {
    public void sort(int[] nums, int l,int r){
        int m =(l+r)/2;
        if(l<r) {
            sort(nums, l, m);
            sort(nums, m + 1, r);
            mergeSort(nums, l, m, r);
        }
    }
    public void mergeSort(int[] nums , int l , int m, int r){
        int nL=m-l+1;
        int nR=r-m;
        int[] L= new int[nL];
        int[] R= new int[nR];

        for(int i=0;i<nL;i++){
            L[i]= nums[l+i];
        }
        for(int i=0;i<nR;i++){
            R[i]= nums[m+1+i];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<nL && j< nR){
            if(L[i] <=R[j])
            {
                nums[k]=L[i];
                i++;
                k++;
            }else{
                nums[k]=R[j];
                j++;
                k++;
            }
        }
        while(i<nL){
            nums[k]=L[i];
            i++;
            k++;
        }
        while(j<nR){
            nums[k]=R[j];
            j++;
            k++;
        }
    }
}
