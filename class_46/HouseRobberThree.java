package class_46;

import java.util.HashMap;

/*
 https://leetcode.com/problems/house-robber-iii/	
*/


  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class HouseRobberThree {

	public int rob(TreeNode root) {
	
		if (root == null)
			return 0;
		int op1 = root.val + rec(root.left, false) + rec(root.right, false);
		int op2 = rec(root.left, true) + rec(root.right, true);

		return Math.max(op1, op2);
	}

	private static int rec(TreeNode root, boolean canRobThisHouse) {
		if (root == null)
			return 0;
		int op1 = 0;
		int op2 = 0;
		if (canRobThisHouse == false) {
			op2 = rec(root.left, true) + rec(root.right, true);
		} else {
			op1 = root.val + rec(root.left, false) + rec(root.right, false);
			op2 = rec(root.left, true) + rec(root.right, true);
		}

		return Math.max(op1, op2);
	}
}
