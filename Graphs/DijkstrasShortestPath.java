package Graphs;

import java.util.PriorityQueue;
import java.util.*;

/*
*
*  Create a priority queue for all distances.
*   Put all distances in pq.
*   weight
*
 */
public class DijkstrasShortestPath {
    static void shortestPath(UndirectedGraph graph, int V){
        int dist[] =new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        boolean[] fin=new boolean[V];

        for(int count=0;count<V;count++){
            int u=-1;
            for(int i=0;i<V;i++){
                if(!fin[i] && (u==-1 || dist[i]<dist[u])){
                    u=i;
                }
            }
            fin[u]=true;
            for(int i=0;i<V;i++){
                if(!fin[i] && graph.getWeight(i,u)!=0){
                    dist[i]=Math.min(graph.getWeight(u,i)+dist[u],dist[i]);
                }
            }

        }
        for(int x:dist){
            System.out.print(x+" ");
        }

    }

    public static void main(String[] args) {
        UndirectedGraph g=new UndirectedGraph(4);
        g.addEdgeandWeight(0,3,5);
        g.addEdgeandWeight(0,1,4);
        g.addEdgeandWeight(0,2,10);
        g.addEdgeandWeight(1,2,4);
        g.addEdgeandWeight(2,3,7);

        shortestPath(g,4);
    }
}
