package class_26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 https://leetcode.com/problems/all-paths-from-source-to-target/
*/
public class AllPathsFromSourceToTarget {
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> res = new LinkedList<>();
		List<Integer> curr = new ArrayList<>();
		curr.add(0);
		dfs(0, curr, graph, graph.length - 1, res);
		return res;
	}

	private void dfs(int src, List<Integer> curr, int graph[][], int dest, List<List<Integer>> res) {
		if (src == dest) {
			res.add(new ArrayList<>(curr));
			return;
		}

		int children[] = graph[src];
		for (int i = 0; i < children.length; i++) {
			int a = children[i];
			curr.add(a);
			dfs(a, curr, graph, dest, res);
			curr.remove(curr.size() - 1);
		}
	}
}
