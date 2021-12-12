package class_26;

import java.util.ArrayList;
import java.util.Stack;

/*
 https://leetcode.com/problems/course-schedule-ii/
*/
public class CourseScheduleII {
	public int[] findOrder(int N, int[][] prerequisites) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N; i++) {
			adj.add(i, new ArrayList<Integer>());
		}

		int pre;
		int cour;
		for (int[] pair : prerequisites) {
			pre = pair[1];
			cour = pair[0];
			adj.get(pre).add(cour);
		}

		int n = adj.size();
		int ans[] = new int[n];
		Stack<Integer> s = new Stack<>();
		boolean visited[] = new boolean[n];
		boolean helper[] = new boolean[n];
		boolean isCyclic = false;

		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				isCyclic = cycle(adj, visited, helper, i);
				if (isCyclic == true)
					return new int[0];
			}
		}

		visited = new boolean[n];
		// topological sort
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				DFS(adj, i, visited, s);
			}
		}

		int k = 0;
		while (!s.isEmpty())
			ans[k++] = s.pop();

		return ans;
	}

	private static void DFS(ArrayList<ArrayList<Integer>> adj, int i, boolean visited[], Stack<Integer> s) {
		visited[i] = true;
		ArrayList<Integer> children = adj.get(i);
		for (int k = 0; k < children.size(); k++) {
			int curr = children.get(k);
			if (visited[curr] == false)
				DFS(adj, curr, visited, s);
		}

		s.push(i);
	}

	private static boolean cycle(ArrayList<ArrayList<Integer>> adj, boolean visited[], boolean helper[], int i) {
		visited[i] = true;
		helper[i] = true;

		ArrayList<Integer> children = adj.get(i);
		for (int k = 0; k < children.size(); k++) {
			int curr = children.get(k);
			if (helper[curr] == true)
				return true;
			if (visited[curr] == false) {
				boolean isCyclic = cycle(adj, visited, helper, curr);
				if (isCyclic == true)
					return true;
			}
		}

		helper[i] = false;
		return false;
	}

}
