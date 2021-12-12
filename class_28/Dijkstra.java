package class_28;

import java.util.ArrayList;
import java.util.PriorityQueue;

/*
 https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
*/
public class Dijkstra {

    public static class Pair implements Comparable <Pair> {
        int vertex;
        int acquiringVertex;
        int weight;
        
        Pair(int vertex, int acquiringVertex, int weight) {
            this.vertex = vertex;
            this.acquiringVertex = acquiringVertex;
            this.weight = weight;
        }
     
        public int compareTo(Pair o) {
            return this.weight - o.weight;
        }
    }
   
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
   
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] path = new int[V];
        pq.add(new Pair(S,0,0));
        boolean[] visited = new boolean[V];
   
        while(pq.size()>0){
            
            Pair removed = pq.remove();
            
            if(visited[removed.vertex] == true)
                continue;
            
            visited[removed.vertex]=true;
            
            path[removed.vertex]=removed.weight;
            
            for(ArrayList<Integer> e: adj.get(removed.vertex)){
                if(visited[e.get(0)] == false){
                    pq.add(new Pair(e.get(0),removed.vertex,e.get(1)+removed.weight));
                }
            }
        }
        return path;
    }
}