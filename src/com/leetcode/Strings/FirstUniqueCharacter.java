package com.leetcode.Strings;

/***
 * Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode"
 * return 2.
 *
 *
 *
 * Note: You may assume the string contains only lowercase English letters.
 */
public class FirstUniqueCharacter {
    public FirstUniqueCharacter(){

    }
    public int findFirstUniqueCharacter(String string){
        if( string == null || string.length() ==0)
            return -1;
        int strUniqueElementIndex = string.length();
        for(char i='a' ; i<='z';i++){
            int index= string.indexOf(i);
            if(index != -1 && index== string.lastIndexOf(i))
                strUniqueElementIndex= Math.min(strUniqueElementIndex,index);
        }
        return strUniqueElementIndex==string.length() ? -1 :strUniqueElementIndex;
    }
}
