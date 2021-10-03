package class_04;

public class SearchAnElementInALinkedList {

	public static boolean search(Node head, int x) {
		Node current = head;
		while (current != null) {
			if (current.data == x)
				return true;
			current = current.next;
		}
		return false;
	}

	public static void main(String args[]) {

		Node head = new Node(1);
		Node newNode = new Node(2);
		head.next = newNode;

		if (search(head, 2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
