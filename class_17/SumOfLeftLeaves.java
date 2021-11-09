package class_17;
/*
 https://leetcode.com/problems/sum-of-left-leaves/
*/
public class SumOfLeftLeaves {
	 public int sumOfLeftLeaves(Node root) {
	        
	        int ans  = helper(root);
	        return ans;
	    }
	    private int helper(Node root){
	        if(root == null)
	        	return 0;
	        if(isLeafNode(root.left)) 
	            return root.left.val + helper(root.right);
	       int op1 = helper(root.left);
	       int op2 = helper(root.right);
	        return op1 + op2;
	    }
	    
	    private boolean isLeafNode(Node root){
	        if(root == null) return false;
	        if(root.left == null && root.right == null)
	            return true;
	        
	        return false;
	    }
}
