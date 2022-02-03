package class_40;

import java.util.HashMap;
import java.util.Map;

/*
 https://leetcode.com/problems/partition-equal-subset-sum/
*/
public class EqualSumPartition {
	public boolean canPartition(int[] nums) {
		int n = nums.length;
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += nums[i];

		if (sum % 2 != 0)
			return false;
		Map<String, Boolean> memo = new HashMap<>();
		return isSubsetSumHelper(nums, sum / 2, 0, memo);

	}

	public static Boolean isSubsetSumHelper(int arr[], int sum, int i, Map<String, Boolean> hm) {

		if (sum == 0)
			return true;
		if (i == arr.length)
			return false;

		String key = sum + "#" + i;
		if (hm.containsKey(key))
			return hm.get(key);

		if (arr[i] > sum) {
			boolean op = isSubsetSumHelper(arr, sum, i + 1, hm);
			hm.put(key, op);
			return op;
		} else {
			boolean op1 = isSubsetSumHelper(arr, sum - arr[i], i + 1, hm);
			boolean op2 = isSubsetSumHelper(arr, sum, i + 1, hm);
			hm.put(key, op2 || op1);
			return op2 || op1;
		}
	}

}
