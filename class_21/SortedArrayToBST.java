package class_21;

/*
  https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
*/	
public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	private static TreeNode helper(int arr[], int s, int e) {
		if (s > e)
			return null;

		int m = (s + e) / 2;
		TreeNode root = new TreeNode(arr[m]);
		root.left = helper(arr, s, m - 1);
		root.right = helper(arr, m + 1, e);

		return root;
	}
}
