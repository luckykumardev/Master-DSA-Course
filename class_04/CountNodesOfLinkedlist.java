package class_04;

/*
 * https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
*/
public class CountNodesOfLinkedlist {
	public static int getCount(Node head) {
		int ans = 0;
		if (head == null)
			return 0;
		while (head != null) {
			ans++;
			head = head.next;
		}
		return ans;
	}
}
