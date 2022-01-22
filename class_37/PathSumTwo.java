package class_37;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/path-sum-ii/
 */
public class PathSumTwo {
	public class TreeNode {
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

	List<List<Integer>> res;

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		res = new ArrayList<>();
		if (root == null)
			return res;
		ArrayList<Integer> curr = new ArrayList<>();
		helper(root, curr, sum, 0);
		return res;
	}

	private void helper(TreeNode root, ArrayList<Integer> curr, int total, int sum) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			if (total == sum + root.val) {
				curr.add(root.val);
				res.add(new ArrayList<>(curr));
				curr.remove(curr.size() - 1);
			}
			return;
		}

		curr.add(root.val);
		helper(root.left, curr, total, sum + root.val);
		curr.remove(curr.size() - 1);

		curr.add(root.val);
		helper(root.right, curr, total, sum + root.val);
		curr.remove(curr.size() - 1);
	}
}
