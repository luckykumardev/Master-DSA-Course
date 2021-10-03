package class_05;

public class ReverseALinkedList_recursive {
	Node reverse(Node head) {
		if (head == null) {
			return head;
		}

		if (head.next == null) {
			return head;
		}

		Node newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;

		return newHead;
	}
}
