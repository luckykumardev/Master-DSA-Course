package class_18;

import java.util.LinkedList;
import java.util.Queue;

/*
 https://leetcode.com/problems/invert-binary-tree/
*/
public class InvertBinaryTree {
	 public Node invertTree(Node root) {
		    Queue<Node> queue = new LinkedList<>();
		    queue.add(root);
		    while (!queue.isEmpty()) {
		    	Node node = queue.poll();
		        if (node != null) {
		            queue.add(node.left);
		            queue.add(node.right);
		            Node tmp = node.left;
		            node.left = node.right;
		            node.right = tmp;
		        }
		    }
		    return root;
		}
	 
	 
/*	 
 * public Node invertTree(Node root) {
	        
	        if (root == null) {
	            return null;
	        }

	        Node left = root.left,
	                right = root.right;
	        root.left = invertTree(right);
	        root.right = invertTree(left);
	        return root;
	    }
*/
}
