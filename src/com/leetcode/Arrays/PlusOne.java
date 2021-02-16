package com.leetcode.Arrays;

/***
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 *
 *
 * Example 1:
 *
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 *
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * Example 3:
 *
 * Input: digits = [0]
 * Output: [1]
 *
 *
 */
public class PlusOne {
    public PlusOne(){

    }

    /***
     *  if the last digit is 9 , then only while adding one , there will  be a carry
     *  So if the last digit is nine, make it as 0 and then add the carry to the next digit in the next iteration of thefor loop and then exit from the loop.
     *  if not , then the carry is added to the last digit and then exited from the loop
     *  if all the elements in the array has 9 , then the loop will execute till the last iteration (i<=0) . So adding a new element to the array {1} in the beginning of the array
      * @param digits
     * @return
     */
    public int[] plusOneFunction(int[] digits){
        if(digits ==  null || digits.length == 0){
            int [] result= {1};
            return result;
        }
        int carry=1 , i;
        for( i= digits.length -1 ; i>=0 ;i--){
            if (digits[i] == 9){
                digits[i]= 0;
            }else{
                carry = carry + digits[i];
                digits[i]=carry;
                break;
            }
        }
        if(i<0){
            int[] results = new int[digits.length+1];
            results[0] =1;
            return results;
        }else{
            return digits;
        }
    }
}
