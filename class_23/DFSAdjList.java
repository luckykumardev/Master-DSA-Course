package class_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFSAdjList {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter no of vertex");
		  int v = sc.nextInt();
		  List<List<Integer>> adjList = new ArrayList<>();
		  for(int i =0; i <v; i++){
			  System.out.println("enter number nodes connected with : " + i);
			  int nodes = sc.nextInt();
			  List<Integer> nodesList = new ArrayList<>();
 			  for(int j =0; j <nodes; j++){
				  int n = sc.nextInt();
				  nodesList.add(n);
			  }
 			  adjList.add(nodesList);
		  }
		  
		  print(adjList);
	}

	private static void print(List<List<Integer>> adjList) {
		int v = adjList.size();
		boolean visited[] = new boolean[v];
		for(int i =0; i <v; i++){
			if(visited[i] == false){
				printHelper(adjList, visited, i);
			}
		}
	}

	private static void printHelper(List<List<Integer>> adjList, boolean visited[], int sv) {
		visited[sv] = true;
		System.out.println(sv);
		List<Integer> children = adjList.get(sv);
		for (int i = 0; i < children.size(); i++) {
			int x = children.get(i);
			if (visited[x] == false)
				printHelper(adjList, visited, x);
		}
	}

}
