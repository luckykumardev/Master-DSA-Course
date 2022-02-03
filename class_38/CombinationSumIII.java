package class_38;

import java.util.ArrayList;
import java.util.List;

/*
  https://leetcode.com/problems/combination-sum-iii/	
*/
public class CombinationSumIII {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> res = new ArrayList<>();
		backtrack(res, 1, n, k, new ArrayList<>());
		return res;
	}

	private static void backtrack(List<List<Integer>> res, int s, int n, int k, List<Integer> curr) {
		if (n < 0 || k < 0)
			return;

		if (n == 0 && k == 0) {
			res.add(new ArrayList<>(curr));
			return;
		}

		for (int i = s; i <= 9; i++) {
			curr.add(i);
			backtrack(res, i + 1, n - i, k - 1, curr);
			curr.remove(curr.size() - 1);
		}

	}
}
