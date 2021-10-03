package class_04;

/*
 * https://practice.geeksforgeeks.org/problems/linked-list-insertion/1#
 */
public class LinkedListInsertion {

	Node insertAtBeginning(Node head, int x) {
		Node new_head = new Node(x);
		new_head.next = head;
		return new_head;
	}

	Node insertAtEnd(Node head, int x) {

		Node temp = head;
		while (temp != null && temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(x);
		if (temp == null)
			return newNode;
		temp.next = newNode;

		return head;
	}
}
