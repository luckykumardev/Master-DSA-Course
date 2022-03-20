package class_51;

/*
 https://leetcode.com/problems/top-k-frequent-elements	
*/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		int ans[] = new int[k];
		Map<Integer, Integer> counterMap = new HashMap<>();
		for (int num : nums) {
			int count = counterMap.getOrDefault(num, 0);
			counterMap.put(num, count + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
		for (Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
			pq.offer(entry);
			if (pq.size() > k)
				pq.poll();
		}
		int p = 0;
		while (!pq.isEmpty()) {
			ans[p++] = pq.poll().getKey();
		}
		return ans;
	}
}
