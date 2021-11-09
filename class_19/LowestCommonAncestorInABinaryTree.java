package class_19;
/*
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/
 */	
public class LowestCommonAncestorInABinaryTree {
	 public Node lowestCommonAncestor(Node root, Node p, Node q) {
		 Node ans = helper(root, p, q);
	     return ans;
	    }
	    
	    public Node helper(Node root, Node p, Node q){
	        if(root == null) return null;
	        if(root == p) return p;
	        if(root == q) return q;
	        
	        Node left =  helper(root.left, p, q);
	        Node right = helper(root.right, p, q);
	      
	        if(left == null && right == null) return null;
	        if(left != null && right == null) return left;
	        if(left == null && right != null) return right;
	        
	        return root;
	    }

}
