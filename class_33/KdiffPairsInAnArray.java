package class_33;

import java.util.HashMap;

/*
 https://leetcode.com/problems/k-diff-pairs-in-an-array/
*/
public class KdiffPairsInAnArray {
	public int findPairs(int[] nums, int k) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int n = nums.length;
		if (k < 0)
			return 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
		}
		if (k == 0) {
			for (Integer key : hm.keySet()) {
				if (hm.get(key) >= 2)
					ans++;
			}

			return ans;
		}
		for (Integer key : hm.keySet()) {
			if (hm.containsKey(key + k))
				ans++;
		}

		return ans;

	}
}
