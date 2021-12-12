package class_24;

public class NumberOfIsland {

	public static void main(String[] args) {
		char grid[][] = { 
				{ '1', '1', '0' }, 
				{ '0', '0', '1' }, 
				{ '1', '1', '0', } };
		int ans = numIslands(grid);
		System.out.print(ans);
	}

	public static int numIslands(char[][] grid) {
		if (grid.length == 0)
			return 0;
		int num = 0;
		int r = grid.length;
		int c = grid[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == '1') {
					DFS(grid, i, j);
					num++;
				}
			}
		}
		return num;
	}

	private static void DFS(char grid[][], int i, int j) {
		int r = grid.length;
		int c = grid[0].length;
		if (i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == '0')
			return;
		grid[i][j] = '0';
		DFS(grid, i + 1, j);
		DFS(grid, i, j + 1);
		DFS(grid, i - 1, j);
		DFS(grid, i, j - 1);
	}
}
