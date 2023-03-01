package Graphs;

import java.util.ArrayList;

public class UndirectedGraph {
    ArrayList<ArrayList<Integer>> adj;
    int[][] weight;
    UndirectedGraph(int nodes){
        adj=new ArrayList<>();
        for(int i=1;i<nodes+1;i++){
            adj.add(new ArrayList<>());
        }
        weight=new int[nodes][nodes];
    }
    void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void addEdgeandWeight(int u,int v,int w){
        adj.get(u).add(v);
        adj.get(v).add(u);
        weight[u][v]=w;
        weight[v][u]=w;
    }
    int getWeight(int u,int v){
        return weight[u][v];
    }
}
