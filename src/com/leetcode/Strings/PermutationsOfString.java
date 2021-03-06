package com.leetcode.Strings;

public class PermutationsOfString {

    public  void permutation(String str){
        permutation("",str);
    }
    public  void permutationWithoutDuplicates(String str){
        permutationWithoutDuplicates("",str);
    }
    public  void permutation(String prefix, String str){
        int n= str.length();
        System.out.println("prefix : " +prefix + " , str : "+str);

        if( n == 0){
            System.out.println("The Permutations of the String are : "+prefix);
            System.out.println("one inner Loop Completed");
        }else{
            for(int i=0;i<n;i++){
                System.out.println("Entering For Loop  and executing for a length of "+ n);
                System.out.println("i : " +i );
                System.out.println("prefix : "+ prefix +" , str.charAt(i) : "+ str.charAt(i)+ " , str.substring(0,i)+str.substring(i+1,n) : "+ str.substring(0,i)+str.substring(i+1,n));
                permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
            }
        }
    }

    public  void permutationWithoutDuplicates(String prefix, String str){
        int n= str.length();

        boolean[] charArray= new boolean[26];
        if( n == 0){
            System.out.println("*******************************************************************");
            System.out.println("The Permutations of the String without duplicates are : "+prefix);
        }else{
            for(int i=0;i<n;i++){

                if(!charArray[str.charAt(i) - 'a'])
                    permutationWithoutDuplicates(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
                charArray[str.charAt(i)-'a']=true;

            }
        }
    }
}

