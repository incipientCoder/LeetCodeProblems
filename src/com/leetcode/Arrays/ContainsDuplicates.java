package com.leetcode.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 *Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: true
 *
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: false
 *
 * Example 3:
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicates {
    public ContainsDuplicates(){
    }

    /***
     *

     Time complexity : O(nlogn)O(n \log n)O(nlogn). Sorting is O(nlogn)and the sweeping is O(n). The entire algorithm is dominated by the sorting step, which is O(nlogn).

     Space complexity : O(1). Space depends on the sorting implementation which, usually, costs O(1) auxiliary space if heapsort is used.

     This approach modfies the orignal array which is not a good practice

     */

    public boolean containsDuplicates(int[] nums){
        Arrays.sort(nums);
        for(int i =0 ;i <nums.length-1 ;i++){
            if(nums[i] == nums[i+1]) {
                System.out.println(" The Duplicates are Found in the Array" + Arrays.toString(nums));
                return true;
            }
        }
        System.out.println(" The Duplicates are Not  Found in the Array" + Arrays.toString(nums));
        return false;
    }

    /***
     *

     Time complexity : O(n). We do search() and insert() for nnn times and each operation takes constant time.

     Space complexity : O(n). The space used by a hash table is linear with the number of elements in it.

     */

    public boolean containDuplicatesWithHashSet(int[] nums){
        Set<Integer> set = new HashSet<Integer>(nums.length);
        for(int element: nums){
          if(set.contains(element)) {
              System.out.println(" The Duplicates are Found in the Array" + Arrays.toString(nums));
              return true;
          }
          set.add(element);
        }
        System.out.println(" The Duplicates are Not Found in the Array" + Arrays.toString(nums));
        return false;
    }
}
