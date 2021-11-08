package Graphs;

import java.util.ArrayList;

public class CycleDetectionInDirectedGraph {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited=new boolean[V];
        boolean[] inStack=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(DFS(i,adj,visited,inStack)){
                    return true;
                }
            }
        }
        return false;

    }

    boolean DFS(int s, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] inStack){


        visited[s]=true;
        inStack[s]=true;
        for(int x:adj.get(s)){
            if(!visited[x]){
                if(DFS(x,adj,visited,inStack)){
                    return true;
                }
            }
            else if(inStack[x]==true){
                return true;
            }

        }

        inStack[s]=false;
        return false;

    }
}
