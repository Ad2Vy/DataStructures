package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static java.util.Arrays.fill;

public class ShortestPathInUnweightedGraph {

    static void shortestPath(ArrayList<ArrayList<Integer>> adj){
        int[] dist=new int[adj.size()];
        boolean[] visited=new boolean[adj.size()];

        Queue<Integer> queue=new LinkedList<>();
        Arrays.fill(dist,Integer.MAX_VALUE);

        queue.add(0);
        visited[0]=true;
        dist[0]=0;

        while(!queue.isEmpty()){
            int u=queue.poll();
            for(int x:adj.get(u))
            if(!visited[x]){
                dist[x]=dist[u]+1;
                visited[x]=true;
                queue.add(x);
            }
        }

        //Printing all the distances from the source
        int c=0;
        for(int x:dist){
            System.out.println(c++ +":"+x);
        }
    }

    public static void main(String[] args) {
        UndirectedGraph graph=new UndirectedGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        shortestPath(graph.adj);


    }
}
