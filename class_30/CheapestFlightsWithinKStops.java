package class_30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
/*
 https://leetcode.com/problems/cheapest-flights-within-k-stops/
*/
public class CheapestFlightsWithinKStops {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
		Map<Integer, List<int[]>> map = new HashMap<>();
		for (int[] f : flights) {
			map.putIfAbsent(f[0], new ArrayList<>());
			map.get(f[0]).add(new int[] { f[1], f[2] });
		}
		PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		q.offer(new int[] { src, 0, K });
		while (!q.isEmpty()) {
			int[] c = q.poll();
			int curr = c[0];
			int cost = c[1];
			int stop = c[2];
			if (curr == dst)
				return cost;
			if (stop >= 0) {

				if (!map.containsKey(curr))
					continue;
				for (int[] next : map.get(curr)) {
					q.add(new int[] { next[0], cost + next[1], stop - 1 });
				}
			}
		}
		return -1;
	}
}
