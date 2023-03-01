package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSpanningTreePrims {

    static int minimumSpanning(UndirectedGraph graph, int V){
        int res=0;
        int[] key=new int[V];
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        boolean[] mst=new boolean[V];
        Arrays.fill(mst,false);
        for(int count=0;count<V;count++){
            int u=-1;
            for(int i=0;i<V;i++) {
                if (!mst[i] && (u == -1 || key[i] < key[u])) {
                    u = i;
                }
            }
            mst[u]=true;
            res+=key[u];

            for(int i=0;i<V;i++){
                if(!mst[i] && graph.getWeight(i,u)!=0 && graph.getWeight(i,u)<key[i]){
                    key[i]=graph.getWeight(i,u);
                }
            }

        }
        return res;
    }

    static int mstAdj(UndirectedGraph graph,int V){
        int[] key=new int[V];
        int res=0;
        Arrays.fill(key,Integer.MAX_VALUE);
        boolean[] mst=new boolean[V];
        key[0]=0;
        for(int count=0;count<V;count++){
            int u=-1;
            for(int i=0;i<V;i++){
                if(!mst[i] && (u==-1 || key[i]<key[u])){
                    u=i;
                }
            }
            mst[u]=true;
            res+=key[u];
            for(int i:graph.adj.get(u)){
                if(!mst[i] && graph.getWeight(i,u)!=0 && graph.getWeight(i,u)<key[i]){
                    key[i]=graph.getWeight(i,u);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        UndirectedGraph g=new UndirectedGraph(4);
        g.addEdgeandWeight(0,3,5);
        g.addEdgeandWeight(0,1,9);
        g.addEdgeandWeight(0,2,10);
        g.addEdgeandWeight(1,2,8);
        g.addEdgeandWeight(2,3,7);

        System.out.println(minimumSpanning(g,4));
        System.out.println(mstAdj(g,4));
    }

}
