package class_04;

/*
  https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
*/
public class FindingMiddleElementInALinkedList {
	int getMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}
}
