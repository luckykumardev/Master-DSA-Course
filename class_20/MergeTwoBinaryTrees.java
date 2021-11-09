package class_20;

/*
 https://leetcode.com/problems/merge-two-binary-trees/
*/
public class MergeTwoBinaryTrees {
	  public Node mergeTrees(Node t1, Node t2) {
	        if(t1 == null && t2 == null) return null;
	        if(t1 == null && t2 != null) return t2;
	        if(t1 != null && t2 == null) return t1;
	       
	        Node root = new Node(t1.val + t2.val);
	        root.left = mergeTrees(t1.left, t2.left);
	        root.right = mergeTrees(t1.right, t2.right);
	    
	        return root;
	    }
}
