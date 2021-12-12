package class_26;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
*/
public class NumberOfConnectedComponentsInAnUndirectedGraph {

	public int countComponents(int n, int[][] edges) {
		
		List<List<Integer>> adjList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			List<Integer> children = new ArrayList<>();
			adjList.add(children);
		}
		int count = 0;

		for (int i = 0; i < edges.length; i++) {
			int edge[] = edges[i];
			adjList.get(edge[0]).add(edge[1]);
			adjList.get(edge[1]).add(edge[0]);
		}

		boolean visited[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				count++;
				DFS(visited, adjList, i);
			}
		}

		return count;
	}

	private void DFS(boolean visited[], List<List<Integer>> adjList, int sv) {
		visited[sv] = true;
		List<Integer> children = adjList.get(sv);
		for (int i = 0; i < children.size(); i++) {
			int child = children.get(i);
			if (visited[child] == false) {
				DFS(visited, adjList, child);
			}
		}
	}

}