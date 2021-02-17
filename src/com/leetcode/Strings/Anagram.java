package com.leetcode.Strings;

/***
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class Anagram {
    public Anagram(){

    }
    public boolean isAnagram(String s , String t){
        if(s.length() != t.length())
            return false;
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i: count){
            if(i != 0)
                return false;
        }
        return true;
    }
}
