package class_36;
/*
 https://leetcode.com/problems/n-queens/
*/
public class N_Queen_1 {

	public static void main(String[] args) {
		int n = totalNQueens(4);
		System.out.println(n);
	}

	static int ans = 0;

	public static int totalNQueens(int n) {
		ans = 0;
		int arr[][] = new int[n][n];
		backtrack(arr, 0, n);
		return ans;
	}

	private static void backtrack(int arr[][], int r, int n) {
		if (r == n) {
			ans++;
			return;
		}

		// trying to place queen on appropriate column
		for (int c = 0; c < n; c++) {
			if (isSafe(arr, r, c)) {
				arr[r][c] = 1;
				backtrack(arr, r + 1, n);
				arr[r][c] = 0;
			}
		}
	}

	private static boolean isSafe(int arr[][], int curr_r, int curr_c) {
		int n = arr.length;
		

		// col check
		for (int i = 0; i < curr_c; i++) {
			if (arr[curr_r][i] == 1)
				return false;
		}

		// left to right diagonal check
		int temp_r = curr_r;
		int temp_c = curr_c;
		while (temp_r >= 0 && temp_c >= 0) {
			if (arr[temp_r][temp_c] == 1)
				return false;
			temp_r--;
			temp_c--;
		}

		temp_r = curr_r;
		temp_c = curr_c;
		while (temp_r >= 0 && temp_c < n) {
			if (arr[temp_r][temp_c] == 1)
				return false;
			temp_r--;
			temp_c++;
		}

		return true;
	}
}