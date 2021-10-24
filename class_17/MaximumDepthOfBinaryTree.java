package class_17;

import class_16.Node;

public class MaximumDepthOfBinaryTree {

	public int maxDepth(Node root) {
		if (root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
