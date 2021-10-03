package class_04;

/*
  https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicateFromSortedLL {
	public Node deleteDuplicates(Node head) {
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}

		return head;
	}
}
