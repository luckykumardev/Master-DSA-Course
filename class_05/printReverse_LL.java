package class_05;


public class printReverse_LL {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node newNode1 = new Node(2);
		Node newNode2 = new Node(3);
	
		head.next = newNode1;
		newNode1.next = newNode2;
	
		printReverse(head);

	}

	private static void printReverse(Node head) {
		if(head == null) return;
		
		printReverse(head.next);
		System.out.print(head.data+ " ");
	}
}
