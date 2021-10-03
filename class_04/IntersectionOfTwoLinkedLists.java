package class_04;

public class IntersectionOfTwoLinkedLists {
	public Node getIntersectionNode(Node headA, Node headB) {

		Node tempA = headA;
		Node tempB = headB;
		int l1 = 0;
		int l2 = 0;
		while (tempA != null) {
			l1++;
			tempA = tempA.next;
		}

		while (tempB != null) {
			l2++;
			tempB = tempB.next;
		}

		int diff = Math.abs(l1 - l2);
		if (l1 > l2) {
			while (diff-- > 0) {
				headA = headA.next;
			}
		} else {
			while (diff-- > 0) {
				headB = headB.next;
			}
		}

		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
}
