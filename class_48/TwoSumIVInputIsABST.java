package class_48;

import java.util.ArrayList;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

/*
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class TwoSumIVInputIsABST {
	public boolean findTarget(TreeNode root, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		helper(root, list);

		int l = 0;
		int r = list.size() - 1;
		while (l < r) {
			int lv = list.get(l);
			int rv = list.get(r);
			if (lv + rv == k)
				return true;
			else if (lv + rv > k)
				r--;
			else
				l++;
		}
		return false;
	}

	private static void helper(TreeNode root, ArrayList<Integer> list) {
		if (root == null)
			return;

		helper(root.left, list);
		list.add(root.val);
		helper(root.right, list);
	}
}
