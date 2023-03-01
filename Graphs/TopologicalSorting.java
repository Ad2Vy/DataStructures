package Graphs;

import java.util.*;

/**
 * Topological sorting is only for Directed Acyclic Graphs.
 * The idea is to print nodes in order of there increasing in-degree while performing a BFS.
 *
 * .....
 *  Create an indegree[], fill with the indegrees of respective node.
 *  Since it is specified only for directed acyclic graph no need to check cycles.
 *
 *  put all the nodes with indegree 0 in a Queue.
 *  poll the element from the queue and reduce its indegree
 *  if indegree becomes 0 add the node to the queue.
 *
 */

public class TopologicalSorting {

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj,int V){
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int x: adj.get(i)){
                indegree[x]++;
            }
        }
        Queue<Integer> queue= new LinkedList<>();

        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }

        int count=0;
        Vector<Integer> res=new Vector<>();
        while(!queue.isEmpty()){
            int u= queue.poll();
            res.add(u);
            for(int x:adj.get(u)){
                if(--indegree[x]==0){
                    queue.add(x);

                }
            }
            count++;
        }
        if(count!=V){
            System.out.println("Cycle detected");
            return;
        }

        for(int i:res){
            System.out.print(i+" ");
        }


    }

    public static void main(String[] args) {
        DirectedGraph g=new DirectedGraph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        topologicalSort(g.adj,6);
    }


}
