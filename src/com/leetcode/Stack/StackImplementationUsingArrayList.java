package com.leetcode.Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StackImplementationUsingArrayList {
    ArrayList<Integer> stack;
    int maxSize;

    public StackImplementationUsingArrayList(int maxSize){
        stack = new ArrayList<Integer>();
        this.maxSize = maxSize;
    }

    public void push(int x){
        if(stack.size() < maxSize){
            stack.add(x);
        }
    }

    public int pop (){
        if(stack.size() == 0)
            return -1;
        return stack.remove(stack.size()-1);
    }



    public void increment(int k , int value){
        int iteration = Math.min(k, stack.size());
        for(int i=0; i< iteration ;i++){
            stack.set(i , stack.get(i)+value);
        }
    }

    public void printStack(){
        System.out.println(" The Stack has the following elements : ");
        for( int i : stack){
            System.out.println(i);
        }
    }
}
