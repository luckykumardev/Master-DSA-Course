package class_45;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		return rec(1, n);
	}

	private static int rec(int s, int e) {
		if (s >= e)
			return 1;
		int ans = 0;
		for (int i = s; i <= e; i++)
			ans += rec(s, i - 1) * rec(i + 1, e);

		return ans;
	}
}