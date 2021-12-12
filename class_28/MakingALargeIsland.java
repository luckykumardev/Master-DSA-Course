package class_28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MakingALargeIsland {
	public int largestIsland(int[][] grid) {
		Map<Integer, Integer> areaMap = new HashMap<>();
		areaMap.put(0, 0);
		int islandIdx = 2;
		int n = grid.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					int islandArea = findIslandArea(grid, i, j, islandIdx);
					areaMap.put(islandIdx, islandArea);
					islandIdx++;
				}
			}
		}

		int res = areaMap.getOrDefault(2, 0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 0) {
					HashSet<Integer> neighbor = new HashSet<>();
					neighbor.add(i > 0 ? grid[i - 1][j] : 0);
					neighbor.add(i < n - 1 ? grid[i + 1][j] : 0);
					neighbor.add(j > 0 ? grid[i][j - 1] : 0);
					neighbor.add(j < n - 1 ? grid[i][j + 1] : 0);

					int currSum = 1;
					for (int color : neighbor)
						currSum += areaMap.get(color);

					res = Math.max(res, currSum);
				}
			}
		}

		return res;
	}

	private int findIslandArea(int[][] grid, int x, int y, int islandIdx) {
		if (x < 0 || x >= grid.length || y < 0 || y >= grid.length || grid[x][y] != 1)
			return 0;
		grid[x][y] = islandIdx;

		return 1 + findIslandArea(grid, x + 1, y, islandIdx) + findIslandArea(grid, x, y + 1, islandIdx)
				+ findIslandArea(grid, x - 1, y, islandIdx) + findIslandArea(grid, x, y - 1, islandIdx);
	}
}
