package com.leetcode.trie;

public class Trie {
    TrieNode root  = new TrieNode();;
    public Trie(){

    }
    public void insert(String word){
        TrieNode tempNode= root;
        for(int i=0;i<word.length();i++){
            int index= word.charAt(i) - 'a';
            if(tempNode.childNodes[index] == null){
                tempNode.childNodes[index] = new TrieNode();
                tempNode=tempNode.childNodes[index];
            }else{
                tempNode = tempNode.childNodes[index];
            }

        }

        tempNode.isEndOfWord = true;
    }


    public boolean search(String key){
        TrieNode tempNode = root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i) - 'a';
            if(tempNode.childNodes[index] == null){
                return false;
            }else {
                tempNode = tempNode.childNodes[index];
            }
        }
        if(tempNode.isEndOfWord == true){
            return true;
        }
        return false;
    }

    public boolean searchPrefix(String prefix){
        TrieNode tempNode= root;
        for(int i=0;i<prefix.length();i++){
            int index=prefix.charAt(i) - 'a';
            if(tempNode.childNodes[index] == null){
                return false;
            }else{
                tempNode= tempNode.childNodes[index];
            }
        }
        return true;
    }
}
