package class_41;

/*
 https://practice.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1/
*/
public class UnboundedKnapsack {

	static int arr[][];

	static int knapSack(int N, int W, int val[], int wt[]) {
		int ans = helper(N, W, val, wt, 0);
		return ans;
	}

	static int helper(int n, int W, int val[], int wt[], int i) {
		if (i == n) {
			return 0;
		}
		if (arr[i][W] != 0) {
			return arr[i][W];
		}
		if (W >= wt[i]) {
			int op1 = val[i] + helper(n, W - wt[i], val, wt, i);
			int op2 = helper(n, W, val, wt, i + 1);
			return Math.max(op1, op2);
		} else {
			int op2 = helper(n, W, val, wt, i + 1);
			return op2;
		}
	}
}
