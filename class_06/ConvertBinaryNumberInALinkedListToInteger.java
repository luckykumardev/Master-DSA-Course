package class_06;

/*
  https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer
*/

public class ConvertBinaryNumberInALinkedListToInteger {
	public int getDecimalValue(Node head) {
		Node newHead = reverseList(head);
		int p = 0;
		int ans = 0;
		while (newHead != null) {
			ans += newHead.data * Math.pow(2, p);
			p++;
			newHead = newHead.next;
		}
		return ans;
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