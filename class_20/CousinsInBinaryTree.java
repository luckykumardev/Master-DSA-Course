package class_20;

import java.util.LinkedList;
import java.util.Queue;


public class CousinsInBinaryTree {
	  public boolean isCousins(Node root, int A, int B) {
		    if (root == null) return false;
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				int size = queue.size();
				boolean isAexist = false;		
				boolean isBexist = false;		
				for (int i = 0; i < size; i++) {
					Node cur = queue.poll();
		            if (cur.val == A) isAexist = true;
		            if (cur.val == B) isBexist = true;
					if (cur.left != null && cur.right != null) { 
						if (cur.left.val == A && cur.right.val == B) { 
							return false;
						}
						if (cur.left.val == B && cur.right.val == A) { 
							return false;
						}
					}
					if (cur.left != null) {
						queue.add(cur.left);
					}
					if (cur.right != null) {
						queue.add(cur.right);
					}
				}
				if (isAexist && isBexist)  return true;
			}
			return false;
		}
}
