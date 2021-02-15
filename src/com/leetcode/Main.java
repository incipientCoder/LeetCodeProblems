package com.leetcode;

import com.leetcode.Arrays.BestTimeToBuyAndSellStock;
import com.leetcode.Arrays.ContainsDuplicates;
import com.leetcode.Arrays.RemoveDuplicatesFromArrayAndReturnLength;
import com.leetcode.Arrays.RotateArray;

public class Main {

    public static void main(String[] args) {
	// Invoking the RemoveDuplicatesFromArrayAndReturnLength Class
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromArrayAndReturnLength removeDups = new RemoveDuplicatesFromArrayAndReturnLength(nums);
        removeDups.removeDuplicates(nums);

    // Invoking the BestTimeToBuyAndSellStock Class

        int[] pricesArray1= {7,1,5,3,6,4};
        int[] pricesArray2 ={1,2,3,4,5};
        int[] pricesArray3 = {7,6,4,3,1};

        BestTimeToBuyAndSellStock profit = new BestTimeToBuyAndSellStock();
        profit.maxProfit(pricesArray1);
        profit.maxProfit(pricesArray2);
        profit.maxProfit(pricesArray3);

    // Invoking the RotateArray Class

        int[] array= {1,2,3,4,5,6,7};
        int k=3;

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, k);

      // Invoking the containsDuplicates Class. (Checks if the Array has some duplicates.)
        int[] array1 ={1,1,1,3,3,4,3,2,4,2};
        int[] array2={1,2,3,4};
        int[] array3 ={1,2,3,1};


        ContainsDuplicates  checkDuplicate= new ContainsDuplicates();
        checkDuplicate.containsDuplicates(array1);
        checkDuplicate.containDuplicatesWithHashSet(array3);
        checkDuplicate.containsDuplicates(array2);
    }
}
