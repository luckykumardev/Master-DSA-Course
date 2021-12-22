package class_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/*
 https://leetcode.com/problems/connecting-cities-with-minimum-cost/
*/
public class ConnectingCitiesWithMinimumCost {
	public int minimumCost(int N, int[][] connections) {
		Map<Integer, List<int[]>> graph = new HashMap<>();
		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
		Set<Integer> visited = new HashSet<>();
		int costs = 0;

		for (int[] conn : connections) {
			int n1 = conn[0], n2 = conn[1], cost = conn[2];
			graph.putIfAbsent(n1, new ArrayList<>());
			graph.putIfAbsent(n2, new ArrayList<>());
			graph.get(n1).add(new int[] { n2, cost });
			graph.get(n2).add(new int[] { n1, cost });
		}

		heap.add(new int[] { 1, 1, 0 });
		while (!heap.isEmpty()) {
			int[] conn = heap.poll();
			int n = conn[1], cost = conn[2];

			if (!visited.contains(n)) {
				costs += cost;
				visited.add(n);
				for (int[] next : graph.get(n)) {
					heap.add(new int[] { n, next[0], next[1] });
				}
			}
		}

		return visited.size() == N ? costs : -1;
	}
}
