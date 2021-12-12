package class_21;

/*
 https://leetcode.com/problems/convert-bst-to-greater-tree/
*/
public class ConvertBSTToGreaterTree {
	public TreeNode convertBST(TreeNode root) {
		int rsum[] = {0};
		convertBSTHelper(root, rsum);
		return root;
	}

	public static void convertBSTHelper(TreeNode root, int rsum[]) {

		if (root == null) {
			return;
		}
		convertBSTHelper(root.right, rsum);
		root.val = root.val + rsum[0];
		rsum[0] = root.val;
		convertBSTHelper(root.left, rsum);
	}
}
