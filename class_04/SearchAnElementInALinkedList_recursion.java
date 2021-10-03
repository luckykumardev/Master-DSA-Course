package class_04;

public class SearchAnElementInALinkedList_recursion {
	public static boolean search(Node head, int x) {
		if (head == null)
			return false;

		if (head.data == x)
			return true;

		return search(head.next, x);
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node newNode = new Node(2);
		head.next = newNode;

		if (search(head, 1))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
