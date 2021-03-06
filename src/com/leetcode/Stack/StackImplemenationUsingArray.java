package com.leetcode.Stack;

public class StackImplemenationUsingArray {
    int top;
    int[] array;
    int max;
    public  StackImplemenationUsingArray(int size){
        top=-1;
        array = new int[size];
        max=size;

    }

    public boolean isEmpty(){
        if(top <0)
            return true;
        else
            return false;
    }
    public boolean push(int x){
        if(top >= max-1 ) {
            System.out.println("The Stack is Full");
            return false;
        }
        else{
            array[++top] =x;
            System.out.println("The Stack is added with element "+ x);
            return true;
        }
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack is Empty");
            return 0;
        }else{
            int x = array[top--];
            return x;
        }
    }
    public int peek(){
        if(top < 0){
            System.out.println("Stack is Empty");
            return 0;
        }else{
            int x = array[top];
            return x;
        }
    }
}
