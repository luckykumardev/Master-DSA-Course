package class_07;

/*
 https://leetcode.com/problems/partition-list/
*/
public class PartitionList {
	public Node partition(Node head, int x) {

		Node dummy1 = new Node(-1);
		Node dummy2 = new Node(-1);

		Node tail1 = dummy1;
		Node tail2 = dummy2;

		Node temp = head;
		while (temp != null) {
			if (temp.data < x) {
				tail1.next = temp;
				tail1 = tail1.next;
			} else {
				tail2.next = temp;
				tail2 = tail2.next;
			}
			temp = temp.next;
		}
		tail2.next = null;
		tail1.next = dummy2.next;
		return dummy1.next;
	}
}
