package class_25;

import java.util.ArrayList;

/*
 * https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
 */

public class CycleInUnDirectedGraph {
	  public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
	        boolean visited[]=new boolean[V];
	        for(int i=0;i<V;i++){
	            if(!visited[i]){
	                if(DFS(adj,i,visited,-1))
	                return true;
	            }
	        }
	       return false;  	        
	    }
	      
	    boolean DFS(ArrayList<ArrayList<Integer>> adj,int src,boolean visited[],int parent){
	        visited[src]=true;
	        ArrayList<Integer> children  = adj.get(src);
	        for(int i =0; i<children.size(); i++){
	            int v = children.get(i);
	            if(!visited[v]){
	                if(DFS(adj,v,visited,src))
	                return true;
	            }
	            else if(v!=parent)
	            return true;
	        }
	        return false;
	    }
}