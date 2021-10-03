package class_06;

/*
  https://leetcode.com/problems/swap-nodes-in-pairs/submissions/
*/
public class PairwiseSwapElementsOfALinkedList {
	public Node swapPairs(Node head) {
		Node dummy = new Node(-1);
		Node prev = dummy;
		Node curr = head;
		dummy.next = head;
		while (curr != null && curr.next != null) {
			prev.next = curr.next;
			curr.next = curr.next.next;
			prev.next.next = curr;
			prev = prev.next.next;
			curr = curr.next;
		}
		return dummy.next;
	}
}
