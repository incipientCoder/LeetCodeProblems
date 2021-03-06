package com.leetcode.Queue;

public class ImplementQueueUsingArray {
    int front , rear,capacity;
    int[] array;
   public ImplementQueueUsingArray(int size){
       this.capacity =size;
       front=0;
       rear=0;
       array = new int[size];
   }

   public void enQueue(int data){
       if(capacity == rear){
           System.out.println(" The Queue is Full");
           return;
       }
       else{
           array[rear]=data;
           System.out.println("Data Added : "+data);
           rear++;
       }
   }

   public void queueDeque(){
       if(front == rear){
           System.out.println("Deletion is not possible ");
       }else{
           System.out.println("Deleted : "+array[front]);
//           array[front]=0;
//           front++;
//           if(front == rear)
//                front = rear = 0;
           for(int i=0;i<rear-1;i++){
               array[i]=array[i+1];
           }
           rear--;

       }
   }


   public void display(){
//       if(rear == -1){
//           System.out.println("Queue is Empty");
//       }else{
           System.out.println("The Array content is ");
           for(int i= 0; i<capacity;i++){
               System.out.println(array[i]);
           }
       }

}
