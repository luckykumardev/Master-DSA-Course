package class_36;
/*
 * https://leetcode.com/problems/n-queens-ii/
 */	
import java.util.ArrayList;
import java.util.List;

public class N_Queen_2 {
	
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> res = new ArrayList<>();
		int arr[][] = new int[n][n];
		backtrack(arr, 0, n, res);
		return res;
	}

	private static void backtrack(int arr[][], int r, int n, List<List<String>> res) {
		if (r == n) {
			// found one possbile answer add to 2d List
			List<String> curr = toString(arr);
			res.add(curr);
			return;
		}

		// trying to place queen on appropriate column
		for (int c = 0; c < n; c++) {
			if (isSafe(arr, r, c)) {
				arr[r][c] = 1;
				backtrack(arr, r + 1, n, res);
				arr[r][c] = 0;
			}
		}
	}

	private static List<String> toString(int arr[][]) {
		List<String> curr = new ArrayList<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1)
					s += "Q";
				else
					s += ".";
			}
			curr.add(s);
		}
		return curr;
	}

	private static boolean isSafe(int arr[][], int curr_r, int curr_c) {
		int n = arr.length;
		// row check
		for (int i = 0; i < n; i++) {
			if (arr[i][curr_c] == 1)
				return false;
		}

		// col check
		for (int i = 0; i < n; i++) {
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