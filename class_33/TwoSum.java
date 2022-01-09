package class_33;

import java.util.HashMap;

/*
 https://leetcode.com/problems/two-sum/
*/
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int ans[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(target - nums[i])) {
				ans[0] = i;
				ans[1] = hm.get(target - nums[i]);
				break;
			}
			hm.put(nums[i], i);
		}

		return ans;
	}
}
