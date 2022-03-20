package class_51;
/*
 https://leetcode.com/problems/find-bottom-left-tree-value/
*/

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

public class FindBottomLeftNode {
	int maxDepth = 0;
	int val = 0;

	private void dfs(TreeNode root, int depth) {
		if (root != null) {
			if (depth > maxDepth) {
				val = root.val;
				maxDepth = depth;
			}
			dfs(root.left, depth + 1);
			dfs(root.right, depth + 1);
		}
	}

	public int findBottomLeftValue(TreeNode root) {
		dfs(root, 1);
		return val;
	}
}
