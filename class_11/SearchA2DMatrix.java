package class_11;

public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {

		if (matrix.length == 0)
			return false;
		int l = 0;
		int r = matrix.length * matrix[0].length - 1;

		while (l <= r) {
			int m = (l + r) / 2;
			int mrow = m / matrix[0].length;
			int mcol = m % matrix[0].length;
			if (matrix[mrow][mcol] == target)
				return true;
			else if (matrix[mrow][mcol] > target) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}

		return false;
	}
}
