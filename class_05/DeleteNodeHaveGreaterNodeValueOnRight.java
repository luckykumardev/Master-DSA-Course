package class_05;

/*
  https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
*/

public class DeleteNodeHaveGreaterNodeValueOnRight {

	Node compute(Node head) {
		if (head == null || head.next == null)
			return head;
		Node rL = reverseList(head);
		Node temp = rL;
		int max = rL.data;
		while (temp != null && temp.next != null) {
			while (temp != null && temp.next != null && temp.next.data < max) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
			if (temp != null)
				max = Math.max(max, temp.data);
		}
		Node newHead = reverseList(rL);
		return newHead;
	}

	public Node reverseList(Node head) {
		if (head == null || head.next == null)
			return head;
		Node prev = null;
		Node curr = head;
		Node n = head.next;
		while (n != null) {
			curr.next = prev;
			prev = curr;
			curr = n;
			n = n.next;
		}
		curr.next = prev;
		return curr;
	}
}
