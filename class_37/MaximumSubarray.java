package class_37;
/*
 https://leetcode.com/problems/maximum-subarray/
 kadane's algorithm
*/

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int ans = Integer.MIN_VALUE;
		int tempAns = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			tempAns += x;
			if (tempAns < x) {
				tempAns = x;
			}
			ans = Math.max(ans, tempAns);
		}
    	return ans;
	}
}
