package class_17;

/*
 https://leetcode.com/problems/same-tree/
*/
public class SameTree {
	public boolean isSameTree(Node p, Node q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		if (p != null && q != null && (p.val != q.val))
			return false;

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}
}
