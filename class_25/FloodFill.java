package class_25;

/*
 https://leetcode.com/problems/flood-fill/submissions/
*/
public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		if (image[sr][sc] == newColor) {
			return image;
		}
		DFS(image, sr, sc, image[sr][sc], newColor);
		return image;
	}

	private static void DFS(int image[][], int i, int j, int targetColor, int newColor) {
		int r = image.length;
		int c = image[0].length;

		if (i < 0 || i >= r || j < 0 || j >= c || image[i][j] != targetColor)
			return;

		image[i][j] = newColor;
		DFS(image, i + 1, j, targetColor, newColor);
		DFS(image, i, j + 1, targetColor, newColor);
		DFS(image, i - 1, j, targetColor, newColor);
		DFS(image, i, j - 1, targetColor, newColor);

	}

}
