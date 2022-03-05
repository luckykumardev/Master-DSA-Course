package class_44;

/*
 https://leetcode.com/problems/wiggle-subsequence/
*/
public class WiggleSubsequence {
	public int wiggleMaxLength(int[] nums) {
		int ans = Math.max(rec(nums, -1, 0, true), rec(nums, -1, 0, false));
		return ans;
	}

	private static int rec(int nums[], int prev, int curr, boolean isAsc) {

		if (curr == nums.length)
			return 0;

		int op1 = 0;
		if (isAsc == true) {
			if (prev == -1 || nums[prev] < nums[curr])
				op1 = 1 + rec(nums, curr, curr + 1, !isAsc);
		} else {
			if (prev == -1 || nums[prev] > nums[curr])
				op1 = 1 + rec(nums, curr, curr + 1, !isAsc);
		}

		int op2 = rec(nums, prev, curr + 1, isAsc);

		return Math.max(op1, op2);
	}
}
