package com.leetcode;

import com.leetcode.Arrays.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Invoking the RemoveDuplicatesFromArrayAndReturnLength Class
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesFromArrayAndReturnLength removeDups = new RemoveDuplicatesFromArrayAndReturnLength(nums);
        removeDups.removeDuplicates(nums);

        // Invoking the BestTimeToBuyAndSellStock Class

        int[] pricesArray1 = {7, 1, 5, 3, 6, 4};
        int[] pricesArray2 = {1, 2, 3, 4, 5};
        int[] pricesArray3 = {7, 6, 4, 3, 1};

        BestTimeToBuyAndSellStock profit = new BestTimeToBuyAndSellStock();
        profit.maxProfit(pricesArray1);
        profit.maxProfit(pricesArray2);
        profit.maxProfit(pricesArray3);

        // Invoking the RotateArray Class

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, k);

        // Invoking the containsDuplicates Class. (Checks if the Array has some duplicates.)
        int[] array1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 1};


        ContainsDuplicates checkDuplicate = new ContainsDuplicates();
        checkDuplicate.containsDuplicates(array1);
        checkDuplicate.containDuplicatesWithHashSet(array3);
        checkDuplicate.containsDuplicates(array2);

        // Invoke SingleNumber Class( Find the number which is present only once in a array)

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        SingleNumber number = new SingleNumber();
        System.out.println("The Single number in the given array " + Arrays.toString(nums1) + " is " + number.findSingleNumberByBitManipulation(nums1));
        System.out.println("The Single number in the given array " + Arrays.toString(nums2) + " is " + number.findSingleNumberUsingList(nums2));
        System.out.println("The Single number in the given array " + Arrays.toString(nums3) + " is " + number.findSingleNumberByBitManipulation(nums3));

        //Invoke Intersect Two Arrays

        int[] numberArray1 = {1, 2, 2, 1};
        int[] numberArray2 = {2, 2};
        IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();
        System.out.println(" The Intersection of Two Arrays , Array 1 = " + Arrays.toString(numberArray1) + ", Array 2  = " + Arrays.toString(numberArray2) + " is " + Arrays.toString(intersection.intersectionOfTwoArrays(numberArray1, numberArray2)));


        //Invoke Plus One Class .
        int[] numsArray = {1, 2, 3};
        int[] numsArray1 = {9, 9, 9};

        PlusOne plusone = new PlusOne();
        System.out.println("The Input Array : " + Arrays.toString(numsArray) + " , The OutPut Array after adding one is : " + Arrays.toString(plusone.plusOneFunction(numsArray)));
        System.out.println("The Input Array : " + Arrays.toString(numsArray1) + " , The OutPut Array after adding one is : " + Arrays.toString(plusone.plusOneFunction(numsArray1)));

        //Invoke MoveZeroes

        int[] zeroArray1 = {0, 1, 0, 3, 12};
        int[] zeroArray2 = {0,0,0,5,4};

        MoveZeroes moveZeroes = new MoveZeroes();

        System.out.println("The Input Array : "+ Arrays.toString(zeroArray1));
        moveZeroes.moveZeroes(zeroArray1);
        System.out.println("The Output Array after moving zeroes : "+ Arrays.toString(zeroArray1));

        System.out.println("The Input Array : "+ Arrays.toString(zeroArray2));
        moveZeroes.moveZeroes(zeroArray2);
        System.out.println("The Output Array after moving zeroes : "+ Arrays.toString(zeroArray2));

        //Invoke TwoSum Class

        int[] sumArray1={2,7,11,15};
        int[] sumArray2={3,2,4};

        TwoSums sum = new TwoSums();
      int[] result1=  sum.twoSums(sumArray1 , 18);
      int[] result2=  sum.twoSums(sumArray2,7);

      System.out.println("The Input Array : "+Arrays.toString(sumArray1) +" , Target : 18 , Output Sum Array Positions : "+Arrays.toString(result1));
        System.out.println("The Input Array : "+Arrays.toString(sumArray2) +" , Target : 7 , Output Sum Array Positions : "+Arrays.toString(result2));


    }
}
