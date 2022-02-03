package class_38;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/combinations/
*/
public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<>();
		combineHelper(res, new ArrayList<>(), k, n, 1);

		return res;
	}

	private void combineHelper(List<List<Integer>> res, List<Integer> temp, int k, int n, int t) {
		if (t > n) {
			if (temp.size() == k)
				res.add(new ArrayList<>(temp));

			return;
		}

		temp.add(t);
		combineHelper(res, temp, k, n, t + 1);
		temp.remove(temp.size() - 1);

		combineHelper(res, temp, k, n, t + 1);
	}
}
