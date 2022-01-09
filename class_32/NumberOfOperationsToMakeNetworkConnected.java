package class_32;

public class NumberOfOperationsToMakeNetworkConnected {
	public int makeConnected(int n, int[][] connections) {
		int[] parent = new int[n];
		int group = 0, extra = 0;
		for (int i = 0; i < n; i++)
			parent[i] = i;
		for (int[] a : connections)
			if (union(a[0], a[1], parent))
				extra++;
		for (int i = 0; i < n; i++) {
			if (find(i, parent) == i)
				group++;
		}
		return extra >= group - 1 ? group - 1 : -1;
	}

	boolean union(int a, int b, int[] parent) {
		if (find(a, parent) != find(b, parent)) {
			parent[parent[a]] = parent[b];
			return false;
		} else
			return true;
	}

	int find(int a, int[] parent) {
		if (parent[a] != a)
			parent[a] = find(parent[a], parent);
		return parent[a];
	}
}
