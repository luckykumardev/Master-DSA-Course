package class_38;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/combination-sum/
*/
public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		backtrack(candidates, target, res, 0, new ArrayList<>());
		return res;
	}

	private static void backtrack(int arr[], int target, List<List<Integer>> res, int i, List<Integer> curr) {
		if (target == 0) {
			// System.out.println(curr);
			res.add(new ArrayList<>(curr));
			return;
		}
		if (target < 0) {
			// System.out.println(curr);
			return;
		}
	
		for (int j = i; j < arr.length; j++) {
			curr.add(arr[j]);
			backtrack(arr, target - arr[j], res, j, curr);
			curr.remove(curr.size() - 1);
		}
	}
}