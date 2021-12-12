package class_22;

import java.util.ArrayList;

public class BalanceABinarySearchTree {

	public TreeNode balanceBST(TreeNode root) {
		ArrayList<TreeNode> al = new ArrayList<>();
		inorder(root, al);
		return BalancedBST(0, al.size() - 1, al);
	}

	public void inorder(TreeNode node, ArrayList<TreeNode> al) {
		if (node == null)
			return;
		inorder(node.left, al);
		al.add(node);
		inorder(node.right, al);
	}

	public TreeNode BalancedBST(int left, int right, ArrayList<TreeNode> al) {
		if (right < left)
			return null;
		int x = (int) ((left + right) / 2);
		TreeNode node = new TreeNode(al.get(x).val);
		node.left = BalancedBST(left, x - 1, al);
		node.right = BalancedBST(x + 1, right, al);
		return node;
	}
}
