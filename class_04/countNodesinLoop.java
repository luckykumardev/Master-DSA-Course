package class_04;

public class countNodesinLoop {
	static int countLengthOfLoop(Node head) {
		if (head == null)
			return 0;
		Node fp = head;
		Node sp = head;
		while (fp.next != null && fp.next.next != null) {
			fp = fp.next.next;
			sp = sp.next;
			if (sp == fp) {
				int c = 1;
				sp = sp.next;
				while (sp != fp) {
					sp = sp.next;
					c++;
				}
				return c;
			}
		}
		return 0;
	}
}
