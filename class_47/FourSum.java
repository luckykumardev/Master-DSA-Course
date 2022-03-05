package class_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 https://leetcode.com/problems/4sum
*/
public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < n - 3; i++) {
			for (int j = i + 1; j < n - 2; j++) {
				int l = j + 1;
				int r = n - 1;
				while (l < r) {
					int sum = nums[i] + nums[j] + nums[l] + nums[r];
					if (sum == target) {
						List<Integer> curr = new ArrayList<>();
						curr.add(nums[i]);
						curr.add(nums[j]);
						curr.add(nums[l]);
						curr.add(nums[r]);
						res.add(curr);
						
						--r;
						++l;

						while (i < n - 3 && nums[i] == nums[i + 1])
							i++;
						while (j < n - 2 && nums[j] == nums[j + 1])
							j++;
						while (l < r && nums[l] == nums[l - 1])
							l++;
						while (l < r && nums[r] == nums[r + 1])
							r--;

					} else if (sum < target) {
						l++;
					} else {
						r--;
					}
				}
			}
		}
		return res;
	}
}