package com.leetcode.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSGraph {
    public DFSGraph(){

    }
    public void DFS(LinkedList<Integer>[] adj, int s){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[adj.length];

        stack.push(s);
        while(!stack.empty()){
             s = stack.peek();
            stack.pop();

            if(visited[s] != true){
                System.out.println("s "+ s);
                visited[s] = true;

            }

            Iterator<Integer> i = adj[s].iterator();

            while(i.hasNext()){
               int v = i.next();
               if(visited[v] != true){
                   stack.push(v);
               }
            }
        }


    }
}
