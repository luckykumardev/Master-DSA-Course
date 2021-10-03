package class_04;

/*
 * https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
 */
public class NthNodeFromEndOfLinkedList {
	int getNthFromLast(Node head, int n) {
		int len = 0, last_idx = 0;
		Node temp = head, temp1 = head;
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		if (n > len)
			return -1;
		last_idx = len - n;
		while (last_idx-- > 0)
			temp1 = temp1.next;
		return temp1.data;
	}
}
