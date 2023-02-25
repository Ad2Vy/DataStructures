package Graphs;

import java.util.ArrayList;

public class UndirectedGraph {
    ArrayList<ArrayList<Integer>> adj;
    UndirectedGraph(int nodes){
        adj=new ArrayList<>();
        for(int i=1;i<nodes+1;i++){
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
