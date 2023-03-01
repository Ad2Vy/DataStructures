package Graphs;

import java.util.ArrayList;

public class CycleDetectionInDirectedGraph {

    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        // If
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

    static boolean DFS(int s, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] inStack){


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

    public static void main(String[] args) {
        DirectedGraph graph=new DirectedGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        System.out.println(isCyclic(5,graph.adj));
    }
}
