package class_35;

import java.util.HashMap;

/*
 https://leetcode.com/problems/subarray-sum-equals-k/
*/
public class SubarraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(0, 1);
		int count = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (hm.containsKey(sum - k)) {
				count += hm.get(sum - k);
			}

			if (hm.containsKey(sum) == false)
				hm.put(sum, 0);

			hm.put(sum, hm.get(sum) + 1);
		}

		return count;
	}

}
