package class_05;
/*
  https://leetcode.com/problems/merge-two-sorted-lists/
  https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
*/

public class mergeSortedLinkedList {
	Node sortedMerge(Node head1, Node head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		Node newHead = new Node(-1);

		Node temp1 = head1;
		Node temp2 = head2;
		Node temp3 = newHead;
		while (temp1 != null && temp2 != null) {
			if (temp1.data < temp2.data) {
				temp3.next = temp1;
				temp1 = temp1.next;
				temp3 = temp3.next;
			} else {
				temp3.next = temp2;
				temp2 = temp2.next;
				temp3 = temp3.next;
			}
		}

		if (temp1 == null)
			temp3.next = temp2;
		if (temp2 == null)
			temp3.next = temp1;

		return newHead.next;
	}
}
