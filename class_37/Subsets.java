package class_37;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/subsets/
*/
public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int i) {
		if (i == nums.length) {
			list.add(new ArrayList<>(tempList));
			return;
		}

		tempList.add(nums[i]);
		backtrack(list, tempList, nums, i + 1);
		tempList.remove(tempList.size() - 1);

		backtrack(list, tempList, nums, i + 1);

	}
}
