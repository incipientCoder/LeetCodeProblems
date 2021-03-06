package com.leetcode.Graph;

import java.util.LinkedList;

public class GraphImplementationUsingLinkedList {
    public int V;
    public LinkedList<Integer> adj[];

   public  GraphImplementationUsingLinkedList(int v){
        V= v;
        adj = new LinkedList[v];
        for(int i=0;i<V;i++)
            adj[i]= new LinkedList<>();
    }

    public void addEdge(int node, int vertices){
        adj[node].add(vertices);
    }

}
