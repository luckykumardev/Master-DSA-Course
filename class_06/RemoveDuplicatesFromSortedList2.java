package class_06;

public class RemoveDuplicatesFromSortedList2 {
	public Node deleteDuplicates(Node head) {
		Node dummy = new Node(-1);
		Node curr = head;
		Node temp = dummy;
		temp.next = curr;
		while (curr != null) {
			while (curr.next != null && curr.data == curr.next.data) {
				curr = curr.next;
			}
			if (temp.next != curr) {
				temp.next = curr.next;
				curr = temp.next;
			} else {
				temp = temp.next;
				curr = curr.next;
			}

		}
		return dummy.next;
	}
}
