package class_05;

/* 
 * https://leetcode.com/problems/reverse-linked-list/
 */

public class ReverseALinkedList {
	public Node reverseList(Node head) {
		if (head == null || head.next == null)
			return head;
		Node prev = null;
		Node curr = head;
		Node n = head.next;
		while (n != null) {
			curr.next = prev;
			prev = curr;
			curr = n;
			n = n.next;
		}
		curr.next = prev;
		return curr;
	}
}