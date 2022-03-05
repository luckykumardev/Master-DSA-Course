package class_47;

/*
 https://leetcode.com/problems/burst-balloons/
*/
public class BurstBalloons {
	public int maxCoins(int[] nums) {
		int n = nums.length;
		int temp[] = new int[n + 2];
		temp[0] = 1;
		temp[n + 1] = 1;
		for (int i = 1; i <= n; i++)
			temp[i] = nums[i - 1];

		int ans = rec(temp, 1, n + 1);
		return ans;
	}

	private static int rec(int arr[], int s, int e) {
		if (s >= e)
			return 0;

		int max = Integer.MIN_VALUE;
		for (int i = s; i < e; i++) {
			int profit = rec(arr, s, i) + rec(arr, i + 1, e) + arr[s - 1] * arr[i] * arr[e];
			max = Math.max(max, profit);
		}
		return max;
	}
}
