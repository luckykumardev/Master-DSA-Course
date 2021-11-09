package class_18;

/*
 https://leetcode.com/problems/binary-tree-tilt/
*/
public class BinaryTreeTilt {

	int tilt = 0;
	public int findTilt(Node root) {
		if (root == null)
			return 0;
		helper(root);
		return tilt;
	}

	private int helper(Node root) {
		if (root == null)
			return 0;
		
		int nodes_sum_left = helper(root.left);
		int nodes_sum_right = helper(root.right);
		tilt += Math.abs(nodes_sum_left - nodes_sum_right);
		return root.val + nodes_sum_left + nodes_sum_right;
	}
}
