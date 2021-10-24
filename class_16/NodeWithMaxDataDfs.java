package class_16;

import java.util.List;

import class_15.TreeNode;

public class NodeWithMaxDataDfs {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(100);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);

		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(node4);

		int max_node = numberOfNodeDFS(root);
		System.out.println(max_node);
	}

	private static int numberOfNodeDFS(TreeNode root) {
		if (root == null)
			return Integer.MIN_VALUE;
		List<TreeNode> children = root.children;
		int ans = root.data;
		int size = children.size();
		for (int i = 0; i < size; i++) {
			int temp_ans=  numberOfNodeDFS(children.get(i));
		    ans=Math.max(ans, temp_ans);
		}

		return ans;
	}
}
