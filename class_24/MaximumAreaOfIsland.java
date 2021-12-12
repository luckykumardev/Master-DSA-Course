package class_24;

public class MaximumAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
		int max_area = 0;
		int r = grid.length;
		int c = grid[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) {
					int curr_area = dfs(grid, i, j);
					max_area = Math.max(max_area, curr_area);
				}
			}
		}

		return max_area;
	}

	private static int dfs(int grid[][], int i, int j) {
		int r = grid.length;
		int c = grid[0].length;

		if (i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == -1 || grid[i][j] == 0) {
			return 0;
		}

		grid[i][j] = -1;
		int curr_area = 1;

		curr_area += dfs(grid, i + 1, j);
		curr_area += dfs(grid, i, j + 1);
		curr_area += dfs(grid, i - 1, j);
		curr_area += dfs(grid, i, j - 1);

		return curr_area;
	}
}