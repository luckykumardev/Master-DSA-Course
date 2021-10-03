package class_06;

/*
 * https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1
 */
public class ImplementStackUsingLinkedList {
	
	Node top;
	void push(int a) {
		Node newNode = new Node(a);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	int pop() {
		if (top != null) {
			int ans = top.data;
			top = top.next;
			return ans;
		} else {
			return -1;
		}
	}
}
