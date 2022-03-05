package class_45;

import java.util.Arrays;
import java.util.Comparator;

/*
 https://leetcode.com/problems/russian-doll-envelopes/
*/
public class RussianDollEnvelopes {

	public int maxEnvelopes(int[][] envelopes) {
		Arrays.sort(envelopes, new Comparator<int[]>() {
			public int compare(int a1[], int a2[]) {
				if (a1[0] > a2[0])
					return 1;
				else if (a1[0] == a2[0]) {
					if (a1[1] > a2[1])
						return 1;
					return -1;
				}
				return -1;
			}
		});

		int dp[][] = new int[envelopes.length][envelopes.length];
		return rec(-1, 0, envelopes, dp);
	}

	private static int rec(int prev, int curr, int nums[][], int dp[][]) {
		if (curr == nums.length)
			return 0;

		if (prev != -1 && dp[prev][curr] != 0)
			return dp[prev][curr];

		int op1 = 0;
		if (prev == -1 || (nums[prev][0] < nums[curr][0] && nums[prev][1] < nums[curr][1])) {
			op1 = 1 + rec(curr, curr + 1, nums, dp);
		}
		int op2 = rec(prev, curr + 1, nums, dp);

		if (prev != -1)
			dp[prev][curr] = Math.max(op1, op2);
		return Math.max(op1, op2);
	}
}