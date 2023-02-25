package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstTraversal {
    static ArrayList<ArrayList<Integer>> adj;

    DepthFirstTraversal(int v){
        adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v){
        adj.get(u).add(v);
    }

    static void DFS(int source,int v){
        boolean[] visited=new boolean[v+1];
        for(boolean x:visited){
            x=false;
        }
        DFSutil(source,visited);
    }
    static void DFSutil(int source,boolean[] visited){
        visited[source]=true;
        for(int i=0;i<adj.get(source).size();i++){
            if(!visited[adj.get(source).get(i)]){
                visited[adj.get(source).get(i)]=true;
                System.out.println(adj.get(source).get(i));
                DFSutil(adj.get(source).get(i),visited);
            }
        }
    }

    public static void main(String[] args) {
        DepthFirstTraversal dfs=new DepthFirstTraversal(5);
        dfs.addEdge(0,1);
        dfs.addEdge(1,2);
        dfs.addEdge(2,3);
        dfs.addEdge(3,4);
        dfs.addEdge(4,0);
        DFS(2,4);
    }

}
