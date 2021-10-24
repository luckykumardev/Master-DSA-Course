package class_13;

public class ReverseLinkedListRecursive {
	public Node reverseList(Node head) {
		return reverseList(null, head);
	}

	public Node reverseList(Node prev, Node node) {
		if (node == null) {
			return prev;
		}

		Node aux = node.next;
		node.next = prev;

		return reverseList(node, aux);
	}
}
