package com.leetcode.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSUsingLinkedList {

    public BFSUsingLinkedList(){

    }
    public void BFS(int s, LinkedList<Integer>[] adj){
        boolean visited[] = new boolean[adj.length];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s]= true;
        queue.add(s);

        while(queue.size() != 0){
            s= queue.poll();
            System.out.println(" S : "+s);

            Iterator<Integer> i= adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(visited[n] != true){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }


    }
}
