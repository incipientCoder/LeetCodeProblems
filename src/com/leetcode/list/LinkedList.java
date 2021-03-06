package com.leetcode.list;

public class LinkedList {

  public  Node head;



    public  LinkedList insertLinkedList(LinkedList list , int data){
        Node newNode = new Node(data);
        newNode.next= null;

        if(list.head == null){
            list.head= newNode;
        }else{
            Node last= list.head;
            while(last.next != null){
                last = last.next;
            }

            last.next = newNode;

        }

        return list;
    }


    public void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node reverseListIteration(Node head){
        /***
         * Assume that we have linked list 1 → 2 → 3 → Ø, we would like to change it to Ø ← 1 ← 2 ← 3.
         * While you are traversing the list, change the current node's next pointer to point to its previous element.
         * Since a node does not have reference to its previous node, you must store its previous element beforehand.
         * You also need another pointer to store the next node before changing the reference.
         * Do not forget to return the new head reference at the end!
         */

        Node prev = null;
        Node current = head;

        while(current != null){

            Node temp = current.next;
            current.next=prev;
            prev=current;
            current = temp;
        }

        return prev;
    }


    public Node reverseListRecursion(Node head){
        /***
         *  Let's assume the list is: n1 → … → nk-1 → nk → nk+1 → … → nm → Ø
         *
         * Assume from node nk+1 to nm had been reversed and you are at node nk.
         *
         * n1 → … → nk-1 → nk → nk+1 ← … ← nm
         *
         * We want nk+1’s next node to point to nk.
         *
         * So,
         *
         * nk.next.next = nk;
         *
         * Be very careful that n1's next must point to Ø. If you forget about this, your linked list has a cycle in it.
         * This bug could be caught if you test your code with a linked list of size 2
         */

        if(head == null || head.next == null)
            return head;
        Node temp= reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }


}

