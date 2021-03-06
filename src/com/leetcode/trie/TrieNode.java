package com.leetcode.trie;

public class TrieNode {
    static final int ALPHABET_SIZE = 26;
    public TrieNode[] childNodes= new TrieNode[ALPHABET_SIZE];
    public boolean isEndOfWord;

}
