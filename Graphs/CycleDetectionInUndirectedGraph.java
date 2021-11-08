package Graphs;

import java.util.ArrayList;

public class CycleDetectionInUndirectedGraph {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited=new boolean[V];
        // if not visited check for it's adjacents
        // if DFS includes an element that is already visited except for the parent
        // we will say that this has a cycle and will return true;
        for(int i=0;i<adj.size();i++){

            if(!visited[i]){
                if(DFS(i,adj,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    //

    boolean DFS(int s,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int parent){

        visited[s]=true;

        for(int x:adj.get(s)){
            if(!visited[x]){
                if(DFS(x,adj,visited,s))
                    return true;
            }
            else if(x!=parent){
                return true;
            }
        }
        return false;

    }
}
