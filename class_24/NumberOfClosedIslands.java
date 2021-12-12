package class_24;

public class NumberOfClosedIslands {
	public int closedIsland(int[][] grid) {
		int res = 0;
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[0].length; j++) {
				if (grid[i][j] == 0) {
					if (dfs(grid, i, j)) {
						res++;
					}
				}
			}
		}
		return res;
	}

	boolean dfs(int[][] a, int i, int j) {
		if (i < 0 || i >= a.length || j < 0 || j >= a[0].length) {
			return false;
		}

		if (a[i][j] == 1 || a[i][j] == 2) {
			return true;
		}

		a[i][j] = 2;

		boolean res = true;
		res = res & dfs(a, i + 1, j);
		res = res & dfs(a, i - 1, j);
		res = res & dfs(a, i, j + 1);
		res = res & dfs(a, i, j - 1);

		return res;

	}
}