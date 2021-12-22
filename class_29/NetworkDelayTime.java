package class_29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
 https://leetcode.com/problems/network-delay-time/
*/
public class NetworkDelayTime {
	class Node {
		int currNode;
		int weight;

		Node(int currNode, int weight) {
			this.currNode = currNode;
			this.weight = weight;
		}
	}

	class CustomComparator implements Comparator<Node> {

		@Override
		public int compare(Node n1, Node n2) {
			if (n1.weight > n2.weight)
				return 1;
			else
				return -1;
		}
	}

	public int networkDelayTime(int[][] times, int n, int k) {
		List<List<Node>> adjList = new ArrayList<>();
		for (int i = 0; i <= n; i++)
			adjList.add(new ArrayList<>());

		for (int i = 0; i < times.length; i++) {
			int src = times[i][0];
			int des = times[i][1];
			int weight = times[i][2];
			adjList.get(src).add(new Node(des, weight));
		}

		boolean visited[] = new boolean[n + 1];
		int minDisFromK[] = new int[n + 1];
		for (int i = 0; i < n; i++)
			minDisFromK[i] = Integer.MAX_VALUE;

		PriorityQueue<Node> pq = new PriorityQueue<>(new CustomComparator());
		minDisFromK[k] = 0;
		pq.add(new Node(k, 0));
		int ans = 0;
		while (!pq.isEmpty()) {
			Node temp = pq.poll();
			if (visited[temp.currNode] == true)
				continue;

			visited[temp.currNode] = true;
			ans = Math.max(ans, temp.weight);
			minDisFromK[temp.currNode] = temp.weight;
			List<Node> children = adjList.get(temp.currNode);
			for (int i = 0; i < children.size(); i++) {
				Node child = children.get(i);
				if (visited[child.currNode] == false) {
					pq.add(new Node(child.currNode, child.weight + temp.weight));
				}
			}

		}

		for (int i = 1; i <= n; i++) {
			if (visited[i] == false)
				return -1;
		}
		return ans == 0 ? -1 : ans;

	}
}
