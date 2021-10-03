package class_06;

/*
  https://practice.geeksforgeeks.org/problems/implement-queue-using-linked-list/1
*/
public class ImplementQueueUsingLinkedList {
	Node front, rear;

	void push(int a) {
		Node newNode = new Node(a);
		if (rear == null || front == null) {
			rear = newNode;
			front = newNode;
		} else {
			rear.next = newNode;
			rear = rear.next;
		}
	}

	int pop() {
		int data = -1;
		if (front == null)
			return data;
		else {
			data = front.data;
			front = front.next;
		}
		return data;
	}
}
