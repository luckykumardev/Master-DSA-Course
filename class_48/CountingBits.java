package class_48;
/*
 https://leetcode.com/problems/counting-bits/
*/
public class CountingBits {
	public int[] countBits(int num) {
		int[] ans = new int[num + 1];
		for (int i = 0; i <= num; i++)
			ans[i] = rec(i, ans);

		return ans;
	}

	private static int rec(int num, int memo[]) {
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		if (memo[num] != 0)
			return memo[num];

		int x  = rec(num / 2, memo);
		if (num % 2 == 0) {
			memo[num] = x;
			return x;
		} else {
			memo[num] = 1 + x;
			return 1 + x;
		}
	}
}