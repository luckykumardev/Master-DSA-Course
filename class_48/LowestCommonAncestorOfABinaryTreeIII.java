package class_48;
/*
 https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-iii/
*/
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
}

public class LowestCommonAncestorOfABinaryTreeIII {

	public Node lowestCommonAncestor(Node p, Node q) {

		int pH = 0;
		int qH = 0;
		Node pTemp = p;
		Node qTemp = q;
		while (pTemp != null) {
			pH++;
			pTemp = pTemp.parent;
		}

		while (qTemp != null) {
			qH++;
			qTemp = qTemp.parent;
		}

		while (qH != pH) {
			if (pH > qH) {
				pH--;
				p = p.parent;
			} else {
				qH--;
				q = q.parent;
			}
		}

		while (p != null && q != null && p != q) {
			q = q.parent;
			p = p.parent;
		}
		return p;
	}
}
