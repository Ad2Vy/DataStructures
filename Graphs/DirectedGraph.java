package Graphs;

import java.util.ArrayList;

public class DirectedGraph {
    ArrayList<ArrayList<Integer>> adj;
    DirectedGraph(int v){
        adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v){
        adj.get(u).add(v);
    }
}
