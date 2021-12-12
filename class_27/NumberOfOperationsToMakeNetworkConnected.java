package class_27;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/number-of-operations-to-make-network-connected/
*/
public class NumberOfOperationsToMakeNetworkConnected {
	public int makeConnected(int n, int[][] connections) {

		List<List<Integer>> adjList = new ArrayList<>();

		for (int i = 0; i < n; i++)
			adjList.add(new ArrayList<>());

		for (int i = 0; i < connections.length; i++) {
			int pc1 = connections[i][0];
			int pc2 = connections[i][1];
			adjList.get(pc1).add(pc2);
			adjList.get(pc2).add(pc1);
		}

		boolean visited[] = new boolean[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				connectedComponent(adjList, i, visited);
				count++;
			}
		}

		if (connections.length >= n - 1) {
			return count - 1;
		} else {
			return -1;
		}
	}

	public void connectedComponent(List<List<Integer>> adjList, int v, boolean[] visited) {
		visited[v] = true;

		for (int nbr : adjList.get(v)) {
			if (visited[nbr] == false) {
				connectedComponent(adjList, nbr, visited);
			}
		}
	}
}
