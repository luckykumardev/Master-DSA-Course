package class_04;

public class oddEvenList {
	public Node oddEvenList_(Node head) {
		Node first = new Node(-1);
		Node second = new Node(-1);
		Node ptr1 = first;
		Node ptr2 = second;

		int count = 0;

		while (head != null) {
			if (count % 2 == 0) {
				ptr1.next = head;
				head = head.next;
				ptr1 = ptr1.next;
				ptr1.next = null;
			} else {
				ptr2.next = head;
				head = head.next;
				ptr2 = ptr2.next;
				ptr2.next = null;
			}
			count++;
		}
		ptr1.next = second.next;
		return first.next;
	}

}
