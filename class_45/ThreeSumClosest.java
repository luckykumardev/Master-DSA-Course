package class_45;

import java.util.Arrays;
/*
 https://leetcode.com/problems/3sum-closest/
*/	
public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length;
		int diff = Integer.MAX_VALUE;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int s = i + 1;
			int e = n - 1;
			while (s < e) {
				int sum = nums[i] + nums[s] + nums[e];
				if (diff > Math.abs(sum - target)) {
					diff = Math.abs(sum - target);
					ans = sum;
				}

				if (sum > target)
					e--;
				else
					s++;
			}
		}

		return ans;
	}
}
