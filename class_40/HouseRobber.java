package class_40;
/*
 https://leetcode.com/problems/house-robber/
*/
public class HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 0 || (nums.length > 1 && nums[1] == 0 && nums[0] == 0))
			return 0;

		int memo[] = new int[nums.length];
		int ans = rec(nums, 0, memo);
		return ans;
	}

	private static int rec(int nums[], int i, int memo[]) {

		if (i >= nums.length)
			return 0;

		if (memo[i] != 0)
			return memo[i];

		int op1 = nums[i] + rec(nums, i + 2, memo);
		int op2 = rec(nums, i + 1, memo);

		memo[i] = Math.max(op1, op2);
		return Math.max(op1, op2);

	}
}
