package class_23;

import java.util.Scanner;

public class DFS {
	
	public static void printHelper(int adj_mat[][], int sv,  boolean visited[]) {
		System.out.println(sv);
		visited[sv] = true;
		int v = adj_mat.length;
		for(int i =0; i <v; i++) {
			if(adj_mat[sv][i] == 1 && visited[i] == false)
				printHelper(adj_mat, i, visited);
				 
		}
	}
    
	private static void print(int[][] adj_mat) {
	    int v = adj_mat.length;
	    boolean visited[] = new boolean[v];
	    for(int i =0; i<v; i++){
	    	if(visited[i] == false){
	    		printHelper(adj_mat, i, visited);
	    	}
	    }
	}
    
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter no of vertex");
	  int v = sc.nextInt();
	  System.out.println("enter no of edges");
	  int e = sc.nextInt();
	  int adj_mat[][] = new int[v][v];
	  for(int i =0; i<e; i++) {
		  int sv = sc.nextInt();
		  int ev = sc.nextInt();
		  adj_mat[sv][ev] =1;
		  adj_mat[ev][sv] =1;
	  }
	  boolean visited[] = new boolean[v];
	  print(adj_mat);
   }
	
}
