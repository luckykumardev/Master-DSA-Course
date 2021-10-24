package class_16;

import java.util.List;

import class_15.TreeNode;

public class CountLeafNodeDfs {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(100);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(node4);
		node1.children.add(node5);

		int leaf_count = countLeafDFS(root);
		System.out.println(leaf_count);
	}

	private static int countLeafDFS(TreeNode root) {
		if (root == null)
			return 0;
		if(root.children.size() == 0)
			return 1;
		
		List<TreeNode> children = root.children;
		int count =0;
		int size = children.size();
		for (int i = 0; i < size; i++) {
			count += countLeafDFS(children.get(i));
		}
		
		return count;
	}
}
