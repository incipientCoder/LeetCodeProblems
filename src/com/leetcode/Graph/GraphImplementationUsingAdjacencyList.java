package com.leetcode.Graph;

import java.util.ArrayList;

public class GraphImplementationUsingAdjacencyList {
    public GraphImplementationUsingAdjacencyList(){

    }
    public void addEdge(ArrayList<ArrayList<Integer>> adj , int vertix ,int node){
        adj.get(vertix).add(node);
        adj.get(node).add(vertix);
    }

    public void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.println("\n Adjacency list of the vertex : "+i);
            System.out.print("head");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(" --> " +adj.get(i).get(j));
            }
        }
    }
}
