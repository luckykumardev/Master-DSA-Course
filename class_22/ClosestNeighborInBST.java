package class_22;

/*
 https://practice.geeksforgeeks.org/problems/closest-neighbor-in-bst/1/
*/
public class ClosestNeighborInBST {
	public static int findMaxForN(Node node, int v) {

		if (node == null)
			return -1;
		int ans = -1;
		while (node != null) {
			if (node.data <= v) {
				ans = node.data;
				node = node.right;
			} else {
				node = node.left;
			}
		}

		return ans;
	}
}
