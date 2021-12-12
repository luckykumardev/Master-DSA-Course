package class_21;

public class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		while (root != null) {
			int min = Math.min(p.val, q.val);
			int max = Math.max(p.val, q.val);
			if (root.val < min)
				root = root.right;
			else if (root.val > max)
				root = root.left;
			else
				return root;
		}

		return root;
	}
}
