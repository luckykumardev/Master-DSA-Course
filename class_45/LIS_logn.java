package class_45;

public class LIS_logn {
	public int lengthOfLIS(int[] nums) {
		int n = nums.length;
		if (nums == null || n == 0)
			return 0;
		int dp[] = new int[n + 1];
		dp[0] = nums[0];
		int idx = 0;
		for (int i = 1; i < n; i++) {
			if (nums[i] > dp[idx]) {
				dp[++idx] = nums[i];
			} else {
				int index = BS(dp, nums[i], idx);
				dp[index] = nums[i];
			}
		}
		return idx + 1;
	}

	private static int BS(int dp[], int x, int len) {
		int l = 0;
		int r = len;
		while (l <= r) {
			int m = (l + r) / 2;
			if (dp[m] == x)
				return m;
			else if (dp[m] < x) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return l;
	}
}
